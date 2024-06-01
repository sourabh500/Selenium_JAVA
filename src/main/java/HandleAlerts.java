import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleAlerts {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();


        //Alert accept
        driver.findElement(By.linkText("Alert with OK")).click();
        driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();

        Thread.sleep(3000);

        driver.switchTo().alert().accept();


        //Alert enter text

        driver.findElement(By.linkText("Alert with Textbox")).click();
        driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();

        Alert myalert=driver.switchTo().alert();
        myalert.sendKeys("java");
        myalert.accept();


    }
}
