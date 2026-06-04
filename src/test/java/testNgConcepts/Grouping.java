package testNgConcepts;

import org.testng.annotations.Test;

public class Grouping {

    @Test(priority = 1, groups = {"smoke"})
    public void test1()
    {
        System.out.println("This is smoke");
    }

    @Test(priority = 2, groups = {"sanity"})
    public void test2()
    {
         System.out.println("This is sanity");
    }

    @Test(priority = 3, groups = {"smoke","sanity"})
    public void test3()
    {
       System.out.println("smoke sanity");
    }

    @Test(priority = 4, groups = {"smoke","sanity","functional"})
    public void test4()
    {
        System.out.println("smoke sanity functional");
    }

    @Test(priority = 5, groups = {"functional"})
    public void test5()
    {
         System.out.println("functional");
    }

}
