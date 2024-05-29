package TestCases;

import TestCases.PO.LoginPO;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.HashMap;
import java.util.Map;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCases {

    @BeforeClass()
    public static void setup() {
    }

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void a_doLogin(){
        LoginPO _LoginPO = new LoginPO(driver);
        _LoginPO.doLogin("administrator", "root");
        Assert.assertEquals("Logged in as: administrator (administrator)", _LoginPO.getLoginInfo());
    }
}
