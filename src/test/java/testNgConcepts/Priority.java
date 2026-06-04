package testNgConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority {

 /*

1) TestNG execute test methods based on alphabetical order.
2) @Test(priority=num) controls the order of execution.
3) Once you provide priority to the test methods, then order of methods is not considered.
4) priorities can be random numbers( no need to have consecutive numbers)
5) If you dont provide priority then default value is Zero (0).
6) If the priorities are same then again execute methods in alphabetical order.
7) Negitive values are allowed in priority.
8) TestNG execute test methods only if they are having @Test annotation.

  */

  @BeforeClass
  public void setup()
  {

  }

  @Test(priority = -1)
  public void test1()
  {
      System.out.println("Test 1");
  }

    @Test(priority = 0)
    public void test2()
    {
        System.out.println("Test 2");
    }

    @Test(priority = 7)
    public void test3()
    {
        System.out.println("Test 3");
    }

    @Test()
    public void test4()
    {
        System.out.println("Test 4");
    }

    @Test(priority = 7)
    public void test5()
    {
        System.out.println("Test 5");
    }

    @Test()
    public void test6()
    {
        System.out.println("Test 6");
    }

    @AfterClass
    public void tearDown()
    {

    }

}
