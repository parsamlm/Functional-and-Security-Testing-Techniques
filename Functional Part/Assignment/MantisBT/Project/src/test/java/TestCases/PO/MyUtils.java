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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elem));
    }
}