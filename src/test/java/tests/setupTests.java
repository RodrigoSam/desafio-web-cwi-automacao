package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.junit.Assert;
import org.junit.Test;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

@Feature("Testes em site de e-commerce")
public class setupTests extends baseTests {
    @Test
    @Story("Iniciar Teste de Fluxo de cadastro")
    @Step("Abrir a página home do site")
        public void openingBrowserAndLoadingPage(){
        Assert.assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrir o navegador, maximizar e carregar a Url ok");

        //Instanciar as classes
        HomePage home = new HomePage();
        ValidationsElements validation = new ValidationsElements();
        LoginPage login = new LoginPage();
        CreateAccountPage create = new CreateAccountPage();

        //Clicar em SignIn na página do site
        home.clickButtonSignIn();

        //Validar se estamos na página Authentication
        login.isPageAuthentication();

        //Clicar no campo Email Address do box Create Account e preenche-lo
        login.clickBoxEmailCreate();
        login.fillEmailAddressToCreateAccount();

        //Clicar em Create an account
        login.clickSubmitCreate();

        //Validar se estamos na página
        create.isPageCreateAccount();

        //Preenchimento dos campos Your Personal Information
        create.fillInAllPersonalInformation();

        //Preenchimento dos campos Your address
        create.fillAllAddressInformation();

        //Preenchimento dos campos Adicionais
        create.fillAllAdditionalInformation();

        //Registrar o Cadastro
        create.clickRegister();

        //Validar se está na página Authentication, e o cadastro foi concluído com sucesso
        validation.isPageAuthentication();
    }

    @Test
    @Story("Realizar teste de fluxo automatizado de compra")
    public void testFluxoDeCompra() {
        //Instanciar as classes
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        ValidationsElements validation = new ValidationsElements();
        MyAccountPage myaccount = new MyAccountPage();
        ProductPage pdp = new ProductPage();

        //Entrar Página de Login
        home.clickButtonSignIn();

        //Preencher os campos de Email e Password e fazer o login
        login.makeLogin();

        //Validar se estamos na página My account
        validation.isPageAuthentication();

        //Clicar na categoria Dresses
        myaccount.clickMenuDresses();

        //Validar se estamos na página Dresses
        validation.isPageDresses();
        System.out.println("Validação página Dresses ok");

        //Clicar no produto escolhido na página Dress
        pdp.ClickProductBuy();

        //Validar se estamos na página Printed Dress
        validation.isPagePrintDress();
        System.out.println("Página Printed Dress ok");

        //Fazer uma avaliação na área Reviews
        pdp.accessTheCommentAreaAndCompleteTheFlow();

        //Selecionar as características do produto
        pdp.chooseProductFeatures();

        //Adicionar o produto ao Cart
        pdp.clickButtonAddToCart();

        //Validar se a mercadoria foi adicionada com sucesso no carrinho de compras
        validation.isModalSuccessfully();
        System.out.println("Validação modal ok");

        //clicar no botão Proceed to checkout no modal
        pdp.clickButtonModalProceedToCheckout();

        //Validar se está na página summary
        validation.isPageSummary();
        System.out.println("Validação Summary ok");

        //Próximos passos para finalização
        pdp.clickButtonProceedCheckoutSummary();

        //Preencher campo comentário sobre o pedido
        pdp.fillCommentBox();

        //Continuar os passos para finalização
        pdp.clickButtonProceedCheckoutAddress();

        //Validar se estamos na página Shipping
        validation.isPageShipping();

        //Clicar no box Terms of Service e prosseguir
        pdp.clickBoxTermsOfService();
        pdp.clickButtonProceedToCheckoutShipping();

        //Validar se estamos na página Payment
        validation.isPagePayment();
        System.out.println("Validação página Payment ok");

        //Escolher método e pagamento
        pdp.clickButtonPayByBankWire();

        //Validar a página que mostra o método
        validation.isPageOrderSummary();
        System.out.println("Validação da página Order Summary ok");

        //Confirmar Ordem de Pagamento
        pdp.clickButtonIConfirmMyOrder();

        //Validação compra executada com sucesso
        validation.isPageOrderConfirmation();
        System.out.println("Validação do fluxo de compra executada com sucesso ok");

    }

}
