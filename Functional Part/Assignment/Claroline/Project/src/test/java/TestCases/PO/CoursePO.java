package TestCases.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoursePO extends HomePO {

    public CoursePO(WebDriver driver) {
        super(driver);
    }

    public void addCourseEvent(String eventTitle, String eventDayNo, String eventMonth, String eventYear, String eventLocation) {
        driver.findElement(By.cssSelector("img[src='/claroline11110/claroline/calendar/icon.png']")).click();
        driver.findElement(By.xpath("//a[text()='Add an event']")).click();
        driver.findElement(By.id("title")).sendKeys(eventTitle);
        driver.findElement(By.id("fday")).sendKeys(eventDayNo);
        driver.findElement(By.id("fmonth")).sendKeys(eventMonth);
        driver.findElement(By.id("fyear")).sendKeys(eventYear);
        driver.findElement(By.id("location")).sendKeys(eventLocation);
        driver.findElement(By.name("submitEvent")).click();
    }

    public void addCourseExercise(String exerciseTitle) {
        driver.findElement(By.cssSelector("img[src='/claroline11110/claroline/exercise/icon.png']")).click();
        driver.findElement(By.xpath("//a[text()='New exercise']")).click();
        driver.findElement(By.id("title")).sendKeys(exerciseTitle);
        driver.findElement(By.xpath("//input[@value='Ok']")).click();
    }
}
