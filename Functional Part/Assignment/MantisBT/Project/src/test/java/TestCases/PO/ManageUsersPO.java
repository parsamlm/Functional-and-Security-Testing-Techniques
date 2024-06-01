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

    public String getUserUsernameByRowNumber(int rowNumber) {
        rowNumber += 2;
        return driver.findElement(By.xpath("/html[1]/body[1]/table[3]/tbody[1]/tr[" + rowNumber + "]/td[1]")).getText();
    }

    public String getUserRealNameByRowNumber(int rowNumber) {
        rowNumber += 2;
        return driver.findElement(By.xpath("/html[1]/body[1]/table[3]/tbody[1]/tr[" + rowNumber + "]/td[2]")).getText();
    }

    public String getUserEmailByRowNumber(int rowNumber) {
        rowNumber += 2;
        return driver.findElement(By.xpath("/html[1]/body[1]/table[3]/tbody[1]/tr[" + rowNumber + "]/td[3]")).getText();
    }

    public String getUserAccessLevelByRowNumber(int rowNumber) {
        rowNumber += 2;
        return driver.findElement(By.xpath("/html[1]/body[1]/table[3]/tbody[1]/tr[" + rowNumber + "]/td[4]")).getText();
    }

}
