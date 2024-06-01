import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Array;
import java.time.Duration;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserWindowHandles

{

    public static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/footer/div[1]/div/div[3]/a")).click();

        Set <String> ids=driver.getWindowHandles();


        List<String> Windowid=new ArrayList<>(ids);

        String id1=Windowid.get(0);
        String id2=Windowid.get(1);


        driver.switchTo().window(id1);
        System.out.println(driver.getTitle());
        driver.switchTo().window(id2);
        System.out.println(driver.getTitle());




    }

}
