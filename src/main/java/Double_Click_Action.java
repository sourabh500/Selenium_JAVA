import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Double_Click_Action {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement DoubleClick=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));

        String Field1=driver.findElement(By.xpath("//input[@id='field1']")).getText();

        Actions act=new Actions(driver);

        act.doubleClick(DoubleClick).perform();

        String Field2=driver.findElement(By.xpath("//input[@id='field2']")).getText();

        if (Field1.equals(Field2))
        {
            System.out.println("Test is passed");
        }

    }


}
