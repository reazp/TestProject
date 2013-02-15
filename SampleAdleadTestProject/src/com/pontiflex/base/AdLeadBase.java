package com.pontiflex.base;


import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

/**

 */
public class AdLeadBase extends WebDriverWrapper {



    @BeforeClass
    public static void setApplicationController() {
          driver = new FirefoxDriver();             
    }

    @Before
    public void setUp() {
    	driver.get("https://www.adleads.com/sign-up/");
    }
    @AfterClass
    public static void tearDown(){
    	driver.close();
    }
   
}
