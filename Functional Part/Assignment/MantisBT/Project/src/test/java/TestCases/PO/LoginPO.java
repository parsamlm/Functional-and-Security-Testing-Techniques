package TestCases.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class LoginPO {
    WebDriver driver;

    public LoginPO(WebDriver driver) {
        this.driver = driver;
    }

    public void doLogin(String username, String password) {
        driver.get("http://localhost:3000/mantisbt/login_page.php");
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }

    public String getLoginInfo() {
        // find the element by class which is login-info-left
        return driver.findElement(By.className("login-info-left")).getText();
    }
}
