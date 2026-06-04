package testNgConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

    //@Test
    public void Test_HardAssertion() {

        String expected = "Welcome";
        String actual = "welcome";

        //We are comparing different value even if method is passing because if condition not affect the method validation to overcome this problem we use assertion.
        if(expected.equals(actual)) {
            System.out.println("Test Passed...");
        }

        else {
            System.out.println("Test Failed...");
        }

        System.out.println("1...");

        System.out.println("2...");

        Assert.assertEquals(actual, expected);


        System.out.println("3...");

        System.out.println("4...");

    }


    @Test
    public void Test_SoftAssertion() {

        System.out.println("1...");

        System.out.println("2...");

        SoftAssert sa = new SoftAssert();

        sa.assertEquals(123, 12);

        System.out.println("3...");

        System.out.println("4...");

        // it is used to validate the method without using this soft assert won't be validate test method

        sa.assertAll();

    }


}
