import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by drew on 10/6/16.
 */
public abstract class TestGoogle {

    protected ChromeDriver driver;

    @Before
    public void buildUp() {
        System.setProperty("webdriver.chrome.driver", "/home/drew/IdeaProjects/TestApp/src/drivers/chromedriver");
        driver = new ChromeDriver();
    }


    @After
    public void breakDown() {
        driver.quit();
    }

}
