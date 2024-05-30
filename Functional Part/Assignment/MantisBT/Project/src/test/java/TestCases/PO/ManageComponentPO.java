package TestCases.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageComponentPO extends MenuComponentPO {

    public ManageComponentPO(WebDriver driver) {
        super(driver);
    }

    public ManageUsersPO goToManageUsers() {
        driver.findElement(By.linkText("Manage Users")).click();
        return new ManageUsersPO(driver);
    }

    public ManageProjectsPO goToManageProjects() {
        driver.findElement(By.linkText("Manage Projects")).click();
        return new ManageProjectsPO(driver);
    }

}
