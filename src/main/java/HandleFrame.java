import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleFrame {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://ui.vision/demo/webtest/frames/");

       WebElement frame1=driver.findElement(By.xpath("/html/frameset/frame[1]"));


        driver.switchTo().frame(frame1);

        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("sourabh");

        driver.switchTo().defaultContent();

        //second frame
        WebElement frame2=driver.findElement(By.xpath("/html/frameset/frame[2]"));
        driver.switchTo().frame(frame2);

        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("shukla");
    }
}
