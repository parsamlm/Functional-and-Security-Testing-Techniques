package TestCases.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PlatformAdministrationPO extends HomePO {

    public PlatformAdministrationPO(WebDriver driver) {
        super(driver);
    }

    public void addUser(String lastname, String firstname, String username, String password, String passwordConfirmation) {
        driver.findElement(By.cssSelector("a[href='adminaddnewuser.php']")).click();
        driver.findElement(By.id("lastname")).sendKeys(lastname);
        driver.findElement(By.id("firstname")).sendKeys(firstname);
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("password_conf")).sendKeys(passwordConfirmation);
        driver.findElement(By.id("student")).click();
        driver.findElement(By.id("applyChange")).click();
    }

    public void addCourse(String courseTitle, String courseCode){
        driver.findElement(By.xpath("//a[text()='Create course']")).click();
        driver.findElement(By.id("course_title")).sendKeys(courseTitle);
        driver.findElement(By.id("course_officialCode")).sendKeys(courseCode);
        Select dropdown = new Select(driver.findElement(By.id("mslist2")));
        dropdown.selectByVisibleText("Sciences");
        driver.findElement(By.cssSelector("img[src='/claroline11110/web/img/go_left.png?1232376376']")).click();
        dropdown.selectByVisibleText("Economics");
        driver.findElement(By.id("access_public")).click();
        driver.findElement(By.id("registration_true")).click();
        driver.findElement(By.name("changeProperties")).click();
    }

    public void clickOnTheContinueButton(){
        driver.findElement(By.xpath("//a[text()='Continue']")).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(By.className("msgSuccess")).getText();
    }

    public void searchUser(String username) {
        driver.findElement(By.id("search_user")).sendKeys(username);
        driver.findElement(By.cssSelector("input[value='Go']")).click();
    }

    public void searchCourse(String courseTitle){
        driver.findElement(By.id("search_course")).sendKeys(courseTitle);
        driver.findElement(By.cssSelector("ul.adminPanel li:nth-child(2) ul.adminCourse:nth-child(2) li:nth-child(1) form:nth-child(2) > input:nth-child(2)")).click();
    }

    public String getCourseTitle(){
        return driver.findElement(By.xpath("//td[@headers='c1 L0']")).getText();
    }

    public String getCourseCode(){
        return driver.findElement(By.id("L0")).getText();
    }

    public String getUserLastname() {
        return driver.findElement(By.id("L0")).getText();
    }

    public String getUserFirstname() {
        return driver.findElement(By.xpath("//td[@headers='c2 L0']")).getText();
    }

    public String getUserStatus() {
        return driver.findElement(By.xpath("//td[@headers='c5 L0']")).getText();
    }
}