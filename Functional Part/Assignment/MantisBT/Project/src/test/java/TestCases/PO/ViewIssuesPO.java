package TestCases.PO;

import TestCases.Utils.IssueAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewIssuesPO extends MenuComponentPO {
    public ViewIssuesPO(WebDriver driver) {
        super(driver);
    }

    public void assignAnIssue(IssueAction issueAction) {
        driver.findElement(By.name("bug_arr[]")).click();
        driver.findElement(By.name("action")).click();
        driver.findElement(By.name("action")).findElement(By.xpath("//option[. = '" + issueAction.toString() + "']")).click();
        driver.findElement(By.cssSelector("input[value='OK']")).click();
        driver.findElement(By.cssSelector("input[value='Assign Issues']")).click();
    }

    public String getIssueCategoryByRowNumber(int rowNumber) {
        rowNumber += 3;
        return driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[" + rowNumber + "]/td[6]")).getText();
    }


    public String getIssueSeverityByRowNumber(int rowNumber) {
        rowNumber += 3;
        return driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[" + rowNumber + "]/td[7]")).getText();
    }

    public String getIssueStatusByRowNumber(int rowNumber) {
        rowNumber += 3;
        return driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[" + rowNumber + "]/td[8]")).getText();
    }

    public String getIssueSummaryByRowNumber(int rowNumber) {
        rowNumber += 3;
        return driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[" + rowNumber + "]/td[10]")).getText();
    }
}
