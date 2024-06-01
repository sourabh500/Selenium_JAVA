import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImpilcitWait {

    public static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //This statement works for every statement until you close the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://automationexercise.com/login");

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shuklasourabh50@gmail.com");

        driver.close();
    }
}
