package TestCases.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyUtils {

    public static void WaitForElementLoaded(WebDriver driver, By elem) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elem));
    }

    public static String getErrorMessage(WebDriver driver) {
        return driver.findElement(By.cssSelector("table.width50 tbody:nth-child(1) tr:nth-child(2) td:nth-child(1) > p.center")).getText();
    }
}