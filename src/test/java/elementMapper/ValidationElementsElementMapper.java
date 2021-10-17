package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidationElementsElementMapper {

    @FindBy(className = ("navigation_page"))
    public WebElement nameCategoryAuthentication;

    @FindBy(className = "navigation_page")
    public WebElement nameAuthenticationToPageCreateAccount;

    @FindBy(className = "cat-name")
    public WebElement textDresses;

    @FindBy(css = ".pb-center-column > h1:nth-child(1)")
    public WebElement validationText;

    @FindBy(id = "layer_cart_product_title")
    public WebElement textValidationPage;

    @FindBy(id = "cart_title")
    public WebElement textValidationPageSummary;

    @FindBy(css = "#id_new_comment_form > h2")
    public WebElement textValidationInModalWriteReview;

    @FindBy(css = ".fancybox-inner > h2")
    public WebElement textValidationModalNewComment;

    @FindBy(css = ".page-heading")
    public WebElement textValidationPageShipping;

    @FindBy(css = ".page-heading")
    public WebElement textValidationPagePayment;

    @FindBy(className = "page-subheading")
    public WebElement textValidationPageOrderSummary;

    @FindBy(className = "cheque-indent")
    public WebElement textValidationOrderComplete;

}
