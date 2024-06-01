import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Conditional_Methods {

    public static WebDriver driver;


    public void main(String[] args)
    {


        driver.get("https://automationexercise.com/login");

        //Access these commands through WebElements

        //isDisplayed()

        //WebElement logo=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img"));
        boolean logo=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img")).isDisplayed();

        System.out.println(logo);  // Returns boolean value

        //isEnabled

        boolean Enable=driver.findElement(By.xpath("//input[@type='email']")).isEnabled();
        System.out.println(Enable);

        //isSelected



    }
}
