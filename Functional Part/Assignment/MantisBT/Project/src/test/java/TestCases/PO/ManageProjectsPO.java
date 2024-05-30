package TestCases.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageProjectsPO extends MenuComponentPO {

    public ManageProjectsPO(WebDriver driver) {
        super(driver);
    }

    public void addNewProject(String name, ProjectStatus status, ProjectViewStatus viewStatus, String description) {
        driver.findElement(By.cssSelector("input[value='Create New Project']")).click();
        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("status")).click();
        driver.findElement(By.name("status")).findElement(By.xpath("//option[. = '" + status.toString().toLowerCase() + "']")).click();
        driver.findElement(By.name("view_state")).click();
        driver.findElement(By.name("view_state")).findElement(By.xpath("//option[. = '" + viewStatus.toString().toLowerCase() + "']")).click();
        driver.findElement(By.name("description")).sendKeys(description);
        driver.findElement(By.cssSelector("input[value='Add Project']")).click();
    }

    public String getProjectName() {
        return driver.findElement(By.cssSelector("body:nth-child(2) table.width100:nth-child(6) tbody:nth-child(1) tr.row-1:nth-child(3) > td:nth-child(1)")).getText().toLowerCase();
    }

    public String getProjectStatus() {
        return driver.findElement(By.cssSelector("body:nth-child(2) table.width100:nth-child(6) tbody:nth-child(1) tr.row-1:nth-child(3) > td:nth-child(2)")).getText();
    }

    public String getProjectViewStatus() {
        return driver.findElement(By.cssSelector("body:nth-child(2) table.width100:nth-child(6) tbody:nth-child(1) tr.row-1:nth-child(3) > td:nth-child(4)")).getText();
    }

    public String getProjectDescription() {
        return driver.findElement(By.cssSelector("body:nth-child(2) table.width100:nth-child(6) tbody:nth-child(1) tr.row-1:nth-child(3) > td:nth-child(5)")).getText();
    }
}
