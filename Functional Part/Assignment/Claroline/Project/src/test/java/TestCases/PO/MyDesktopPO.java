package TestCases.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyDesktopPO extends HomePO {

    public MyDesktopPO(WebDriver driver) {
        super(driver);
    }

    public CoursePO goToCourse(String courseTitle) {
        CoursePO coursePO = new CoursePO(driver);
        driver.findElement(By.xpath("//a[text()='" + courseTitle + "']")).click();
        return coursePO;
    }

    public void enrollUserToCourse(String courseTitle) {
        driver.findElement(By.cssSelector("div.portlet.mycourselist div.content:nth-child(2) div.userCommands ul:nth-child(2) li:nth-child(1) > a.userCommandsItem")).click();
        driver.findElement(By.id("coursesearchbox_keyword")).sendKeys(courseTitle);
        driver.findElement(By.xpath("//button[text()='Search']")).click();
        driver.findElement(By.cssSelector("div:nth-child(2) dl.courseList:nth-child(10) dt:nth-child(1) a:nth-child(2) > img.enrolment")).click();
    }
}
