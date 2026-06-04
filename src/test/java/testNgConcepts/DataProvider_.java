package testNgConcepts;


import org.testng.annotations.*;

public class DataProvider_ {

    @BeforeClass
    public void setup()
    {
          System.out.println("This is BeforeClass ..........");
    }

    @Test(priority = 1, dataProvider="dp")
    public void data(String a, String b)
    {

        System.out.println("First : "+a+" ,Second : "+b);

    }


    @AfterClass
     public void tearDown()
    {

        System.out.println("This is AfterClass .............");

    }

    @DataProvider(name = "dp")
    public Object[][] login()
    {

        Object[][] data = {{"Sanu","Verma"},{"Ankit","Verma"},{"Ayush","Verma"}};
        return data;

    }



}
