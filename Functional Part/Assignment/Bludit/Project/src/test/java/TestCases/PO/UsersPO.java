package TestCases.PO;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class UsersPO {

    WebDriver driver;

    JavascriptExecutor js;

    Map<String, Object> vars;

    public UsersPO(WebDriver driver, JavascriptExecutor js, Map<String, Object> vars) {
        this.driver = driver;
        this.js = js;
        this.vars = vars;
    }

    public void click_LINKTEXT_Addanewuser() {
        By elem = By.linkText("Add a new user");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_ID_jsnew_username(String key1) {
        By elem = By.id("jsnew_username");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key1);
    }

    public void set_ID_jsnew_password(String key2) {
        By elem = By.id("jsnew_password");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key2);
    }

    public void set_ID_jsconfirm_password(String key3, String key4) {
        By elem = By.id("jsconfirm_password");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key3);
        {
            elem = By.id("jsrole");
            MyUtils.WaitForElementLoaded(driver, elem);
            WebElement dropdown = driver.findElement(elem);
            elem = By.xpath("//option[. = '" + key4 + "']");
            MyUtils.WaitForElementLoaded(driver, elem);
            dropdown.findElement(elem).click();
        }
    }

    public void click_CSSSELECTOR_uk_button_primary() {
        By elem = By.cssSelector(".uk-button-primary");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void createNewUser(String key1, String key2, String key3, String key4) {
        click_LINKTEXT_Addanewuser();
        set_ID_jsnew_username(key1);
        set_ID_jsnew_password(key2);
        set_ID_jsconfirm_password(key3, key4);
        click_CSSSELECTOR_uk_button_primary();
    }

    public List<WebElement> set_LINKTEXT_usertest() {
        By elem = By.linkText("usertest");
        MyUtils.WaitForElementLoaded(driver, elem);
        List<WebElement> elements = driver.findElements(elem);
        return elements;
    }

    public void click_LINKTEXT_usertest() {
        By elem = By.linkText("usertest");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_LINKTEXT_Changepassword() {
        By elem = By.linkText("Change password");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_ID_jsconfirm_password_1(String key2) {
        By elem = By.id("jsconfirm_password");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key2);
    }

    public void changeUserPassword(String key1, String key2) {
        click_LINKTEXT_usertest();
        click_LINKTEXT_Changepassword();
        set_ID_jsnew_password(key1);
        set_ID_jsconfirm_password_1(key2);
        click_CSSSELECTOR_uk_button_primary();
    }

    public void click_LINKTEXT_admin() {
        By elem = By.linkText("admin");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_ID_jsfacebook(String key1) {
        By elem = By.id("jsfacebook");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key1);
    }

    public void set_ID_jsinstagram(String key2) {
        By elem = By.id("jsinstagram");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key2);
    }

    public void addSocialMediaToUser(String key1, String key2) {
        click_LINKTEXT_admin();
        set_ID_jsfacebook(key1);
        set_ID_jsinstagram(key2);
        click_CSSSELECTOR_uk_button_primary();
    }

    public void getUserSocialMedia() {
        click_LINKTEXT_admin();
    }

    public String set_ID_jsfacebook_1() {
        By elem = By.id("jsfacebook");
        MyUtils.WaitForElementLoaded(driver, elem);
        String value = driver.findElement(elem).getAttribute("value");
        return value;
    }
}
