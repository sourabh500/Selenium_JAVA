import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BootStrap_DropDown {


    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("cricket");

        Thread.sleep(5000);

        List<WebElement> opt=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));

        for (WebElement li:opt)
        {
            String AllText=li.getText();
            if (AllText.equals("cricket live score"))
            {
                li.click();
                break;

            }
        }

        driver.close();


    }
}
