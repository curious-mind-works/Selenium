package testNgConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Parallel_B {

    @BeforeClass
    public void setup()
    {
        System.out.println("BeforeClass");
    }

    @Test
    public void test()
    {
        System.out.println("Test");
    }

    @AfterClass
    public void tearDown()
    {
        System.out.println("AfterClass");
    }

}
