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
public class BluditTestSuiteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void addContent() {
    System.out.println("{ASSESSOR}:loginPO:doLogin");
    driver.get("http://localhost:8080/admin");
    driver.manage().window().setSize(new Dimension(1174, 825));
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("password");
    driver.findElement(By.cssSelector(".uk-button")).click();
    System.out.println("{ASSESSOR}:DashboardPO:doAddContent");
    driver.findElement(By.linkText("New content")).click();
    driver.findElement(By.id("jstitle")).sendKeys("Test Content");
    driver.findElement(By.cssSelector(".uk-button:nth-child(1)")).click();
    {
      List<WebElement> elements = driver.findElements(By.linkText("Test Content"));
      assert(elements.size() > 0);
    }
    System.out.println("{ASSESSOR}:DashboardPO:doLogout");
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.findElement(By.linkText("Log out")).click();
  }
  @Test
  public void changeUrl() {
    System.out.println("{ASSESSOR}:loginPO:doLogin");
    driver.get("http://localhost:8080/admin");
    driver.manage().window().setSize(new Dimension(1174, 825));
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("password");
    driver.findElement(By.cssSelector(".uk-button")).click();
    System.out.println("{ASSESSOR}:DashboardPO:doChangeUrl");
    driver.findElement(By.linkText("Content")).click();
    driver.findElement(By.linkText("Test Content")).click();
    driver.findElement(By.cssSelector("li:nth-child(7) > .sidebar-button")).click();
    driver.findElement(By.id("jsslug")).sendKeys("new-post-url");
    driver.findElement(By.cssSelector(".uk-button:nth-child(1)")).click();
    driver.findElement(By.linkText("Content")).click();
    {
      List<WebElement> elements = driver.findElements(By.linkText("/new-post-url"));
      assert(elements.size() > 0);
    }
    System.out.println("{ASSESSOR}:DashboardPO:doLogout");
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.findElement(By.linkText("Log out")).click();
  }
  @Test
  public void changePosition() {
    System.out.println("{ASSESSOR}:loginPO:doLogin");
    driver.get("http://localhost:8080/admin");
    driver.manage().window().setSize(new Dimension(1174, 825));
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("password");
    driver.findElement(By.cssSelector(".uk-button")).click();
    System.out.println("{ASSESSOR}:DashboardPO:doChangePosition");
    driver.findElement(By.linkText("Content")).click();
    driver.findElement(By.linkText("Test Content")).click();
    driver.findElement(By.cssSelector("li:nth-child(7) > .sidebar-button")).click();
    driver.findElement(By.id("jsposition")).sendKeys("30");
    driver.findElement(By.cssSelector(".uk-button:nth-child(1)")).click();
    driver.findElement(By.linkText("Content")).click();
    driver.findElement(By.linkText("Test Content")).click();
    driver.findElement(By.cssSelector("li:nth-child(7) > .sidebar-button")).click();
    {
      String value = driver.findElement(By.id("jsposition")).getAttribute("value");
      assertThat(value, is("30"));
    }
    System.out.println("{ASSESSOR}:DashboardPO:doLogout");
    driver.findElement(By.linkText("Log out")).click();
  }
  @Test
  public void changeParent() {
    System.out.println("{ASSESSOR}:loginPO:doLogin");
    driver.get("http://localhost:8080/admin");
    driver.manage().window().setSize(new Dimension(1174, 825));
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("password");
    driver.findElement(By.cssSelector(".uk-button")).click();
    System.out.println("{ASSESSOR}:DashboardPO:doChangeParent");
    driver.findElement(By.linkText("Content")).click();
    driver.findElement(By.linkText("Test Content")).click();
    driver.findElement(By.cssSelector("li:nth-child(7) > .sidebar-button")).click();
    {
      WebElement dropdown = driver.findElement(By.id("jsparent"));
      dropdown.findElement(By.xpath("//option[. = 'Create your own content']")).click();
    }
    driver.findElement(By.cssSelector(".uk-button:nth-child(1)")).click();
    driver.findElement(By.linkText("Content")).click();
    driver.findElement(By.linkText("Test Content")).click();
    driver.findElement(By.cssSelector("li:nth-child(7) > .sidebar-button")).click();
    {
      String value = driver.findElement(By.id("jsparent")).getAttribute("value");
      assertThat(value, is("create-your-own-content"));
    }
    System.out.println("{ASSESSOR}:DashboardPO:doLogout");
    driver.findElement(By.linkText("Log out")).click();
  }
  @Test
  public void addAsDraft() {
    System.out.println("{ASSESSOR}:loginPO:doLogin");
    driver.get("http://localhost:8080/admin");
    driver.manage().window().setSize(new Dimension(1174, 825));
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("password");
    driver.findElement(By.cssSelector(".uk-button")).click();
    System.out.println("{ASSESSOR}:DashboardPO:doAddAsDraft");
    driver.findElement(By.linkText("New content")).click();
    driver.findElement(By.id("jstitle")).sendKeys("Draft Content");
    driver.findElement(By.id("jsSaveDraft")).click();
    {
      List<WebElement> elements = driver.findElements(By.linkText("Draft Content"));
      assert(elements.size() > 0);
    }
    System.out.println("{ASSESSOR}:DashboardPO:doLogout");
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.findElement(By.linkText("Log out")).click();
  }
  @Test
  public void setStickyPost() {
    System.out.println("{ASSESSOR}:loginPO:doLogin");
    driver.get("http://localhost:8080/admin");
    driver.manage().window().setSize(new Dimension(1174, 825));
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("password");
    driver.findElement(By.cssSelector(".uk-button")).click();
    System.out.println("{ASSESSOR}:DashboardPO:doSetStickyPost");
    driver.findElement(By.linkText("Content")).click();
    driver.findElement(By.linkText("Set up your new site")).click();
    driver.findElement(By.cssSelector("li:nth-child(7) > .sidebar-button")).click();
    {
      WebElement dropdown = driver.findElement(By.id("jsstatus"));
      dropdown.findElement(By.xpath("//option[. = 'Sticky']")).click();
    }
    driver.findElement(By.cssSelector("#jsstatus > option:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".uk-button:nth-child(1)")).click();
    driver.findElement(By.linkText("Content")).click();
    {
      List<WebElement> elements = driver.findElements(By.linkText("Set up your new site"));
      assert(elements.size() > 0);
    }
    System.out.println("{ASSESSOR}:DashboardPO:doLogout");
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.findElement(By.linkText("Log out")).click();
  }
  @Test
  public void deleteContent() {
    System.out.println("{ASSESSOR}:loginPO:doLogin");
    driver.get("http://localhost:8080/admin");
    driver.manage().window().setSize(new Dimension(1174, 825));
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("password");
    driver.findElement(By.cssSelector(".uk-button")).click();
    System.out.println("{ASSESSOR}:DashboardPO:doDeleteContent");
    driver.findElement(By.linkText("Content")).click();
    driver.findElement(By.linkText("Follow Bludit")).click();
    driver.findElement(By.id("jsdelete")).click();
    driver.switchTo().alert().accept();
    {
      List<WebElement> elements = driver.findElements(By.linkText("Follow Bludit"));
      assert(elements.size() == 0);
    }
    System.out.println("{ASSESSOR}:DashboardPO:doLogout");
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.findElement(By.linkText("Log out")).click();
  }
  @Test
  public void addUser() {
    System.out.println("{ASSESSOR}:loginPO:doLogin");
    driver.get("http://localhost:8080/admin");
    driver.manage().window().setSize(new Dimension(1174, 825));
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("password");
    driver.findElement(By.cssSelector(".uk-button")).click();
    System.out.println("{ASSESSOR}:DashboardPO:doAddUser");
    driver.findElement(By.linkText("Users")).click();
    driver.findElement(By.linkText("Add a new user")).click();
    driver.findElement(By.id("jsnew_username")).sendKeys("usertest");
    driver.findElement(By.id("jsnew_password")).sendKeys("usertest123");
    driver.findElement(By.id("jsconfirm_password")).sendKeys("usertest123");
    {
      WebElement dropdown = driver.findElement(By.id("jsrole"));
      dropdown.findElement(By.xpath("//option[. = 'Administrator']")).click();
    }
    driver.findElement(By.id("jsemail")).sendKeys("user@test.com");
    driver.findElement(By.cssSelector(".uk-button-primary")).click();
    assertThat(driver.findElement(By.linkText("usertest")).getText(), is("usertest"));
    System.out.println("{ASSESSOR}:DashboardPO:doLogout");
    driver.findElement(By.linkText("Log out")).click();
  }
  @Test
  public void changePassword() {
    System.out.println("{ASSESSOR}:loginPO:doLogin");
    driver.get("http://localhost:8080/admin");
    driver.manage().window().setSize(new Dimension(1174, 825));
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("password");
    driver.findElement(By.cssSelector(".uk-button")).click();
    System.out.println("{ASSESSOR}:DashboardPO:doChangePassword");
    driver.findElement(By.linkText("Users")).click();
    driver.findElement(By.linkText("usertest")).click();
    driver.findElement(By.linkText("Change password")).click();
    driver.findElement(By.id("jsnew_password")).sendKeys("newpassword");
    driver.findElement(By.id("jsconfirm_password")).sendKeys("newpassword");
    driver.findElement(By.cssSelector(".uk-button-primary")).click();
    {
      List<WebElement> elements = driver.findElements(By.id("alert"));
      assert(elements.size() > 0);
    }
    System.out.println("{ASSESSOR}:DashboardPO:doLogout");
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.findElement(By.linkText("Log out")).click();
  }
  @Test
  public void addSocials() {
    System.out.println("{ASSESSOR}:loginPO:doLogin");
    driver.get("http://localhost:8080/admin");
    driver.manage().window().setSize(new Dimension(1174, 825));
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("password")).sendKeys("password");
    driver.findElement(By.cssSelector(".uk-button")).click();
    System.out.println("{ASSESSOR}:DashboardPO:doAddSocials");
    driver.findElement(By.linkText("Users")).click();
    driver.findElement(By.linkText("admin")).click();
    driver.findElement(By.id("jsfacebook")).sendKeys("https://www.facebook.com/some_fake_user_name_52432562135863");
    driver.findElement(By.id("jsinstagram")).sendKeys("https://instagram.com/some_fake_user_name_52432562135863");
    driver.findElement(By.cssSelector(".uk-button-primary")).click();
    driver.findElement(By.linkText("Users")).click();
    driver.findElement(By.linkText("admin")).click();
    {
      String value = driver.findElement(By.id("jsfacebook")).getAttribute("value");
      assertThat(value, is("https://www.facebook.com/some_fake_user_name_52432562135863"));
    }
    {
      String value = driver.findElement(By.id("jsinstagram")).getAttribute("value");
      assertThat(value, is("https://instagram.com/some_fake_user_name_52432562135863"));
    }
    System.out.println("{ASSESSOR}:DashboardPO:doLogout");
    driver.findElement(By.linkText("Log out")).click();
  }
}