package TestCases.PO;

import TestCases.Utils.AnswerType;
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

    public void goToCourseExercise() {
        driver.findElement(By.cssSelector("img[src='/claroline11110/claroline/exercise/icon.png']")).click();
    }

    public void changeCourseExerciseVisibility() {
        goToCourseExercise();
        driver.findElement(By.cssSelector("table tbody tr:nth-child(2) td:nth-child(4) a img")).click();
    }

    public String getCourseExerciseVisibility(int rowNumber) {
        goToCourseExercise();
        String visibility = driver.findElement(By.cssSelector("table tbody tr:nth-child(" + rowNumber + ") td:nth-child(4) a img")).getAttribute("alt");
        if (visibility.contentEquals("Make visible")) {
            return "Make visible";
        } else {
            return "Make invisible";
        }
    }

    public void addQuestion(String title, AnswerType type, boolean isNewQuestion) {
        if (isNewQuestion)
            driver.findElement(By.cssSelector("table tbody tr:nth-child(2) td:nth-child(2) a img")).click();
        driver.findElement(By.xpath("//a[text()='New question']")).click();
        driver.findElement(By.id("title")).sendKeys(title);
        switch (type) {
            case MULTIPLE_CHOICE_UNIQUE_ANSWER:
                driver.findElement(By.id("MCUA")).click();
                break;
            case MULTIPLE_CHOICE_MULTIPLE_ANSWER:
                driver.findElement(By.id("MCMA")).click();
                break;
            case TRUE_FALSE:
                driver.findElement(By.id("TF")).click();
                break;
            case FILL_IN_THE_BLANKS:
                driver.findElement(By.id("FIB")).click();
                break;
            case MATCHING:
                driver.findElement(By.id("MATCHING")).click();
                break;
        }
        driver.findElement(By.xpath("//input[@value='Ok']")).click();
    }

    public void handleAnswerTypeMCUA(int answersCount, int correctAnswerNumber, String correctAnswerWeight, String wrongAnswerWeight) {
        for (int i = 1; i <= answersCount - 2; i++) {
            driver.findElement(By.name("cmdAddAnsw")).click();
        }
        driver.findElement(By.id("correct_" + correctAnswerNumber)).click();
        for (int i = 1; i <= answersCount; i++) {
            driver.findElement(By.name("grade_" + i)).clear();
            if (i != correctAnswerNumber) {
                driver.findElement(By.name("grade_" + i)).sendKeys(wrongAnswerWeight);
            } else {
                driver.findElement(By.name("grade_" + i)).sendKeys(correctAnswerWeight);
            }
        }
        driver.findElement(By.name("cmdOk")).click();
    }

    public void handleAnswerTypeTF(int correctAnswerNumber, String correctAnswerWeight, String wrongAnswerWeight) {
        if (correctAnswerNumber == 1) {
            driver.findElement(By.id("trueCorrect")).click();
            driver.findElement(By.name("trueGrade")).clear();
            driver.findElement(By.name("trueGrade")).sendKeys(correctAnswerWeight);
        } else if (correctAnswerNumber == 2) {
            driver.findElement(By.id("falseCorrect")).click();
            driver.findElement(By.name("trueGrade")).clear();
            driver.findElement(By.name("trueGrade")).sendKeys(wrongAnswerWeight);
        }
        driver.findElement(By.name("cmdOk")).click();
    }

    public void handleAnswerTypeMCMA(int answersCount, int correctAnswerNumber, int falseAnswerNumber, String correctAnswerWeight, String wrongAnswerWeight) {
        for (int i = 1; i <= answersCount - 2; i++) {
            driver.findElement(By.name("cmdAddAnsw")).click();
        }
        driver.findElement(By.id("correct_" + correctAnswerNumber)).click();
        for (int i = 1; i <= answersCount; i++) {
            driver.findElement(By.name("grade_" + i)).clear();
            if (i == correctAnswerNumber) {
                driver.findElement(By.name("grade_" + i)).sendKeys(correctAnswerWeight);
            } else if (i == falseAnswerNumber) {
                driver.findElement(By.name("grade_" + i)).sendKeys(wrongAnswerWeight);
            } else {
                driver.findElement(By.name("grade_" + i)).sendKeys(Integer.toString(0));
            }
        }
        driver.findElement(By.name("cmdOk")).click();
    }

    public void goToExercisePage() {
        driver.findElement(By.cssSelector("div:nth-child(3) div.breadcrumbTrails:nth-child(2) ul.breadCrumbs li.breadCrumbsNode:nth-child(4) > a:nth-child(1)")).click();
    }

    public String getQuestionTitle(int rowNumber) {
        return driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[3]/div[2]/table[1]/tbody[1]/tr[" + rowNumber + "]/td[2]")).getText();
    }

    public String getAnswerType(int rowNumber) {
        return driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[3]/div[2]/table[1]/tbody[1]/tr[" + rowNumber + "]/td[4]")).getText();
    }
}
