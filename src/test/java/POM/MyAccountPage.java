package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MyAccountPage extends BasePOM{

    public MyAccountPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "span[class='customer-name']")
    private WebElement accountDrop;

    @FindBy(xpath = "//a[text()='My Account']")
    private WebElement myAccountButton;
    public void navigateToMyAccountPage() throws InterruptedException {
        accountDrop.click();
        myAccountButton.click();
    }

    @FindBy(xpath = "//span[text()='Manage Addresses']")
    private WebElement manageAddresses;

    @FindBy(id = "street_1")
    private WebElement streetAddressBox;

    @FindBy(id = "city")
    private WebElement cityBox;

    @FindBy(id = "region_id")
    private WebElement stateDrop;

    @FindBy(id = "zip")
    private WebElement zipCodeBox;

    @FindBy(id = "telephone")
    private WebElement phoneNumberBox;

    @FindBy(css = "button[title='Save Address']")
    private WebElement saveAddressButton;

    @FindBy(css = "div[data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    private WebElement successMessage;

    @FindBy(css = "button[role='add-address']")
    private WebElement addAddressButton;

    public void addNewAddress() {
        manageAddresses.click();
        addAddressButton.click();
        streetAddressBox.sendKeys("canassdcan");
        cityBox.sendKeys("izsdsdmir");
        zipCodeBox.sendKeys("77077");
        Select drpCountry = new Select(stateDrop);
        drpCountry.selectByVisibleText("Texas");
        phoneNumberBox.sendKeys("1234567810");
        saveAddressButton.click();
    }

    public void validateAddressSuccessMessage() {
        Assert.assertTrue(successMessage.isDisplayed());
    }



}
