import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {

    public static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

        driver.get("https://automationexercise.com/login");

        WebElement email_txt=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
        email_txt.sendKeys("shuklasourabh50@gmail.com");

        driver.close();
    }

}


