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

        driver.get("https://www.thepiratebay.org/torrent/11329987/Boyhood_(2014)_720p_BrRip_x264_-_YIFY");

        WebElement searchBar  = driver.findElement(By.xpath(".//a[@title='Get this torrent']"));
        //searchBar.sendKeys("boyhood");
       // WebElement searchButton = driver.findElement(By.className("sbico"));
        searchBar.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
