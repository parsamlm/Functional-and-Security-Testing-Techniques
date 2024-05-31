package TestCases.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyUtils {

    public static String getSuccessMessage(WebDriver driver) {
        return driver.findElement(By.className("msgSuccess")).getText();
    }
}
