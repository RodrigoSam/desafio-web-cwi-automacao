package tests;

import org.junit.Assert;
import org.junit.Test;
import pageObjects.CreateAccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ValidationsElements;
import utils.Browser;
import utils.Utils;

public class setupTests extends baseTests {
    //Iniciar Teste
    @Test

    //Abrir a página home do site
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
        System.out.println("Clicar em SignIn na home ok ");

        //Validar se estamos na página Authentication
        Assert.assertTrue(validation.isPageAuthentication());
        System.out.println("Validar página Authentication ok");

        //Clicar no campo Email Address do box Create Account e preenche-lo
        login.clickBoxEmailCreate();
        System.out.println("Clicar no campo Email Address ok");
        login.fillEmailadressToCreateAccount();
        System.out.println("Campo Create Account preenchido ok");

        //Clicar em Create an account
        login.clickSubmitCreate();
        System.out.println("Clicar no botão Create an account ok");

        //Validar se estamos na página
        Assert.assertTrue(validation.isPageCreateAccount());
        System.out.println("Validar se estamos na página Create account ok");

        //Fazer o preenchimento dos campos para cadastro

        //Preenchimento dos campos Your Personal Information

        create.fillInAllPersonalInformation();

        //Preenchimento dos campos Your address

        create.fillAllAddressInformation();

        //Preenchimento dos campos Adicionais

        create.fillAllAditionalsInformations();

        //Registrar o Cadastro

        create.clickRegister();







    }

}
