package TestCases;

import TestCases.PO.*;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCases {

    @BeforeClass()
    public static void setup() {
    }

    private WebDriver driver;
    private LoginPO _LoginPO;
    private DashboardPO _DashboardPO;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        _LoginPO = new LoginPO(driver);
        _DashboardPO = new DashboardPO(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void a_doLogin() {
        _LoginPO.doLogin("administrator", "root");
        Assert.assertEquals("Logged in as: administrator (administrator)", _DashboardPO.getLoginInfo());
    }

    @Test
    public void b_doAddNewUser() {
        _LoginPO.doLogin("administrator", "root");
        MenuComponentPO _MenuComponentPO = _DashboardPO.getMenuComponent();
        ManageComponentPO _ManageComponentPO = _MenuComponentPO.goToManage();
        ManageUsersPO _ManageUsersPO = _ManageComponentPO.goToManageUsers();
        _ManageUsersPO.addNewUser("username001", "username001", "username@username.it", UserAccessLevel.UPDATER);
        MyUtils.WaitForElementLoaded(driver, By.linkText("Manage Users"));
        _ManageComponentPO.goToManageUsers();
        Assert.assertEquals("username001", _ManageUsersPO.getNewUserName());
        Assert.assertEquals("username001", _ManageUsersPO.getRealName());
        Assert.assertEquals("username@username.it", _ManageUsersPO.getEmail());
        Assert.assertEquals("updater", _ManageUsersPO.getAccessLevel());
        _DashboardPO.doLogout();
    }

    @Test
    public void c_doAddExistingUser() {
        _LoginPO.doLogin("administrator", "root");
        MenuComponentPO _MenuComponentPO = _DashboardPO.getMenuComponent();
        ManageComponentPO _ManageComponentPO = _MenuComponentPO.goToManage();
        ManageUsersPO _ManageUsersPO = _ManageComponentPO.goToManageUsers();
        _ManageUsersPO.addNewUser("username001", "username001", "username@username.it", UserAccessLevel.UPDATER);
        Assert.assertEquals("That username is already being used. Please go back and select another one.", _ManageUsersPO.getErrorMessage());
        _DashboardPO.doLogout();
    }

    @Test
    public void d_doAddEmptyUser() {
        _LoginPO.doLogin("administrator", "root");
        MenuComponentPO _MenuComponentPO = _DashboardPO.getMenuComponent();
        ManageComponentPO _ManageComponentPO = _MenuComponentPO.goToManage();
        ManageUsersPO _ManageUsersPO = _ManageComponentPO.goToManageUsers();
        _ManageUsersPO.addNewUser("", "", "", UserAccessLevel.REPORTER);
        Assert.assertEquals("A necessary field \"\" was empty. Please recheck your inputs.", _ManageUsersPO.getErrorMessage());
        _DashboardPO.doLogout();
    }

    @Test
    public void e_doAddProject() {
        _LoginPO.doLogin("administrator", "root");
        MenuComponentPO _MenuComponentPO = _DashboardPO.getMenuComponent();
        ManageComponentPO _ManageComponentPO = _MenuComponentPO.goToManage();
        ManageProjectsPO _ManageProjectsPO = _ManageComponentPO.goToManageProjects();
        _ManageProjectsPO.addNewProject("Project001", ProjectStatus.RELEASE, ProjectViewStatus.PUBLIC, "Description");
        _MenuComponentPO.goToManage();
        _ManageComponentPO.goToManageProjects();
        Assert.assertEquals("Project001".toLowerCase(), _ManageProjectsPO.getProjectName());
        Assert.assertEquals("release", _ManageProjectsPO.getProjectStatus());
        Assert.assertEquals("public", _ManageProjectsPO.getProjectViewStatus());
        Assert.assertEquals("Description", _ManageProjectsPO.getProjectDescription());
        _DashboardPO.doLogout();
    }

    @Test
    public void f_doAddExistingProject() {
        _LoginPO.doLogin("administrator", "root");
        MenuComponentPO _MenuComponentPO = _DashboardPO.getMenuComponent();
        ManageComponentPO _ManageComponentPO = _MenuComponentPO.goToManage();
        ManageProjectsPO _ManageProjectsPO = _ManageComponentPO.goToManageProjects();
        _ManageProjectsPO.addNewProject("Project001", ProjectStatus.RELEASE, ProjectViewStatus.PUBLIC, "Description");
        Assert.assertEquals("A project with that name already exists. Please go back and enter a different name.", _ManageProjectsPO.getErrorMessage());
        _DashboardPO.doLogout();
    }

    @Test
    public void g_doAddCategory() {
        _LoginPO.doLogin("administrator", "root");
        MenuComponentPO _MenuComponentPO = _DashboardPO.getMenuComponent();
        ManageComponentPO _ManageComponentPO = _MenuComponentPO.goToManage();
        ManageProjectsPO _ManageProjectsPO = _ManageComponentPO.goToManageProjects();
        _ManageProjectsPO.addCategoryToExistingProject("Project001", "Category001");
        Assert.assertEquals("Category001", _ManageProjectsPO.getCategoryName());
        _DashboardPO.doLogout();
    }

    @Test
    public void h_doAddExistingCategory() {
        _LoginPO.doLogin("administrator", "root");
        MenuComponentPO _MenuComponentPO = _DashboardPO.getMenuComponent();
        ManageComponentPO _ManageComponentPO = _MenuComponentPO.goToManage();
        ManageProjectsPO _ManageProjectsPO = _ManageComponentPO.goToManageProjects();
        _ManageProjectsPO.addCategoryToExistingProject("Project001", "Category001");
        Assert.assertEquals("A category with that name already exists.", _ManageProjectsPO.getErrorMessage());
        _DashboardPO.doLogout();
    }

    @Test
    public void i_doAddIssue() {
        _LoginPO.doLogin("administrator", "root");
        MenuComponentPO _MenuComponentPO = _DashboardPO.getMenuComponent();
        ReportIssuePO _ReportIssuePO = _MenuComponentPO.goToReportIssue();
        _ReportIssuePO.addNewIssue("Category001", IssueReproducibility.RANDOM, IssueSeverity.CRASH, IssuePriority.IMMEDIATE, "Summary001", "description001");
        ViewIssuesPO _ViewIssuesPO = _MenuComponentPO.goToViewIssues();
        Assert.assertEquals("Category001", _ViewIssuesPO.getIssueCategory());
        Assert.assertEquals("crash", _ViewIssuesPO.getIssueSeverity());
        Assert.assertEquals("Summary001", _ViewIssuesPO.getIssueSummary());
        _DashboardPO.doLogout();
    }

}
