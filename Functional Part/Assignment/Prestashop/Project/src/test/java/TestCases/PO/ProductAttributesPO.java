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

public class ProductAttributesPO {

    WebDriver driver;

    JavascriptExecutor js;

    Map<String, Object> vars;

    public ProductAttributesPO(WebDriver driver, JavascriptExecutor js, Map<String, Object> vars) {
        this.driver = driver;
        this.js = js;
        this.vars = vars;
    }

    public void click_ID_page_header_desc_attribute_group_new_attribute_group() {
        By elem = By.id("page-header-desc-attribute_group-new_attribute_group");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_ID_name_1(String key1) {
        By elem = By.id("name_1");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key1);
    }

    public void set_ID_public_name_1(String key2) {
        By elem = By.id("public_name_1");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key2);
    }

    public void click_ID_attribute_group_form_submit_btn() {
        By elem = By.id("attribute_group_form_submit_btn");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void addNewAttribute(String key1, String key2) {
        click_ID_page_header_desc_attribute_group_new_attribute_group();
        set_ID_name_1(key1);
        set_ID_public_name_1(key2);
        click_ID_attribute_group_form_submit_btn();
    }

    public List<WebElement> set_CSSSELECTOR_alert_successnth_child1() {
        By elem = By.cssSelector(".alert-success:nth-child(1)");
        MyUtils.WaitForElementLoaded(driver, elem);
        List<WebElement> elements = driver.findElements(elem);
        return elements;
    }
}
