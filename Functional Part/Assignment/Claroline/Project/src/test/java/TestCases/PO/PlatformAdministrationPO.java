package TestCases.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    public String getSuccessMessage() {
        return driver.findElement(By.className("msgSuccess")).getText();
    }

    public void searchUser(String username) {
        driver.findElement(By.id("search_user")).sendKeys(username);
        driver.findElement(By.cssSelector("input[value='Go']")).click();
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