import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        JavascriptExecutor js =(JavascriptExecutor) driver;

        driver.get("https://www.worldometers.info/geography/flags-of-the-world/");

        driver.manage().window().maximize();

        //Scrolling page upto indian flag

        WebElement india=driver.findElement(By.xpath("//div[contains(text(),'India')]"));

        js.executeScript("arguments[0].scrollIntoView();",india);

        System.out.println(js.executeScript("return window.pageYOffset;"));




    }
}
