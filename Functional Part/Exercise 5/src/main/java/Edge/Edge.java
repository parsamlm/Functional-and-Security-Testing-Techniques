package Edge;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import utils.Helper;

public class Edge {
    public static void main(String[] args) {
        // for automatic driver management:
        // WebDriverManager.edgedriver().setup();
        // for manual driver management:
        System.setProperty("webdriver.edge.driver", "/Users/parsa/IdeaProjects/Functional-and-Security-Testing-Techniques/Exercises/Functional Part/Exercise 5/src/main/java/Edge/msedgedriver");
        WebDriver driver = new EdgeDriver();
        new Helper(driver).testTitle();
    }
}