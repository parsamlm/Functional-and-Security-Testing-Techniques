package TestCases.PO;

import TestCases.Utils.UserAccessLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageUsersPO extends ManageComponentPO {

    public ManageUsersPO(WebDriver driver) {
        super(driver);
    }

    public void addNewUser(String username, String realName, String email, UserAccessLevel userAccessLevel) {
        driver.findElement(By.cssSelector("input[value='Create New Account']")).click();
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("realname")).sendKeys(realName);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("access_level")).click();
        driver.findElement(By.name("access_level")).findElement(By.xpath("//option[. = '" + userAccessLevel.toString().toLowerCase() + "']")).click();
        driver.findElement(By.cssSelector("input[value='Create User']")).click();
    }

    public String getNewUserName() {
        return driver.findElement(By.cssSelector("body:nth-child(2) table.width100:nth-child(8) tbody:nth-child(1) tr.row-1:nth-child(4) > td:nth-child(1)")).getText();
    }

    public String getRealName() {
        return driver.findElement(By.cssSelector("body:nth-child(2) table.width100:nth-child(8) tbody:nth-child(1) tr.row-1:nth-child(4) > td:nth-child(2)")).getText();
    }

    public String getEmail() {
        return driver.findElement(By.cssSelector("body:nth-child(2) table.width100:nth-child(8) tbody:nth-child(1) tr.row-1:nth-child(4) > td:nth-child(3)")).getText();
    }

    public String getAccessLevel() {
        return driver.findElement(By.cssSelector("body:nth-child(2) table.width100:nth-child(8) tbody:nth-child(1) tr.row-1:nth-child(4) > td:nth-child(4)")).getText();
    }


    public String getErrorMessage() {
        return driver.findElement(By.cssSelector("table.width50 tbody:nth-child(1) tr:nth-child(2) td:nth-child(1) > p.center")).getText();
    }
}
