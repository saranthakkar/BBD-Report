package org.example.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.lexer.Th;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;

    public DriverFactory(){                                     //this is a constructor

       PageFactory.initElements(driver,this);
   }

    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
    }

    public void closeBrowser() throws InterruptedException, IOException {
        Thread.sleep(1000);

        TakesScreenshot takesScreenshot = ((TakesScreenshot) driver);
        File sourcefile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destinationFolder = new File("D:\\Desktop\\Screenshot.png");
        FileUtils.copyFile(sourcefile,destinationFolder);
        Thread.sleep(1500);
        driver.quit();
    }
}
