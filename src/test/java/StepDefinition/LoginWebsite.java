package StepDefinition;

import POM.LoginPage;
import io.cucumber.java.en.*;

public class LoginWebsite {

    LoginPage loginPage;

    @Given("User navigate to login page")
    public void user_navigate_to_login_page() throws InterruptedException {
        loginPage = new LoginPage();
        //loginPage.validateUserOnLoginPage();
    }
    @When("User enter login credentials")
    public void user_enter_login_credentials() {
        loginPage = new LoginPage();
        loginPage.userEnterLoginCredentials();
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {

    }

}
