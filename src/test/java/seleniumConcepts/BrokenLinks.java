package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {

    WebDriver driver;

    @BeforeClass
    public void setup()
    {

    }

    @Test
    public void test1() throws IOException {

       List<WebElement> links = driver.findElements(By.tagName("a"));

       for(WebElement link : links)
       {

           String url = link.getAttribute("href");

           if(url==null || url.isEmpty())
           {

               continue;

           }

           URL linkURL = new URL(url);
           HttpURLConnection con = (HttpURLConnection) linkURL.openConnection();
           con.connect();

           if(con.getResponseCode()>=400)
           {
               System.out.println("Broken Links");
           }


       }



    }

    @AfterClass
    public void tearDown()
    {

    }

}
