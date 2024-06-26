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

public class ProductsPO {

    WebDriver driver;

    JavascriptExecutor js;

    Map<String, Object> vars;

    public ProductsPO(WebDriver driver, JavascriptExecutor js, Map<String, Object> vars) {
        this.driver = driver;
        this.js = js;
        this.vars = vars;
    }

    public void click_ID_page_header_desc_product_new_product() {
        By elem = By.id("page-header-desc-product-new_product");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_ID_name_1(String key1) {
        By elem = By.id("name_1");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key1);
    }

    public void click_NAME_submitAddproduct() {
        By elem = By.name("submitAddproduct");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void addNewProduct(String key1) {
        click_ID_page_header_desc_product_new_product();
        set_ID_name_1(key1);
        click_NAME_submitAddproduct();
    }

    public List<WebElement> set_CSSSELECTOR_alert_successnth_child1() {
        By elem = By.cssSelector(".alert-success:nth-child(1)");
        MyUtils.WaitForElementLoaded(driver, elem);
        List<WebElement> elements = driver.findElements(elem);
        return elements;
    }

    public void set_CSSSELECTOR_ollinth_child1() {
        By elem = By.cssSelector("ol > li:nth-child(1)");
        MyUtils.WaitForElementLoaded(driver, elem);
    }

    public void addNewEmptyProduct() {
        click_ID_page_header_desc_product_new_product();
        click_NAME_submitAddproduct();
        set_CSSSELECTOR_ollinth_child1();
    }

    public String set_CSSSELECTOR_ollinth_child1_1() {
        By elem = By.cssSelector("ol > li:nth-child(1)");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }

    public String set_CSSSELECTOR_ollinth_child2() {
        By elem = By.cssSelector("ol > li:nth-child(2)");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }

    public void click_CSSSELECTOR_tr__13_0edit() {
        By elem = By.cssSelector("#tr__13_0 .edit");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void editProduct(String key1) {
        click_CSSSELECTOR_tr__13_0edit();
        set_ID_name_1(key1);
        click_NAME_submitAddproduct();
    }

    public void click_ID_link_Prices() {
        By elem = By.id("link-Prices");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_ID_priceTE(String key1) {
        By elem = By.id("priceTE");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key1);
    }

    public void addNewProductWithTax(String key1) {
        click_ID_page_header_desc_product_new_product();
        click_ID_link_Prices();
        set_ID_priceTE(key1);
    }

    public String set_ID_priceTI() {
        By elem = By.id("priceTI");
        MyUtils.WaitForElementLoaded(driver, elem);
        String value = driver.findElement(elem).getAttribute("value");
        return value;
    }

    public void set_ID_priceTE_1(String key1, String key2) {
        By elem = By.id("priceTE");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key1);
        {
            elem = By.id("id_tax_rules_group");
            MyUtils.WaitForElementLoaded(driver, elem);
            WebElement dropdown = driver.findElement(elem);
            elem = By.xpath("//option[. = '" + key2 + "']");
            MyUtils.WaitForElementLoaded(driver, elem);
            dropdown.findElement(elem).click();
        }
    }

    public void addNewProductWithTax10(String key1, String key2) {
        click_ID_page_header_desc_product_new_product();
        click_ID_link_Prices();
        set_ID_priceTE_1(key1, key2);
    }
}
