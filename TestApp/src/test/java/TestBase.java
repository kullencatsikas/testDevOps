import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by drew on 10/6/16.
 */
public abstract class TestBase {

    protected ChromeDriver driver;

    @BeforeTest
    public void beforeOperations() {
        System.out.println(System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", "/home/drew/IdeaProjects/TestApp/src/main/resources/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterOperations() {
        driver.quit();
    }

}
