package users.util;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class WalletTest {
    static Wallet myWallet1, myWallet2, myWallet3;

    @BeforeAll
    static void setUp() {
        myWallet1 = new Wallet();
        myWallet2 = new Wallet(10.0f);
        myWallet3 = new Wallet("Google", 20.0f);
    }

    @Test
    void addCredit() {
        myWallet1.addCredit(12.0f);
    }

    @Test
    void getCredit() {
        myWallet1.getCredit(2.0f);
        myWallet2.getCredit(2000.0f);
    }

    @Test
    void getAllCredit() {
        float credit = myWallet1.getAllCredit();
        System.out.println(credit);
    }

    @Test
    void getBrand() {
        String walletName = myWallet1.getBrand();
        System.out.println(walletName);
    }

    @Test
    void setCredit() {
        myWallet1.setCredit(50.0f);
    }

    @Test
    void setBrand() {
        myWallet1.setBrand("Apple");
    }
}