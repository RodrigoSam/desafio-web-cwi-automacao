package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPageElementMapper {

    @FindBy(css = "#id_gender1")
    public WebElement buttonGen;

    @FindBy(css = "#customer_firstname")
    public WebElement boxFirstName;

    @FindBy(css = "#customer_lastname")
    public WebElement boxLastName;

    @FindBy(css = "#passwd")
    public WebElement boxPassword;

    @FindBy(id = "days")
    public WebElement boxDay;

    @FindBy(id = "months")
    public WebElement boxMonths;

    @FindBy(id = "years")
    public WebElement boxYears;

    @FindBy(id = "newsletter")
    public WebElement boxNewsLetter;

    @FindBy(id = "optin")
    public WebElement boxReceiveOffers;

    @FindBy(css = "#company.form-control")
    public WebElement boxAddressCompany;

    @FindBy(css = "#address1.form-control")
    public WebElement boxAddressAddress1;

    @FindBy(id = "city")
    public WebElement boxCity;

    @FindBy(css = "#id_state.form-control")
    public WebElement boxState;

    @FindBy(id = "postcode")
    public WebElement postCode;

    @FindBy(css = "#id_country.form-control")
    public WebElement boxCoutry;

    @FindBy(id = "other")
    public WebElement boxAdditionalInformation;

    @FindBy(id = "phone")
    public WebElement boxHomePhone;

    @FindBy(id = "phone_mobile")
    public WebElement boxPhoneMobile;

    @FindBy(id = "alias")
    public WebElement boxEndReference;

    @FindBy(id = "submitAccount")
    public WebElement boxRegister;







}
