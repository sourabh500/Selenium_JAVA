import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Date_Pickers1 {


    public static WebDriver driver;


    static void SelectDate(String month,String year,String date)
    {
        while (true)
        {
            String Month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

            String Year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (Month.equals(month)&&Year.equals(year))
            {
                break;
            }
            driver.findElement(By.xpath("//a[@data-handler='prev']")).click();

        }



        List<WebElement> Date=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

        for(WebElement dt:Date)
        {
            String datetext=dt.getText();
            if (datetext.equals(date))
            {
                dt.click();
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://demo.automationtesting.in/Datepicker.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("datepicker1")).click();

        String M="October";
        String y="1997";
        String da="3";

        SelectDate(M,y,da);





        }
}
