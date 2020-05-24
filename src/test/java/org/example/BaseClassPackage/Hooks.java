package org.example.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();

    @Before                             //select @Before with cucumber
    public void setup(){

        driverFactory.openBrowser();
    }

    @After                              //select @After with cucumber
    public void teardown() throws InterruptedException, IOException {

        driverFactory.closeBrowser();
    }

}
