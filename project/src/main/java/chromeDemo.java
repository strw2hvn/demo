import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Leonard on 4/6/2017.
 */
public class chromeDemo {
     public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "C:\\opt\\chromedriver.exe");

         WebDriver driver = new ChromeDriver();
         driver.get("http://www.google.com/xhtml");
         Thread.sleep(5000);  // Let the user actually see something!
         WebElement searchBox = driver.findElement(By.name("q"));
         searchBox.sendKeys("ChromeDriver");
         searchBox.submit();
         Thread.sleep(5000);  // Let the user actually see something!
         driver.quit();
     }

}
