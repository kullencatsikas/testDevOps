import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by drew on 10/6/16.
 */
public class TestGoogle {

    @Test
    public void goToGoogle() {
        System.out.println(System.getProperty("user.dir"));

        System.setProperty("webdriver.chrome.driver", "/home/drew/IdeaProjects/TestApp/src/main/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement searchBar  = driver.findElement(By.id("lst-ib"));
        searchBar.sendKeys("test");
        WebElement searchButton = driver.findElement(By.className("sbico"));
        searchButton.click();

    }
}
