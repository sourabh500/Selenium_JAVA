import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Keyboard_Actions {


    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://text-compare.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//textarea[@name='text1']")).sendKeys("I am skilled Automation Engineer");

        Actions act=new Actions(driver);

        //Select full text using ctrl+A  key
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        //Copy selected text using ctrl+c  key

        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();


        //pressing Tab key

        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();


        //Pasting the copied text in the next field using ctrl+V  key

        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();



    }

}
