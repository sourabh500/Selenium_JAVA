import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Get_Methods {

        public static WebDriver driver;

        public static void main(String[] args){

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

                //get(url)
                driver.get("https://automationexercise.com/login");  //To open url

                //getTitle()
                System.out.println(driver.getTitle());  //Return title of the page

                //getCurrentUrl()
                System.out.println(driver.getCurrentUrl());  //Return current url of the page

                //getPgeSource()
                System.out.println(driver.getPageSource());  //Return page source code

                //getWindowHandle()
                System.out.println(driver.getWindowHandle()); //Return id of a single browser window

                //getWindowHandles()
              Set<String> ids=driver.getWindowHandles();  //Return id's of multiple browser window




        }


}
