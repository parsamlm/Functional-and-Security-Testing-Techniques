package TestCases.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePO {
    public WebDriver driver;

    public HomePO(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.get("http://localhost:3000/claroline11110/index.php");
        driver.findElement(By.id("login")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Enter']")).click();
    }

    public MyDesktopPO goToMyDesktop() {
        MyDesktopPO myDesktopPO = new MyDesktopPO(driver);
        driver.findElement(By.xpath("//a[text()='My desktop']")).click();
        return myDesktopPO;
    }

    public PlatformAdministrationPO goToPlatformAdministration() {
        PlatformAdministrationPO platformAdministrationPO = new PlatformAdministrationPO(driver);
        driver.findElement(By.cssSelector("a[href='/claroline11110/claroline/admin/']")).click();
        return platformAdministrationPO;
    }

    public void logout() {
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }

    public String getLoginInfo() {
        return driver.findElement(By.className("userName")).getText();
    }
}
