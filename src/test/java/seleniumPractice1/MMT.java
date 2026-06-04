package seleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class MMT {

    WebDriver driver;

    @BeforeClass
    public void setup()
    {

        driver = new ChromeDriver();

        String url = "https://www.makemytrip.com/";

        driver.get(url);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void dropDown() throws InterruptedException {
        WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));

      WebElement ele =  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@alt='minimize']")));

      ele.click();


        driver.findElement(By.xpath("//*[@class='commonModal__close']")).click();

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//
//        WebElement flight = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='menu_Flights']")));
//
//        flight.click();


        WebElement flight = driver.findElement(By.xpath("//*[@class='menu_Flights']"));

        Actions act = new Actions(driver);

        act.click(flight).build().perform();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@alt='minimize']")).click();

        Actions act1 = new Actions(driver);

        act1.moveByOffset(100,100).click().perform();



//        WebElement round = driver.findElement(By.xpath("//li[@data-cy ='roundTrip']"));
//
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click();",round);


        driver.findElement(By.xpath("//*[@for='fromCity']")).click();

        List<WebElement> list1 = driver.findElements(By.xpath("//ul[@role='listbox']/li//p[@class='font14 appendBottom5 blackText']"));

        for(WebElement city1 : list1)
        {

            if(city1.getText().contains("Pune"))
            {

                city1.click();
                break;

            }

        }

        driver.findElement(By.xpath("//*[@for='toCity']")).click();

        List<WebElement> list2 = driver.findElements(By.xpath("//ul[@role='listbox']/li//p[@class='font14 appendBottom5 blackText']"));

        for(WebElement city2 : list2)
        {
            if(city2.getText().contains("Mumbai"))
            {
                city2.click();
                break;
            }

        }

        WebElement Dmonth = driver.findElement(By.xpath("//*[@class='DayPicker-Caption']/div"));

//        WebDriverWait ww = new WebDriverWait(driver,Duration.ofSeconds(4));
//
//        WebElement ee = ww.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@alt='minimize']")));
//
//        ee.click();

        while(true)
        {
            if(Dmonth.getText().contains("Feb"))
            {
                break;
            }

            WebElement Dnext = driver.findElement(By.xpath("//span[@aria-label = 'Next Month']"));
            Dnext.click();

        }

        List<WebElement> date1 = driver.findElements(By.xpath("//*[@class='DayPicker-Month'][1]//div[@class='dateInnerCell']/p[1]"));
        List<WebElement> price = driver.findElements(By.xpath("//*[@class='DayPicker-Month'][1]//div[@class='dateInnerCell']/p[2]"));

       for(int i=0;i<date1.size();i++)
       {

           System.out.println(date1.get(i).getText());


       }


    }

    @AfterClass
    public void tearDown() throws InterruptedException
    {

         Thread.sleep(4000);

         driver.close();

    }

}
