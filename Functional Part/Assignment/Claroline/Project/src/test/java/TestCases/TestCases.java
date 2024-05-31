package TestCases;

import TestCases.PO.HomePO;
import TestCases.PO.PlatformAdministrationPO;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.logging.Logger;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCases {

    @BeforeClass()
    public static void setup() {
    }

    private WebDriver driver;
    private HomePO _HomePO;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        _HomePO = new HomePO(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void a_doAddUser() {
        _HomePO.login("admin", "admin");
        PlatformAdministrationPO _PlatformAdministrationPO = _HomePO.goToPlatformAdministration();
        _PlatformAdministrationPO.addUser("Name001", "Firstname001", "user001", "password001", "password001");
        Assert.assertEquals("The new user has been sucessfully created", _PlatformAdministrationPO.getSuccessMessage());
        _HomePO.logout();
    }

    @Test
    public void b_doSearchUser() {
        _HomePO.login("admin", "admin");
        PlatformAdministrationPO _PlatformAdministrationPO = _HomePO.goToPlatformAdministration();
        _PlatformAdministrationPO.searchUser("user001");
        Assert.assertEquals("Name001", _PlatformAdministrationPO.getUserLastname());
        Assert.assertEquals("Firstname001", _PlatformAdministrationPO.getUserFirstname());
        Assert.assertEquals("User", _PlatformAdministrationPO.getUserStatus());
        _HomePO.logout();
    }

    @Test
    public void c_doLoginUser() {
        _HomePO.login("user001", "password001");
        Assert.assertEquals("Firstname001 Name001", _HomePO.getLoginInfo());
        _HomePO.logout();
    }

    @Test
    public void d_doAddCourse() {
        _HomePO.login("admin", "admin");
        PlatformAdministrationPO _PlatformAdministrationPO = _HomePO.goToPlatformAdministration();
        _PlatformAdministrationPO.addCourse("Course001", "001");
        Assert.assertEquals("You have just created the course website : 001", _PlatformAdministrationPO.getSuccessMessage());
        _PlatformAdministrationPO.clickOnTheContinueButton();
        _HomePO.logout();
    }

}
