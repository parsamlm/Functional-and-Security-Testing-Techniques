package Safari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import utils.Helper;

public class Safari {
    public static void main(String[] args) {
        WebDriver driver = new SafariDriver();
        new Helper(driver).testTitle();
    }
}