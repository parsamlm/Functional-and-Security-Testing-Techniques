package users.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class WalletTest {
    static Wallet myWallet1, myWallet2, myWallet3;

    @BeforeEach
    void setUp() {
        myWallet1 = new Wallet();
        myWallet2 = new Wallet(10.0f);
        myWallet3 = new Wallet("Google", 20.0f);
    }

    @Test
    void addCredit() {
        myWallet1.addCredit(12.0f);
        Assertions.assertEquals(12.5f, myWallet1.getAllCredit());
    }

    @Test
    void getCredit() {
        Assertions.assertEquals(0.0f, myWallet2.getCredit(11.0f));
        Assertions.assertEquals(2.0f, myWallet3.getCredit(2.0f));
    }

    @Test
    void getAllCredit() {
        Assertions.assertEquals(0.5f, myWallet1.getAllCredit());
    }

    @Test
    void getBrand() {
        Assertions.assertEquals("Generic", myWallet1.getBrand());
        Assertions.assertEquals("Google", myWallet3.getBrand());
    }

    @Test
    void setCredit() {
        myWallet1.setCredit(10.0f);
        Assertions.assertEquals(10.0f, myWallet1.getAllCredit());
    }

    @Test
    void setBrand() {
        myWallet1.setBrand("Apple");
        Assertions.assertEquals("Apple", myWallet1.getBrand());
    }
}