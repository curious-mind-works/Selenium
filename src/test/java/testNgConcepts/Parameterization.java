package testNgConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

    @BeforeClass
    public void setup()
    {
        System.out.println("This is BeforeClass ..........");
    }

    @Test(priority = 2)
    @Parameters({"first","second"})
    public void para(String first, String second)
    {

        System.out.println("First : "+first+" ,Second : "+second);

    }

    @AfterClass
    public void tearDown()
    {

        System.out.println("This is AfterClass .............");
    }




}
