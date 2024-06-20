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

public class ContentPO {

    WebDriver driver;

    JavascriptExecutor js;

    Map<String, Object> vars;

    public ContentPO(WebDriver driver, JavascriptExecutor js, Map<String, Object> vars) {
        this.driver = driver;
        this.js = js;
        this.vars = vars;
    }

    public List<WebElement> getContentTitle() {
        By elem = By.linkText("Test content");
        MyUtils.WaitForElementLoaded(driver, elem);
        List<WebElement> elements = driver.findElements(elem);
        return elements;
    }

    public void click_LINKTEXT_Testcontent() {
        By elem = By.linkText("Test content");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_CSSSELECTOR_linth_child7sidebar_button() {
        By elem = By.cssSelector("li:nth-child(7) > .sidebar-button");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_ID_jsslug(String key1) {
        By elem = By.id("jsslug");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key1);
    }

    public void click_CSSSELECTOR_uk_buttonnth_child1() {
        By elem = By.cssSelector(".uk-button:nth-child(1)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void changeUrl(String key1) {
        click_LINKTEXT_Testcontent();
        click_CSSSELECTOR_linth_child7sidebar_button();
        set_ID_jsslug(key1);
        click_CSSSELECTOR_uk_buttonnth_child1();
    }

    public List<WebElement> getContentUrl() {
        By elem = By.linkText("/new-post-url");
        MyUtils.WaitForElementLoaded(driver, elem);
        List<WebElement> elements = driver.findElements(elem);
        return elements;
    }

    public void set_ID_jsposition(String key1) {
        By elem = By.id("jsposition");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key1);
    }

    public void changeContentPosition(String key1) {
        click_LINKTEXT_Testcontent();
        click_CSSSELECTOR_linth_child7sidebar_button();
        set_ID_jsposition(key1);
        click_CSSSELECTOR_uk_buttonnth_child1();
    }

    public void getContentPosition() {
        click_LINKTEXT_Testcontent();
        click_CSSSELECTOR_linth_child7sidebar_button();
    }

    public String set_ID_jsposition_1() {
        By elem = By.id("jsposition");
        MyUtils.WaitForElementLoaded(driver, elem);
        String value = driver.findElement(elem).getAttribute("value");
        return value;
    }

    public void click_CSSSELECTOR_linth_child7sidebar_button_1(String key1) {
        By elem = By.cssSelector("li:nth-child(7) > .sidebar-button");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        {
            elem = By.id("jsparent");
            MyUtils.WaitForElementLoaded(driver, elem);
            WebElement dropdown = driver.findElement(elem);
            elem = By.xpath("//option[. = '" + key1 + "']");
            MyUtils.WaitForElementLoaded(driver, elem);
            dropdown.findElement(elem).click();
        }
    }

    public void changeContentParent(String key1) {
        click_LINKTEXT_Testcontent();
        click_CSSSELECTOR_linth_child7sidebar_button_1(key1);
        click_CSSSELECTOR_uk_buttonnth_child1();
    }

    public String set_ID_jsparent() {
        By elem = By.id("jsparent");
        MyUtils.WaitForElementLoaded(driver, elem);
        String value = driver.findElement(elem).getAttribute("value");
        return value;
    }

    public List<WebElement> getDraftContentTitle() {
        By elem = By.linkText("Draft Content");
        MyUtils.WaitForElementLoaded(driver, elem);
        List<WebElement> elements = driver.findElements(elem);
        return elements;
    }

    public void click_LINKTEXT_Setupyournewsite() {
        By elem = By.linkText("Set up your new site");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_CSSSELECTOR_linth_child7sidebar_button_2(String key1) {
        By elem = By.cssSelector("li:nth-child(7) > .sidebar-button");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        {
            elem = By.id("jsstatus");
            MyUtils.WaitForElementLoaded(driver, elem);
            WebElement dropdown = driver.findElement(elem);
            elem = By.xpath("//option[. = '" + key1 + "']");
            MyUtils.WaitForElementLoaded(driver, elem);
            dropdown.findElement(elem).click();
        }
    }

    public void setContentAsStickyPost(String key1) {
        click_LINKTEXT_Setupyournewsite();
        click_CSSSELECTOR_linth_child7sidebar_button_2(key1);
        click_CSSSELECTOR_uk_buttonnth_child1();
    }

    public List<WebElement> getStickyContentTitle() {
        By elem = By.linkText("Set up your new site");
        MyUtils.WaitForElementLoaded(driver, elem);
        List<WebElement> elements = driver.findElements(elem);
        return elements;
    }

    public void click_LINKTEXT_FollowBludit() {
        By elem = By.linkText("Follow Bludit");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_ID_jsdelete() {
        By elem = By.id("jsdelete");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.switchTo().alert().accept();
    }

    public void deleteContent() {
        click_LINKTEXT_FollowBludit();
        click_ID_jsdelete();
    }

    public List<WebElement> set_LINKTEXT_FollowBludit() {
        By elem = By.linkText("Follow Bludit");
        MyUtils.WaitForElementLoaded(driver, elem);
        List<WebElement> elements = driver.findElements(elem);
        return elements;
    }
}