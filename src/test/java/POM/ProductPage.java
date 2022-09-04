package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage extends BasePOM{

    public ProductPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='Men']")
    private WebElement menButton;

    @FindBy(css = "img[alt='Argus All-Weather Tank']")
    private WebElement firstProduct;

    @FindBy(id = "option-label-size-143-item-169")
    private WebElement productSize;

    @FindBy(id = "option-label-color-93-item-52")
    private WebElement productColor;

    @FindBy(css = "button[title='Add to Cart']")
    private WebElement addToCartButton;

    @FindBy(css = "span[class='counter qty']")
    private WebElement cartButton;

    @FindBy(id = "top-cart-btn-checkout")
    private WebElement proceedTOCheckout;

    @FindBy(css = "input[type='radio']")
    private WebElement radioButton;

    @FindBy(css = "button[class='button action continue primary']")
    private WebElement nextButton;

    @FindBy(xpath = "//span[text()='Place Order']")
    private WebElement placeOrderButton;

    @FindBy(css = "span[class='base']")
    private WebElement successMessageForOrder;

    public void purchaseFunctionality() throws InterruptedException {
        menButton.click();
        firstProduct.click();
        productSize.click();
        productColor.click();
        addToCartButton.click();
        waitUntilVisibleAndClickableThenClick(cartButton);
        proceedTOCheckout.click();
        radioButton.click();
        nextButton.click();
        Thread.sleep(3000);
        waitUntilVisibleAndClickableThenClick(placeOrderButton);
    }

    public void validateOrder() {
        String actualMessage = successMessageForOrder.getText();
        System.out.println(actualMessage);
        Assert.assertTrue(successMessageForOrder.isDisplayed());
    }

}
