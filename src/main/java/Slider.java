import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Slider {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.flipkart.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("Mobiles");

        driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).click();

        Actions act=new Actions(driver);

        WebElement MinSlider=driver.findElement(By.xpath("//div[@class='iToJ4v Kaqq1s']"));

        System.out.println("Default Location of minimum slider" +MinSlider.getLocation());  //(10,327)


        act.dragAndDropBy(MinSlider,200,327).perform();


        Thread.sleep(5000);


        System.out.println("After sliding Location of minimum slider" +MinSlider.getLocation());



    }


    }
