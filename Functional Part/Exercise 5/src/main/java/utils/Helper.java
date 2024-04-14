package utils;

import org.openqa.selenium.WebDriver;

public class Helper {
    private final WebDriver driver;

    public Helper(WebDriver driver) {
        this.driver = driver;
    }

    public void testTitle() {
        String baseUrl = "https://bonigarcia.dev/selenium-webdriver-java/";
        String expectedTitle = "Hands-On Selenium WebDriver with Java";
        String actualTitle = "";
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
        driver.quit();
    }

}
