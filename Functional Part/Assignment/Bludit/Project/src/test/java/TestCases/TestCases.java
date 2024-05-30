package TestCases;

import TestCases.PO.DashboardPO;
import TestCases.PO.loginPO;
import org.junit.*;
// Generated by Selenium IDE

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCases {

    @BeforeClass()
    public static void setup() {
    }

    private WebDriver driver;

    private Map<String, Object> vars;

    private JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void a_addContent() {
        loginPO _loginPO = new loginPO(driver, js, vars);
        _loginPO.doLogin("admin", "password");
        DashboardPO _DashboardPO = new DashboardPO(driver, js, vars);
        _DashboardPO.doAddContent("Test Content");
        assert (_DashboardPO.set_LINKTEXT_TestContent().size() > 0);
        _DashboardPO.doLogout();
    }

    @Test
    public void b_changeUrl() {
        loginPO _loginPO = new loginPO(driver, js, vars);
        _loginPO.doLogin("admin", "password");
        DashboardPO _DashboardPO = new DashboardPO(driver, js, vars);
        _DashboardPO.doChangeUrl("new-post-url");
        assert (_DashboardPO.set_LINKTEXT_new_post_url().size() > 0);
        _DashboardPO.doLogout();
    }

    @Test
    public void c_changePosition() {
        loginPO _loginPO = new loginPO(driver, js, vars);
        _loginPO.doLogin("admin", "password");
        DashboardPO _DashboardPO = new DashboardPO(driver, js, vars);
        _DashboardPO.doChangePosition("30");
        assertThat(_DashboardPO.set_ID_jsposition_1(), is("30"));
        _DashboardPO.doLogout_1();
    }

    @Test
    public void d_changeParent() {
        loginPO _loginPO = new loginPO(driver, js, vars);
        _loginPO.doLogin("admin", "password");
        DashboardPO _DashboardPO = new DashboardPO(driver, js, vars);
        _DashboardPO.doChangeParent("Create your own content");
        assertThat(_DashboardPO.set_ID_jsparent(), is("create-your-own-content"));
        _DashboardPO.doLogout_1();
    }

    @Test
    public void e_addAsDraft() {
        loginPO _loginPO = new loginPO(driver, js, vars);
        _loginPO.doLogin("admin", "password");
        DashboardPO _DashboardPO = new DashboardPO(driver, js, vars);
        _DashboardPO.doAddAsDraft("Draft Content");
        assert (_DashboardPO.set_LINKTEXT_DraftContent().size() > 0);
        _DashboardPO.doLogout();
    }

    @Test
    public void f_setStickyPost() {
        loginPO _loginPO = new loginPO(driver, js, vars);
        _loginPO.doLogin("admin", "password");
        DashboardPO _DashboardPO = new DashboardPO(driver, js, vars);
        _DashboardPO.doSetStickyPost("Sticky");
        assert (_DashboardPO.set_LINKTEXT_Setupyournewsite().size() > 0);
        _DashboardPO.doLogout();
    }

    @Test
    public void g_deleteContent() {
        loginPO _loginPO = new loginPO(driver, js, vars);
        _loginPO.doLogin("admin", "password");
        DashboardPO _DashboardPO = new DashboardPO(driver, js, vars);
        _DashboardPO.doDeleteContent();
        assertFalse(_DashboardPO.checkBluditLinkExists());
        _DashboardPO.doLogout();
    }

    @Test
    public void h_addUser() {
        loginPO _loginPO = new loginPO(driver, js, vars);
        _loginPO.doLogin("admin", "password");
        DashboardPO _DashboardPO = new DashboardPO(driver, js, vars);
        _DashboardPO.doAddUser("usertest", "usertest123", "usertest123", "Administrator", "user@test.com");
        assertThat(_DashboardPO.set_LINKTEXT_usertest_1(), is("usertest"));
        _DashboardPO.doLogout_1();
    }

    @Test
    public void i_changePassword() {
        loginPO _loginPO = new loginPO(driver, js, vars);
        _loginPO.doLogin("admin", "password");
        DashboardPO _DashboardPO = new DashboardPO(driver, js, vars);
        _DashboardPO.doChangePassword("newpassword", "newpassword");
        assert (_DashboardPO.set_ID_alert().size() > 0);
        _DashboardPO.doLogout();
    }

    @Test
    public void j_addSocials() {
        loginPO _loginPO = new loginPO(driver, js, vars);
        _loginPO.doLogin("admin", "password");
        DashboardPO _DashboardPO = new DashboardPO(driver, js, vars);
        _DashboardPO.doAddSocials("https://www.facebook.com/some_fake_user_name_52432562135863", "https://instagram.com/some_fake_user_name_52432562135863");
        assertThat(_DashboardPO.set_ID_jsfacebook_1(), is("https://www.facebook.com/some_fake_user_name_52432562135863"));
        {
            String value = driver.findElement(By.id("jsinstagram")).getAttribute("value");
            assertThat(value, is("https://instagram.com/some_fake_user_name_52432562135863"));
        }
        _DashboardPO.doLogout_1();
    }
}