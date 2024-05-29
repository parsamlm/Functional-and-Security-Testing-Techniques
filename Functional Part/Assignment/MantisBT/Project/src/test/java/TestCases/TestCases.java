package TestCases;

import TestCases.PO.*;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCases {

    @BeforeClass()
    public static void setup() {
    }

    private WebDriver driver;
    private DashboardPO dashboardPO;
    private MenuComponentPO menuComponentPO;
    private MyUtils myUtils;
    private LoginPO _LoginPO;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        _LoginPO = new LoginPO(driver);
        dashboardPO = new DashboardPO(driver);
        menuComponentPO = dashboardPO.getMenuComponent();
        myUtils = new MyUtils(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void a_doLogin() {
        _LoginPO.doLogin("administrator", "root");
        Assert.assertEquals("Logged in as: administrator (administrator)", myUtils.getLoginInfo());
    }

    @Test
    public void b_doAddNewUser() {
        _LoginPO.doLogin("administrator", "root");
        ManageComponentPO _ManageComponentPO = menuComponentPO.goToManage();
        ManageUsersPO _ManageUsersPO = _ManageComponentPO.goToManageUsers();
        _ManageUsersPO.addNewUser("username001", "username001", "username@username.it", UserAccessLevel.UPDATER);
        Assert.assertEquals("username001", _ManageUsersPO.getNewUserName());
        Assert.assertEquals("username001", _ManageUsersPO.getRealName());
        Assert.assertEquals("username@username.it", _ManageUsersPO.getEmail());
        Assert.assertEquals("updater", _ManageUsersPO.getAccessLevel());
        dashboardPO.doLogout();
    }
}
