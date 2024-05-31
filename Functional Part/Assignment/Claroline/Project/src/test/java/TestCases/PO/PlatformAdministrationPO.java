package TestCases.PO;

import TestCases.Utils.CourseAccess;
import TestCases.Utils.CourseCategory;
import TestCases.Utils.CourseRegistrationSetting;
import TestCases.Utils.PlatformRole;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PlatformAdministrationPO extends HomePO {

    public PlatformAdministrationPO(WebDriver driver) {
        super(driver);
    }

    public void addUser(String lastname, String firstname, String username, String password, String passwordConfirmation, PlatformRole role) {
        driver.findElement(By.cssSelector("a[href='adminaddnewuser.php']")).click();
        driver.findElement(By.id("lastname")).sendKeys(lastname);
        driver.findElement(By.id("firstname")).sendKeys(firstname);
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("password_conf")).sendKeys(passwordConfirmation);
        switch (role) {
            case Student:
                driver.findElement(By.id("student")).click();
                break;
            case Teacher:
                driver.findElement(By.id("courseManager")).click();
                break;
            case Administrator:
                driver.findElement(By.id("platformAdmin")).click();
                break;
        }
        driver.findElement(By.id("applyChange")).click();
    }

    public void addCourse(String title, String code, CourseCategory[] categories, CourseAccess access, CourseRegistrationSetting registrationSetting) {
        driver.findElement(By.xpath("//a[text()='Create course']")).click();
        driver.findElement(By.id("course_title")).sendKeys(title);
        driver.findElement(By.id("course_officialCode")).sendKeys(code);
        for (CourseCategory category : categories) {
            chooseCategoryForCourse(category.toString());
        }
        switch (access) {
            case PUBLIC:
                driver.findElement(By.id("access_public")).click();
                break;
            case RESERVED:
                driver.findElement(By.id("access_reserved")).click();
                break;
            case PRIVATE:
                driver.findElement(By.id("access_private")).click();
                break;
        }
        switch (registrationSetting) {
            case ALLOWED:
                driver.findElement(By.id("registration_true")).click();
                break;
            case DENIED:
                driver.findElement(By.id("registration_false")).click();
                break;
        }
        driver.findElement(By.name("changeProperties")).click();
    }

    private void chooseCategoryForCourse(String category) {
        Select dropdown = new Select(driver.findElement(By.id("mslist2")));
        dropdown.selectByVisibleText(category);
        driver.findElement(By.cssSelector("img[src='/claroline11110/web/img/go_left.png?1232376376']")).click();
    }

    public void clickOnTheContinueButton() {
        driver.findElement(By.xpath("//a[text()='Continue']")).click();
    }

    public void searchUser(String username) {
        driver.findElement(By.id("search_user")).sendKeys(username);
        driver.findElement(By.cssSelector("input[value='Go']")).click();
    }

    public void searchCourse(String title) {
        driver.findElement(By.id("search_course")).sendKeys(title);
        driver.findElement(By.cssSelector("ul.adminPanel li:nth-child(2) ul.adminCourse:nth-child(2) li:nth-child(1) form:nth-child(2) > input:nth-child(2)")).click();
    }

    public String getSearchedCourseTitle() {
        return driver.findElement(By.xpath("//td[@headers='c1 L0']")).getText();
    }

    public String getSearchedCourseCode() {
        return driver.findElement(By.id("L0")).getText();
    }

    public String getSearchedUserLastname() {
        return driver.findElement(By.id("L0")).getText();
    }

    public String getSearchedUserFirstname() {
        return driver.findElement(By.xpath("//td[@headers='c2 L0']")).getText();
    }

    public String getSearchedUserStatus() {
        return driver.findElement(By.xpath("//td[@headers='c5 L0']")).getText();
    }
}