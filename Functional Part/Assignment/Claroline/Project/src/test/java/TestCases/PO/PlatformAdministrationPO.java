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
}