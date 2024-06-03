import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Handle_StaticTable {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr"));

        List<WebElement> columns=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//th"));

//        System.out.println(rows.size());
//
//        System.out.println(columns.size());

        //print first column

//        for (int i=0;i<=columns.size();i++)
//        {
//            String text=columns.get(i).getText();
//            System.out.print(text+ "  ");
//        }

        //print all the rows and columns

//        for (int i=2;i<=rows.size();i++)
//        {
//
//            for (int j=1;j<=columns.size();j++)
//            {
//
//                String text=driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+i+"]//td["+j+"]")).getText();
//                System.out.print(text+ "            ");
//            }
//            System.out.println();
//        }


        //print book whose author name is mukesh

//        for(int i=2;i<=rows.size();i++)
//        {
//            String name=driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+i+"]//td[2]")).getText();
//            if (name.equals("Mukesh"))
//            {
//                String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+i+"]//td[1]")).getText();
//                System.out.println(bookname);
//
//            }
//
//        }


        //print total price of all the book

        int Total=0;
        for (int i=2;i<=rows.size();i++)
        {
           String price=driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+i+"]//td[4]")).getText();
            //System.out.println(price);
            Total=Total+Integer.parseInt(price);
        }

        System.out.println(Total);

    }

}
