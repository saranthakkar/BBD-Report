package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends DriverFactory {
    @FindBy(id = "searchTerm")
    WebElement searchbox;

    @FindBy(className = "_2mKaC")
    WebElement searchbutton;

    @FindBy(className = "search-title")
    WebElement resultSearch;

    @FindBy(xpath = "//div[@class='_3-aaF']//a[2]//span[1]")
    WebElement accountButton;

    public void doSearch(String item){
        searchbox.sendKeys(item);
        searchbutton.click();
    }

    public void homePageURL(){
        String actualurl = driver.getCurrentUrl();
        Assert.assertThat(actualurl, Matchers.containsString("argos"));
    }

    public void resultOfSearch(){
        //String actualtitle = driver.getCurrentUrl();
        //Assert.assertThat(actualtitle, Matchers.containsString("nike"));
    }

    public void clickOnAccountButton(){
        accountButton.click();
    }

}// class ends
