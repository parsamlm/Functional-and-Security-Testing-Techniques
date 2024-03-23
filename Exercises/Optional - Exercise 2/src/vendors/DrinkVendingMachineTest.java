package vendors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import users.Person;
import users.util.Wallet;
import vendormachine.vendors.enums.BRANDS;

import static org.junit.jupiter.api.Assertions.*;

class DrinkVendingMachineTest {
    DrinkVendingMachine myDrinkVendingMachine;
    DrinkVendingMachine myDrinkVendingMachine1;

    @BeforeEach
    void setUp() {
        myDrinkVendingMachine = new DrinkVendingMachine();
        myDrinkVendingMachine1 = new DrinkVendingMachine(5.0f, BRANDS.CaramelSprinkle);
    }

    @Test
    void selectDrink() {
        Assertions.assertSame(DefaultSnacks.snackList[1], myDrinkVendingMachine1.selectDrink(1));
        Assertions.assertNull(myDrinkVendingMachine.selectDrink(1));
        Assertions.assertNull(myDrinkVendingMachine.selectDrink(-1));
    }

    @Test
    void giveCredit() {
        Person person = new Person("Parsa", new Wallet(5.0f));
        myDrinkVendingMachine.giveCredit(person, 5.0f);
        Assertions.assertSame(DefaultSnacks.snackList[1], myDrinkVendingMachine.selectDrink(1));
    }
}