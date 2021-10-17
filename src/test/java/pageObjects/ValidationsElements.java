package pageObjects;

import elementMapper.ValidationElementsElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ValidationsElements extends ValidationElementsElementMapper {
    public ValidationsElements(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);

    }


public String getCategoryAuthenticationPage(){
        return nameCategoryAuthentication.getText();
}
@Step("Validar se está na página My Account")
public boolean isPageAuthentication(){
return getCategoryAuthenticationPage().contains("Authentication");
}

public String getNameAuthenticationToPageCreateAccount(){
        return nameCategoryAuthentication.getText();
}
@Step("Validar se está na página Create Account")
public boolean isPageCreateAccount(){
        return getNameAuthenticationToPageCreateAccount().contains("Authentication");
}

public String getNameCategoryDresses(){
        return textDresses.getText();
}
@Step("Validar se está na página Dresses")
public boolean isPageDresses(){
        return getNameCategoryDresses().contains("Dresses");
}
public String getAuthenticationToPagePrintDress(){
        return validationText.getText();
}
@Step("Validar se está na página Print Dresses")
public boolean isPagePrintDress() {
        return getAuthenticationToPagePrintDress().contains("Printed Dress");
}
public String getTextValidationPage(){
        return textValidationPage.getText();
}
@Step("Validar se a mercadoria foi adicionada com sucesso no carrinho de compras")
public boolean isModalSuccessfully(){
        return getTextValidationPage().contains("Printed Dress");
}
public String getTextValidateSummary(){
        return textValidationPageSummary.getText();
}
@Step("Validar se está na página Summary")
public boolean isPageSummary(){
        return getTextValidateSummary().contains("Shopping-cart summary");
}
public String getTextValidationInModalWriteReview(){
        return  textValidationInModalWriteReview.getText();

}
@Step("Validar se está no modal Write Review")
public boolean isModalWriteReview(){
        return getTextValidationInModalWriteReview().contains("Write a review");
}
public String getTextValidationModalNewComment(){
            return textValidationModalNewComment.getText();
}
@Step("Validar se está no modal New Comment")
public boolean isModalNewComment(){
            return getTextValidationModalNewComment().contains("New comment");
}
public String getTextValidationPageShipping(){
        return textValidationPageShipping.getText();
}
@Step("Validar se está na página Shipping")
public boolean isPageShipping(){
        return getTextValidationPageShipping().contains("Shipping");
}
public String getTextValidationPagePayment(){
        return textValidationPagePayment.getText();
}
@Step("Validar se está na página Payment")
public boolean isPagePayment(){
        return getTextValidationPagePayment().contains("Please choose your payment method");
}
public String getTextValidationPageOrderSummary(){
        return textValidationPageOrderSummary.getText();
}
@Step("Validar se está na página Order Summary")
public boolean isPageOrderSummary(){
        return getTextValidationPageOrderSummary().contains("Bank-wire payment.");
}
public String getTextValidationOrderComplete(){
        return textValidationOrderComplete.getText();
}
@Step("Validar se o pedido na loja foi concluído ")
public boolean isPageOrderConfirmation(){
        return getTextValidationOrderComplete().contains("Your order on My Store is complete");
}

}
