package Firefox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.Helper;

import java.io.File;

public class Firefox {
    public static void main(String[] args) {
        // for automatic driver management:
        // WebDriverManager.firefoxdriver().setup();
        // for manual driver management:
        System.setProperty("webdriver.gecko.driver", "/Users/parsa/IdeaProjects/Functional-and-Security-Testing-Techniques/Exercises/Functional Part/Exercise 5/src/main/java/Firefox/geckodriver");
        FirefoxBinary firefoxBinary = new FirefoxBinary(new File("/Applications/Firefox.app/Contents/MacOS/firefox"));
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        WebDriver driver = new FirefoxDriver(firefoxOptions);
        new Helper(driver).testTitle();
    }
}