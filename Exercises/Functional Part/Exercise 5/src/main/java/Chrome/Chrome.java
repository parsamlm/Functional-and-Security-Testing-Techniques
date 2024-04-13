package Chrome;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.Helper;

public class Chrome {
    public static void main(String[] args) {
        // for automatic driver management:
        WebDriverManager.chromedriver().setup();
        // for manual driver management:
        // there was no driver for this version of Chrome: 123.0.6312.124 - (2024/04/12 - 20:19)
        // System.setProperty("webdriver.chrome.driver", "/Users/username/Downloads/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        WebDriver driver = new ChromeDriver(chromeOptions);
        new Helper(driver).testTitle();
    }
}