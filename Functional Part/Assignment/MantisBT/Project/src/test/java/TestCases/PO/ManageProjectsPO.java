package TestCases.PO;

import TestCases.Utils.ProjectStatus;
import TestCases.Utils.ProjectViewStatus;
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

    public void addCategoryToExistingProject(String projectName, String categoryName) {
        goToProject(projectName);
        driver.findElement(By.cssSelector("form[action='manage_proj_cat_add.php'] input[name='name']")).sendKeys(categoryName);
        driver.findElement(By.cssSelector("input[value='Add Category']")).click();
    }

    private void goToProject(String projectName) {
        driver.findElement(By.linkText(projectName)).click();
    }

    public String getProjectNameByRowNumber(int rowNumber) {
        rowNumber += 2;
        return driver.findElement(By.xpath("/html[1]/body[1]/table[3]/tbody[1]/tr[" + rowNumber + "]/td[1]")).getText();
    }

    public String getProjectStatusByRowNumber(int rowNumber) {
        rowNumber += 2;
        return driver.findElement(By.xpath("/html[1]/body[1]/table[3]/tbody[1]/tr[" + rowNumber + "]/td[2]")).getText();
    }

    public String getProjectViewStatusByRowNumber(int rowNumber) {
        rowNumber += 2;
        return driver.findElement(By.xpath("/html[1]/body[1]/table[3]/tbody[1]/tr[" + rowNumber + "]/td[4]")).getText();
    }

    public String getProjectDescriptionByRowNumber(int rowNumber) {
        rowNumber += 2;
        return driver.findElement(By.xpath("/html[1]/body[1]/table[3]/tbody[1]/tr[" + rowNumber + "]/td[5]")).getText();
    }

    public String getCategoryNameByRowNumber(int rowNumber) {
        rowNumber += 2;
        return driver.findElement(By.xpath("/html[1]/body[1]/div[6]/a[1]/table[1]/tbody[1]/tr[" + rowNumber + "]/td[1]")).getText();
    }
}
