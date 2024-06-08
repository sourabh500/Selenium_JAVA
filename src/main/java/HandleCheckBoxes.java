import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleCheckBoxes {

    public static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Select specific checkbox

        driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //Select all the checkboxes

        List<WebElement> Checkbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//        for(WebElement ch:Checkbox)
//        {
//            ch.click();
//        }

        //Select last three checkboxes


        for(int i=4;i<Checkbox.size();i++)
        {
            Checkbox.get(i).click();
        }


    }

    }
