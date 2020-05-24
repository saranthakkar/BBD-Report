package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Resultpage extends DriverFactory {
    @FindBy (xpath = "//a[@id='filter-category-33012168-label']//span[@class='findability-facet__filter-text']")
    WebElement runningButton;

    public void runingFilter(){

        runningButton.click();
    }
}
