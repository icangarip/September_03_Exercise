package StepDefinition;

import POM.ProductPage;
import io.cucumber.java.en.*;

public class Scenario3 {

    ProductPage productPage;

    @When("User add product to cart")
    public void user_add_product_to_cart() throws InterruptedException {
        productPage = new ProductPage();
        productPage.purchaseFunctionality();
    }
    @Then("Validate order")
    public void validate_order() throws InterruptedException {
        productPage = new ProductPage();
        Thread.sleep(5000);
        productPage.validateOrder();
    }

}
