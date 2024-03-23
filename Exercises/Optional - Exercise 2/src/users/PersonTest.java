package users;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import users.util.Wallet;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    static Person myFirstPerson;
    static Person mySecondPerson;
    static Wallet mySecondPersonWallet;

    @BeforeEach
    void setUp() {
        myFirstPerson = new Person("Parsa");
        mySecondPersonWallet = new Wallet("Generic", 100.0f);
        mySecondPerson = new Person("Parsa", mySecondPersonWallet);
    }

    @Test
    void getCredit() {
        assertEquals(0, myFirstPerson.getCredit(100));
        assertEquals(100, mySecondPerson.getCredit(100));
        assertEquals(0, mySecondPerson.getCredit(101));
    }

    @Test
    void addCredit() {
        mySecondPerson.addCredit(50.0f);
        assertEquals(150, mySecondPerson.getWallet().getAllCredit());
        myFirstPerson.addCredit(10.0f);
    }

    @Test
    void getName() {
        assertEquals("Parsa", myFirstPerson.getName());
    }

    @Test
    void getWallet() {
        assertNull(myFirstPerson.getWallet());
        assertEquals(mySecondPersonWallet, mySecondPerson.getWallet());
    }

    @Test
    void setName() {
        myFirstPerson.setName("Parsamlm");
        assertEquals("Parsamlm", myFirstPerson.getName());
    }

    @Test
    void setWallet() {
        Wallet myWallet = new Wallet("AnotherWalletBrand", 100.0f);
        myFirstPerson.setWallet(myWallet);
        assertEquals(myWallet, myFirstPerson.getWallet());
    }
}