package seleniumPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class First {

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
    public void test1()
    {

        driver.findElement(By.xpath("//img[@alt='minimize']")).click();

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ele =  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-cy='closeModal']")));

        ele.click();

        WebElement el1 = driver.findElement(By.xpath("//*[contains(@class,'headerIconTextAlignment chNavText darkGreyText')]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",el1);

    }

    @AfterClass
    public void tearDown()
    {

    }
}
