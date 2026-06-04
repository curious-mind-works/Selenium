package testNgConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class Annotation {

    @BeforeSuite
    public void bs() {

        System.out.println("This is BeforeSuite .... ");

    }

    @AfterSuite
    public void as() {

        System.out.println("This is AfterSuite .... ");

    }

    @BeforeTest
    public void bt() {

        System.out.println("This is BeforeTest .... ");

    }

    @AfterTest
    public void at() {

        System.out.println("This is AfterTest .... ");

    }

    @BeforeClass
    public void bc() {

        System.out.println("This is BeforeClass .... ");

    }

    @AfterClass
    public void ac() {

        System.out.println("This is AfterClass .... ");

    }

    @BeforeMethod
    public void bm() {

        System.out.println("This is BeforeMethod .... ");

    }

    @AfterMethod
    public void am() {

        System.out.println("This is AfterMethod .... ");

    }

    @Test
    public void tm1() {

        System.out.println("This is Test Method1 .... ");

    }

    @Test
    public void tm2() {

        System.out.println("This is Test Method2 .... ");

    }


}
