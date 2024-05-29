package TestCases.PO;

// Generated by Selenium IDE

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class DashboardPO {

    WebDriver driver;

    JavascriptExecutor js;

    Map<String, Object> vars;

    public DashboardPO(WebDriver driver, JavascriptExecutor js, Map<String, Object> vars) {
        this.driver = driver;
        this.js = js;
        this.vars = vars;
    }

    public void click_LINKTEXT_Newcontent() {
        By elem = By.linkText("New content");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_ID_jstitle(String key1) {
        By elem = By.id("jstitle");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key1);
    }

    public void click_CSSSELECTOR_uk_buttonnth_child1() {
        By elem = By.cssSelector(".uk-button:nth-child(1)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void doAddContent(String key1) {
        click_LINKTEXT_Newcontent();
        set_ID_jstitle(key1);
        click_CSSSELECTOR_uk_buttonnth_child1();
    }

    public List<WebElement> set_LINKTEXT_TestContent() {
        By elem = By.linkText("Test Content");
        MyUtils.WaitForElementLoaded(driver, elem);
        List<WebElement> elements = driver.findElements(elem);
        return elements;
    }

    public void doLogout() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        By elem = By.linkText("Log out");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_LINKTEXT_Content() {
        By elem = By.linkText("Content");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_LINKTEXT_TestContent() {
        By elem = By.linkText("Test Content");
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

    public void doChangeUrl(String key1) {
        click_LINKTEXT_Content();
        click_LINKTEXT_TestContent();
        click_CSSSELECTOR_linth_child7sidebar_button();
        set_ID_jsslug(key1);
        click_CSSSELECTOR_uk_buttonnth_child1();
        click_LINKTEXT_Content();
    }

    public List<WebElement> set_LINKTEXT_new_post_url() {
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

    public void doChangePosition(String key1) {
        click_LINKTEXT_Content();
        click_LINKTEXT_TestContent();
        click_CSSSELECTOR_linth_child7sidebar_button();
        set_ID_jsposition(key1);
        click_CSSSELECTOR_uk_buttonnth_child1();
        click_LINKTEXT_Content();
        click_LINKTEXT_TestContent();
        click_CSSSELECTOR_linth_child7sidebar_button();
    }

    public String set_ID_jsposition_1() {
        By elem = By.id("jsposition");
        MyUtils.WaitForElementLoaded(driver, elem);
        String value = driver.findElement(elem).getAttribute("value");
        return value;
    }

    public void doLogout_1() {
        By elem = By.linkText("Log out");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
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

    public void doChangeParent(String key1) {
        click_LINKTEXT_Content();
        click_LINKTEXT_TestContent();
        click_CSSSELECTOR_linth_child7sidebar_button_1(key1);
        click_CSSSELECTOR_uk_buttonnth_child1();
        click_CSSSELECTOR_linth_child7sidebar_button();
    }

    public String set_ID_jsparent() {
        By elem = By.id("jsparent");
        MyUtils.WaitForElementLoaded(driver, elem);
        String value = driver.findElement(elem).getAttribute("value");
        return value;
    }

    public void click_ID_jsSaveDraft() {
        By elem = By.id("jsSaveDraft");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void doAddAsDraft(String key1) {
        click_LINKTEXT_Newcontent();
        set_ID_jstitle(key1);
        click_ID_jsSaveDraft();
    }

    public List<WebElement> set_LINKTEXT_DraftContent() {
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

    public void click_CSSSELECTOR_jsstatusoptionnth_child3() {
        By elem = By.cssSelector("#jsstatus > option:nth-child(3)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void doSetStickyPost(String key1) {
        click_LINKTEXT_Content();
        click_LINKTEXT_Setupyournewsite();
        click_CSSSELECTOR_linth_child7sidebar_button_2(key1);
        click_CSSSELECTOR_jsstatusoptionnth_child3();
        click_CSSSELECTOR_uk_buttonnth_child1();
        click_LINKTEXT_Content();
    }

    public List<WebElement> set_LINKTEXT_Setupyournewsite() {
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

    public void doDeleteContent() {
        click_LINKTEXT_Content();
        click_LINKTEXT_FollowBludit();
        click_ID_jsdelete();
    }

    public boolean checkBluditLinkExists() {
        By elem = By.linkText("Follow Bludit");
        List<WebElement> elements = driver.findElements(elem);
        return elements.size() > 0;
    }

    public void click_LINKTEXT_Users() {
        By elem = By.linkText("Users");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
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

    public void set_ID_jsemail(String key5) {
        By elem = By.id("jsemail");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key5);
    }

    public void click_CSSSELECTOR_uk_button_primary() {
        By elem = By.cssSelector(".uk-button-primary");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_LINKTEXT_usertest() {
        By elem = By.linkText("usertest");
        MyUtils.WaitForElementLoaded(driver, elem);
    }

    public void doAddUser(String key1, String key2, String key3, String key4, String key5) {
        click_LINKTEXT_Users();
        click_LINKTEXT_Addanewuser();
        set_ID_jsnew_username(key1);
        set_ID_jsnew_password(key2);
        set_ID_jsconfirm_password(key3, key4);
        set_ID_jsemail(key5);
        click_CSSSELECTOR_uk_button_primary();
        set_LINKTEXT_usertest();
    }

    public String set_LINKTEXT_usertest_1() {
        By elem = By.linkText("usertest");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
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

    public void doChangePassword(String key1, String key2) {
        click_LINKTEXT_Users();
        click_LINKTEXT_usertest();
        click_LINKTEXT_Changepassword();
        set_ID_jsnew_password(key1);
        set_ID_jsconfirm_password_1(key2);
        click_CSSSELECTOR_uk_button_primary();
    }

    public List<WebElement> set_ID_alert() {
        By elem = By.id("alert");
        MyUtils.WaitForElementLoaded(driver, elem);
        List<WebElement> elements = driver.findElements(elem);
        return elements;
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

    public void doAddSocials(String key1, String key2) {
        click_LINKTEXT_Users();
        click_LINKTEXT_admin();
        set_ID_jsfacebook(key1);
        set_ID_jsinstagram(key2);
        click_CSSSELECTOR_uk_button_primary();
    }

    public String set_ID_jsfacebook_1() {
        By elem = By.id("jsfacebook");
        MyUtils.WaitForElementLoaded(driver, elem);
        String value = driver.findElement(elem).getAttribute("value");
        return value;
    }
}
