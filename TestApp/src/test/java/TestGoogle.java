import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by drew on 10/6/16.
 */
public class TestGoogle extends TestBase {

    @Test

    public  void goToGoogle() {

        driver.get("http://www.google.com");
        WebElement searchBar  = driver.findElement(By.id("lst-ib"));
        searchBar.sendKeys("boyhood");
        WebElement searchButton = driver.findElement(By.className("sbico"));
        searchButton.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
