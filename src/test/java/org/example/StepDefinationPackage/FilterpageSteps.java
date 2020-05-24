package org.example.StepDefinationPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.example.PageObjectPackage.Filterpage;
import org.example.PageObjectPackage.Homepage;
import org.example.PageObjectPackage.Resultpage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterpageSteps {
    Filterpage filterpage = new Filterpage();

    @Given("^user is on the result page of running filter$")
    public void user_is_on_the_result_page_of_running_filter() throws Throwable {
        Thread.sleep(4000);
    filterpage.runningHeadingAssertion();
    }

    @When("^user clicks on one of the product$")
    public void user_clicks_on_one_of_the_product() throws Throwable {
        Thread.sleep(4000);
        filterpage.product();
    }

    @Then("^user should able to see that product to add in basket$")
    public void user_should_able_to_see_that_product_to_add_in_basket() throws Throwable {
    Thread.sleep(4000);
        filterpage.productDescriptionAssertion();
    }

}
