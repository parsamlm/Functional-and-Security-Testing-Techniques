package TestCases;

import TestCases.PO.CoursePO;
import TestCases.PO.HomePO;
import TestCases.PO.MyDesktopPO;
import TestCases.PO.PlatformAdministrationPO;
import TestCases.Utils.*;
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
        _PlatformAdministrationPO.addUser("Name001", "Firstname001", "user001", "password001", "password001", PlatformRole.Student);
        Assert.assertEquals("The new user has been sucessfully created", MyUtils.getSuccessMessage(driver));
        _HomePO.logout();
    }

    @Test

    public void b_doSearchUser() {
        _HomePO.login("admin", "admin");
        PlatformAdministrationPO _PlatformAdministrationPO = _HomePO.goToPlatformAdministration();
        _PlatformAdministrationPO.searchUser("user001");
        Assert.assertEquals("Name001", _PlatformAdministrationPO.getSearchedUserLastname());
        Assert.assertEquals("Firstname001", _PlatformAdministrationPO.getSearchedUserFirstname());
        Assert.assertEquals("User", _PlatformAdministrationPO.getSearchedUserStatus());
        _HomePO.logout();
    }

    @Test
    public void c_doLoginUser() {
        _HomePO.login("user001", "password001");
        Assert.assertEquals("Firstname001 Name001", _HomePO.getUserLoggedInInfo());
        _HomePO.logout();
    }

    @Test
    public void d_doAddCourse() {
        _HomePO.login("admin", "admin");
        PlatformAdministrationPO _PlatformAdministrationPO = _HomePO.goToPlatformAdministration();
        _PlatformAdministrationPO.addCourse("Course001",
                "001",
                new CourseCategory[]{CourseCategory.Sciences, CourseCategory.Economics},
                CourseAccess.PUBLIC,
                CourseRegistrationSetting.ALLOWED);
        Assert.assertEquals("You have just created the course website : 001", MyUtils.getSuccessMessage(driver));
        _PlatformAdministrationPO.clickOnTheContinueButton();
        _HomePO.logout();
    }

    @Test
    public void e_doSearchCourse() {
        _HomePO.login("admin", "admin");
        PlatformAdministrationPO _PlatformAdministrationPO = _HomePO.goToPlatformAdministration();
        _PlatformAdministrationPO.searchCourse("Course001");
        Assert.assertEquals("Course001", _PlatformAdministrationPO.getSearchedCourseTitle());
        Assert.assertEquals("001", _PlatformAdministrationPO.getSearchedCourseCode());
        _HomePO.logout();
    }

    @Test
    public void f_doEnrollUser() {
        _HomePO.login("user001", "password001");
        MyDesktopPO _MyDesktopPO = _HomePO.goToMyDesktop();
        _MyDesktopPO.enrollUserToCourse("Course001");
        Assert.assertEquals("You've been enrolled on the course", MyUtils.getSuccessMessage(driver));
        _HomePO.logout();
    }

    @Test
    public void g_doAddCourseEvent() {
        _HomePO.login("admin", "admin");
        MyDesktopPO _MyDesktopPO = _HomePO.goToMyDesktop();
        CoursePO _CoursePO = _MyDesktopPO.goToCourse("001 - Course001");
        _CoursePO.addCourseEvent("Exam 001", "31", "May", "2023", "Genoa");
        Assert.assertEquals("Event added to the agenda.", MyUtils.getSuccessMessage(driver));
        _HomePO.logout();
    }

    @Test
    public void h_doAddCourseExercise() {
        _HomePO.login("admin", "admin");
        MyDesktopPO _MyDesktopPO = _HomePO.goToMyDesktop();
        CoursePO _CoursePO = _MyDesktopPO.goToCourse("001 - Course001");
        _CoursePO.addCourseExercise("Exercise 001");
        Assert.assertEquals("Exercise added", MyUtils.getSuccessMessage(driver));
        _HomePO.logout();
    }

    @Test
    public void i_doMakeCourseExerciseVisible() {
        _HomePO.login("admin", "admin");
        MyDesktopPO _MyDesktopPO = _HomePO.goToMyDesktop();
        CoursePO _CoursePO = _MyDesktopPO.goToCourse("001 - Course001");
        Assert.assertEquals("Make visible", _CoursePO.getCourseExerciseVisibility(2));
        _CoursePO.changeCourseExerciseVisibility();
        Assert.assertEquals("Make invisible", _CoursePO.getCourseExerciseVisibility(2));
        _HomePO.logout();
    }

    @Test
    public void j_doAddCourseExerciseQuestions() {
        _HomePO.login("admin", "admin");
        MyDesktopPO _MyDesktopPO = _HomePO.goToMyDesktop();
        CoursePO _CoursePO = _MyDesktopPO.goToCourse("001 - Course001");
        _CoursePO.goToCourseExercise();
        _CoursePO.addQuestion("Question 1", AnswerType.MULTIPLE_CHOICE_UNIQUE_ANSWER, true);
        _CoursePO.handleAnswerTypeMCUA(2, 1, "3", "-3");
        _CoursePO.addQuestion("Question 2", AnswerType.TRUE_FALSE, false);
        _CoursePO.handleAnswerTypeTF(1, "3", "-3");
        _CoursePO.addQuestion("Question 3", AnswerType.MULTIPLE_CHOICE_MULTIPLE_ANSWER, false);
        _CoursePO.handleAnswerTypeMCMA(3, 1, 3, "3", "-3");
        _CoursePO.goToExercisePage();
        Assert.assertEquals("Question 1", _CoursePO.getQuestionTitle(1));
        Assert.assertEquals("Multiple choice (Unique answer)", _CoursePO.getAnswerType(1));
        Assert.assertEquals("Question 2", _CoursePO.getQuestionTitle(2));
        Assert.assertEquals("True/False", _CoursePO.getAnswerType(2));
        Assert.assertEquals("Question 3", _CoursePO.getQuestionTitle(3));
        Assert.assertEquals("Multiple choice (Multiple answers)", _CoursePO.getAnswerType(3));
        _HomePO.logout();
    }

}
