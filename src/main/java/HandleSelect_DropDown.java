import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class HandleSelect_DropDown {


    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement countryEle=driver.findElement(By.xpath("//select[@id='country']"));
        Select country=new Select(countryEle);

        //country.selectByValue("india"); //select by value

//        Thread.sleep(2000);
//
//        country.selectByIndex(2); //select by index

//        Thread.sleep(2000);
//
        //country.selectByVisibleText("Australia");  //select by visible text


        //Printing all the options in dropdown
        List<WebElement> opt=country.getOptions();

        //int number=opt.size();

//        for (int i=0;i<=number;i++)
//        {
//            System.out.println(opt.get(i).getText());
//        }


        for (WebElement op:opt)
        {
            System.out.println(op.getText());
        }






    }
}


