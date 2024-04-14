package vendors.item;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import vendormachine.vendors.item.Snack;

import static org.junit.jupiter.api.Assertions.*;

class SnackTest {
    static vendormachine.vendors.item.Snack snack;
    ;

    @BeforeAll
    static void setUp() {
        snack = new Snack("Chips", 1.50f);
    }

    @Test
    void cost() {
        assertEquals(1.50f, snack.cost());
    }

    @Test
    void setValue() {
        snack.setValue(2.00f);
        assertEquals(2.00f, snack.cost());
    }
}