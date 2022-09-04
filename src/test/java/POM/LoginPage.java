package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePOM{

    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "email")
    private WebElement emailInput; //tc@tc.com

    @FindBy(css = "input[type='password']")
    private WebElement passwordInput; //Tccan98.

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    private WebElement firstSignInButton;

    @FindBy(css = "button[name='send']")
    private WebElement signInButton;

    String username = "tc@tc.com";

    String password = "Tccan98.";

    public void userEnterLoginCredentials() {

        firstSignInButton.click();
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInButton.click();
    }

    public void validateUserOnLoginPage() {
        Assert.assertTrue(emailInput.isDisplayed());
        Assert.assertTrue(passwordInput.isDisplayed());
        Assert.assertTrue(signInButton.isDisplayed());
    }




}
