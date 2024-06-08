import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Open_Link_InNewTab {


    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://automationexercise.com/");

        driver.manage().window().maximize();

        WebElement Product=driver.findElement(By.xpath("//a[@href=\"/products\"]"));

        Actions act = new Actions(driver);

        act.keyDown(Keys.CONTROL).click(Product).keyUp(Keys.CONTROL).perform();

        


    }

}
