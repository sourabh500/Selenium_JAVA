import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Navigate_Methods {


    public static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        URL myurl=new URL("https://automationexercise.com/login");

        driver.navigate().to(myurl);
        driver.navigate().to("https://www.nopcommerce.com/en/demo");

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();  //To refresh











    }


}
