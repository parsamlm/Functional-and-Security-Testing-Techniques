package TestCases.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPO {
    WebDriver driver;
    public DashboardPO(WebDriver driver) {
        this.driver = driver;
    }

    public MenuComponentPO getMenuComponent() {
        return new MenuComponentPO(driver);
    }

    public void doLogout() {
        driver.findElement(By.linkText("Logout")).click();
    }
}
