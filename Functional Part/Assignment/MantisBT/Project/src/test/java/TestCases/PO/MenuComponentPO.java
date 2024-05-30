package TestCases.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuComponentPO {
    WebDriver driver;

    public MenuComponentPO(WebDriver driver) {
        this.driver = driver;
    }

    public ManageComponentPO goToManage() {
        driver.findElement(By.linkText("Manage")).click();
        return new ManageComponentPO(driver);
    }

    public ReportIssuePO goToReportIssue() {
        driver.findElement(By.linkText("Report Issue")).click();
        return new ReportIssuePO(driver);
    }

    public ViewIssuesPO goToViewIssues() {
        driver.findElement(By.linkText("View Issues")).click();
        return new ViewIssuesPO(driver);
    }

}
