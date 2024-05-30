package TestCases.PO;

import TestCases.Utils.IssuePriority;
import TestCases.Utils.IssueReproducibility;
import TestCases.Utils.IssueSeverity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReportIssuePO extends MenuComponentPO {
    public ReportIssuePO(WebDriver driver) {
        super(driver);
    }

    public void addNewIssue(String categoryIssue, IssueReproducibility issueReproducibility, IssueSeverity issueSeverity, IssuePriority issuePriority, String summary, String description) {
        driver.findElement(By.name("category_id")).click();
        driver.findElement(By.name("category_id")).findElement(By.xpath("//option[. = '" + categoryIssue + "']")).click();
        driver.findElement(By.name("reproducibility")).click();
        driver.findElement(By.name("reproducibility")).findElement(By.xpath("//option[. = '" + issueReproducibility.toString().toLowerCase() + "']")).click();
        driver.findElement(By.name("severity")).click();
        driver.findElement(By.name("severity")).findElement(By.xpath("//option[. = '" + issueSeverity.toString().toLowerCase() + "']")).click();
        driver.findElement(By.name("priority")).click();
        driver.findElement(By.name("priority")).findElement(By.xpath("//option[. = '" + issuePriority.toString().toLowerCase() + "']")).click();
        driver.findElement(By.name("summary")).sendKeys(summary);
        driver.findElement(By.name("description")).sendKeys(description);
        driver.findElement(By.cssSelector("input[value='Submit Report']")).click();
    }

}
