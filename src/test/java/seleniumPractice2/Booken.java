package seleniumPractice2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Booken {

    WebDriver driver;

    @Test
    public void test() throws IOException {

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for(WebElement link : links)
        {
            String url = link.getAttribute("href");

            if(url==null|| url.isEmpty())
            {
                continue;
            }

            URL linkURL = new URL(url);
            HttpURLConnection con = (HttpURLConnection) linkURL.openConnection();
            con.connect();

            if(con.getResponseCode()>=33)
            {
                System.out.println("Yes it is ");
            }


        }


    }

    @Test
    public void Options()
    {

//     ChromeOptions options = new ChromeOptions();
//     options.addArguments("--headless=new");
//

        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);

    }


    @Test
    public void ss()
    {

//        TakesScreenshot ts = (TakesScreenshot) driver;
//
//        File src = ts.getScreenshotAs(OutputType.FILE);
//        File trg = new File("");
//
//        src.renameTo(trg);

        WebElement ele = driver.findElement(By.xpath(""));

        File src = ele.getScreenshotAs(OutputType.FILE);
        File trg = new File("");

        src.renameTo(trg);






    }

    @Test
    public void script()
    {
        WebElement ele = driver.findElement(By.xpath(""));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click()");

        js.executeScript("arguments[0].setAttribute('value','Nmae')",ele);

        js.executeScript("arguments[0].scrollIntoView()",ele);

        js.executeScript("window.scrollBy(0,500)","");


    }

}
