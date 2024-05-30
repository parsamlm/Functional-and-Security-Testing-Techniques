package TestCases.PO;

import TestCases.Utils.IssueAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewIssuesPO extends MenuComponentPO {
    public ViewIssuesPO(WebDriver driver) {
        super(driver);
    }

    public void assignAnIssue(IssueAction issueAction){
        driver.findElement(By.name("bug_arr[]")).click();
        driver.findElement(By.name("action")).click();
        driver.findElement(By.name("action")).findElement(By.xpath("//option[. = '" + issueAction.toString() + "']")).click();
        driver.findElement(By.cssSelector("input[value='OK']")).click();
        driver.findElement(By.cssSelector("input[value='Assign Issues']")).click();
    }

    public String getIssueCategory() {
        return driver.findElement(By.cssSelector("form:nth-child(12) table.width100 tbody:nth-child(1) tr:nth-child(4) > td.center:nth-child(6)")).getText();
    }


    public String getIssueSeverity() {
        return driver.findElement(By.cssSelector("form:nth-child(12) table.width100 tbody:nth-child(1) tr:nth-child(4) > td.center:nth-child(7)")).getText();
    }

    public String getIssueStatus(){
        return driver.findElement(By.cssSelector("form:nth-child(12) table.width100 tbody:nth-child(1) tr:nth-child(4) > td.center:nth-child(8)")).getText();
    }

    public String getIssueSummary() {
        return driver.findElement(By.cssSelector("form:nth-child(12) table.width100 tbody:nth-child(1) tr:nth-child(4) > td.left:nth-child(10)")).getText();
    }
}
