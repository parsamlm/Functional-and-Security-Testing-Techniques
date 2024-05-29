package TestCases.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyUtils {
    WebDriver driver;

    public MyUtils(WebDriver driver) {
        this.driver = driver;
    }

    public static void WaitForElementLoaded(WebDriver driver, By elem) {
        // wait for the element to be shown
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elem));
    }

    public String getLoginInfo() {
        // find the element by class which is login-info-left
        return driver.findElement(By.className("login-info-left")).getText();
    }




}
