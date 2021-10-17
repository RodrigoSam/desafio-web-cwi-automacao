package pageObjects;

import elementMapper.ProductPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

    public class ProductPage extends ProductPageElementMapper {
    public ProductPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }
    @Step("Selecionar um produto para compra")
    public void ClickProductBuy(){
    productBuy.click();
    System.out.println("Clicar no produto ok");
    }
    @Step("Adicionar o produto ao carrinho")
    public void clickButtonAddToCart(){
    buttonAddToCart.click();
    System.out.println("Clicar no botão Add To Cart ok");
    }
    @Step("clicar no botão Proceed To Checkout no modal")
    public void clickButtonModalProceedToCheckout(){
    buttonModalProceedToCheckout.click();
        System.out.println("Clicar no botão checkout ok");
    }
    public void clickButtonBoxReview(){
        buttonBoxReview.click();
        System.out.println("Clicar no botão box review ok");
    }
    public void fillBoxTitleInModalReview(){
        boxTitleInModalReview.sendKeys("Muito confortável.");
    }
    public void fillBoxCommentInModalReview(){
        boxCommentInModalReview.sendKeys("Caiu muito bem, me deixou bem livre para me movimentar. ");
    }
    public void clickButtonSendInModalReview(){
        buttonSendInModalReview.click();
        System.out.println("Review feito com sucesso ok");
    }
    public void clickButtonOkInModalNewComment(){
        buttonOkInModalNewComment.click();
        System.out.println("Comentário adicionado com sucesso ok");
    }
    @Step("Fazer o fluxo de comentário do produto na categoria Printed Dress")
    public void accessTheCommentAreaAndCompleteTheFlow(){
        ValidationsElements validation = new ValidationsElements();
        clickButtonBoxReview();
        validation.isModalWriteReview();
        fillBoxTitleInModalReview();
        fillBoxCommentInModalReview();
        clickButtonSendInModalReview();
        validation.isModalNewComment();
        clickButtonOkInModalNewComment();

    }
    public void clickButtonPlus(){
        buttonPlus.click();
    }
    public void fillSizeSelect(){
        sizeSelect.sendKeys("l");
    }
    public void clickBoxColorSelect(){
        colorSelect.click();
    }
    @Step("Escolher as características do produto")
    public void chooseProductFeatures(){
        clickButtonPlus();
        fillSizeSelect();
        clickBoxColorSelect();
    }
    @Step("Fazer o check-out da página Summary")
    public void clickButtonProceedCheckoutSummary(){
        buttonProceedToCheckOutSummary.click();
        System.out.println("Checkout Summary ok");
    }
    @Step("Fazer o check-out da página Address")
    public void clickButtonProceedCheckoutAddress(){
        buttonProceedToCheckoutAddress.click();
        System.out.println("Checkout Address ok");
    }
    @Step("Preencher o campo de comentário da página Address")
    public void fillCommentBox(){
        checkBoxComment.sendKeys("Corrijam com carinho!!!kkkk");
        System.out.println("Preencher o box comment ok");
    }
    @Step("Marcar o box de termos de serviço")
    public void clickBoxTermsOfService(){
        boxTermsOfService.click();
        System.out.println("Box preenchido ok");
    }
    @Step("Fazer o check-out da página Shipping")
    public void clickButtonProceedToCheckoutShipping(){
        buttonProceedToCheckoutShipping.click();
    }
    @Step("Escolher forma de pagamento")
    public void clickButtonPayByBankWire(){
        buttonPayByBankWire.click();
        System.out.println("clicar em Pay By Bank Wire ok");
    }
    @Step("Confirmar o pedido")
    public void clickButtonIConfirmMyOrder(){
        buttonIConfirmMyOrder.click();
        System.out.println("Ordem de pagamento confirmada ok ");
    }

}

