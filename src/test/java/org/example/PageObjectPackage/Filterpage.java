package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Filterpage extends DriverFactory {

    @FindBy(xpath = "//div[@class='search-title']//h1")         //for Assertion of Running Heading
    WebElement runningHeading;

    @FindBy(xpath = "//body/div[@id='app']/div[@class='app app--search-lister']/div[@id='findability']/div/div[@class='bolt-v2 search']/div[@class='xs-row xs-auto--negative lg-auto--none search__content search__content--with-breadcrumb']/div[@class='xs-12--none lg-9--none xs-stack search__container']/div[@class='xs-block sm-row xs-auto--none sm-auto--none md-auto--none lg-auto--negative product-list']/div[2]/div[1]/div[1]/a[1]")
    WebElement nikePocket;

    @FindBy(xpath = "//div[@class='product-name bolt-v2']//span[1]")    //for Assertion of result page(product description)
    WebElement productDescription;

    public void runningHeadingAssertion(){
        String actualRunningHeading = runningHeading.getText();
        Assert.assertThat(actualRunningHeading, Matchers.containsString("Running"));
    }
    public void product(){
        nikePocket.click();
    }
    public void productDescriptionAssertion(){
        String actualproductDescription = productDescription.getText();
        Assert.assertThat(actualproductDescription, Matchers.containsString("Flask "));
    }
}
