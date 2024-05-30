package TestCases.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewIssuesPO extends MenuComponentPO {
    public ViewIssuesPO(WebDriver driver) {
        super(driver);
    }

    public String getIssueCategory() {
        return driver.findElement(By.cssSelector("form:nth-child(12) table.width100 tbody:nth-child(1) tr:nth-child(4) > td.center:nth-child(6)")).getText();
    }


    public String getIssueSeverity() {
        return driver.findElement(By.cssSelector("form:nth-child(12) table.width100 tbody:nth-child(1) tr:nth-child(4) > td.center:nth-child(7)")).getText();
    }

    public String getIssueSummary() {
        return driver.findElement(By.cssSelector("form:nth-child(12) table.width100 tbody:nth-child(1) tr:nth-child(4) > td.left:nth-child(10)")).getText();
    }
}
