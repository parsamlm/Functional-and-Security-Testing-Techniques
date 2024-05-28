package TestCases.PO;

import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class MyUtils {

    public static void WaitForElementLoaded(WebDriver driver, By reference) {
        WebDriverWait waitFor = new WebDriverWait(driver, 10);
        waitFor.until(new Function<WebDriver, Boolean>() {

            public Boolean apply(WebDriver driver) {
                return driver.findElement(reference).isDisplayed();
            }
        });
    }
}
