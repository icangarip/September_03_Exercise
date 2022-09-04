package StepDefinition;

import POM.MyAccountPage;
import io.cucumber.java.en.*;

public class Scenario2 {

    MyAccountPage myAccountPage;

    @When("User navigate to my account page")
    public void user_navigate_to_my_account_page() throws InterruptedException {
        myAccountPage = new MyAccountPage();
        myAccountPage.navigateToMyAccountPage();
    }
    @When("Add new address")
    public void add_new_address() {
        myAccountPage = new MyAccountPage();
        myAccountPage.addNewAddress();

    }
    @Then("Validate address")
    public void validate_address() {
        myAccountPage = new MyAccountPage();
        myAccountPage.validateAddressSuccessMessage();

    }

}
