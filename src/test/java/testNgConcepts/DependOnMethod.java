package testNgConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethod {


    @Test(priority = 1)
    public void test1()
    {
         Assert.assertTrue(true);
         System.out.println("Test Passed");
    }

    @Test(priority = 2)
    public void test2()
    {
        Assert.assertTrue(false);
    }

    @Test(priority = 3, dependsOnMethods = {"test2"})
    public void test3()
    {
        Assert.assertTrue(true);
    }

}
