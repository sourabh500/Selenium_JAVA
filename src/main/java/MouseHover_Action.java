import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHover_Action {


    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();


        WebElement Image=driver.findElement(By.xpath("//img[@src='/get_product_picture/1']"));

        Actions act=new Actions(driver);

        act.moveToElement(Image).build().perform();


    }

}
