import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class CloseSpecificBrowser {

    public static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/footer/div[1]/div/div[3]/a")).click();

        Set<String> ids = driver.getWindowHandles();

        for (String wids:ids)
        {
            String Title=driver.switchTo().window(wids).getTitle();
            System.out.println(Title);
            if (Title.equals("Make your donation now - Wikimedia Foundation"))
            {
                driver.close();
            }
        }

    }
}
