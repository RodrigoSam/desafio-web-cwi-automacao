package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageElementMapper {
    @FindBy(css = "li.ajax_block_product:nth-child(2) > div:nth-child(1) > div:nth-child(2) > h5:nth-child(1) > a:nth-child(1)")
    public WebElement productBuy;

    @FindBy(id = "add_to_cart")
    public WebElement buttonAddToCart;

    @FindBy(css = "a.btn:nth-child(2) > span")
    public WebElement buttonModalProceedToCheckout;

    @FindBy(className = "icon-plus")
    public WebElement buttonPlus;

    @FindBy(css = "#group_1")
    public WebElement sizeSelect;

    @FindBy(id = "color_24")
    public WebElement colorSelect;

    @FindBy(css = ".standard-checkout > span:nth-child(1)")
    public WebElement buttonProceedToCheckOutSummary;

    @FindBy(css = "button.button:nth-child(4)")
    public WebElement buttonProceedToCheckoutAddress;

    @FindBy(css = "textarea.form-control")
    public WebElement checkBoxComment;

    @FindBy(css = "#new_comment_tab_btn > span:nth-child(1)")
    public WebElement buttonBoxReview;

    @FindBy(css = "#comment_title")
    public WebElement boxTitleInModalReview;

    @FindBy(css = "#content")
    public WebElement boxCommentInModalReview;

    @FindBy(css = "#submitNewMessage")
    public WebElement buttonSendInModalReview;

    @FindBy(css = "button.button-medium > span:nth-child(1)")
    public WebElement buttonOkInModalNewComment;

    @FindBy(id = "cgv")
    public WebElement boxTermsOfService;

    @FindBy(css = "button.button:nth-child(4) > span:nth-child(1)")
    public WebElement buttonProceedToCheckoutShipping;

    @FindBy(className = "bankwire")
    public WebElement  buttonPayByBankWire;

    @FindBy(css = "button.button-medium")
    public WebElement buttonIConfirmMyOrder;

}
