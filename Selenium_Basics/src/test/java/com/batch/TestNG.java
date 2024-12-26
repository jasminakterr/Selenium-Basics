package com.batch;

import org.testng.annotations.*;

public class TestNG {
    @BeforeSuite
    public void beforeSuiteExample(){
        System.out.println("Before Suite Example");
    }
    @BeforeTest
    public void beforeTestExample(){
        System.out.println("Before Test Example");
    }
    @BeforeClass
    public void beforeClassExample(){
        System.out.println("Before Class Example");
    }
    @BeforeMethod
    public void beforeMethodExample(){
        System.out.println("Before Method Example");
    }
    @Test(priority = 1)
    public void testExample1(){
        System.out.println("Test Example 2");
    }
    @Test(priority = 0)
    public void testExample2(){
        System.out.println("Test Example 1");
    }
    @AfterMethod
    public void afterMethodExample(){
        System.out.println("After Method Example");
    }
    @AfterClass
    public void afterClassExample(){
        System.out.println("After Class Example");
    }
    @AfterTest
    public void afterTestExample(){
        System.out.println("After Test Example");
    }
    @AfterSuite
    public void afterSuiteExample() {
        System.out.println("After Suite Example");
    }

}
