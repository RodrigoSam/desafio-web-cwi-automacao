package pageObjects;

import elementMapper.LoginPageElementMapper;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoginPage extends LoginPageElementMapper{
    public LoginPage(){

        PageFactory.initElements(Browser.getCurrentDriver(),this);

    }

    public void clickBoxEmailCreate(){
        emailCreate.click();
        System.out.println("Clicar no campo Email Address ok");

    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
    LocalDateTime agora = LocalDateTime.now();
    String agoraFormatado = agora.format(formatter);


    public void fillEmailAddressToCreateAccount(){
        emailCreate.sendKeys("teste"+agoraFormatado+"desafio@aol.com");
        System.out.println("Campo Create Account preenchido ok");
    }

    public void clickSubmitCreate(){
        SubmitCreate.click();
        System.out.println("Clicar no botão Create an account ok");
    }


    public void fillEmail(){
        email.sendKeys("carneiroteste@gmail.com");
    }

    public void fillPassword(){
        passwd.sendKeys("12345");
    }

    public void clickBtnSubmitLogin(){
        SubmitLogin.click();

    }
    @Step("Fazer login na página")
    public void makeLogin(){
        fillEmail();
        fillPassword();
        clickBtnSubmitLogin();
        System.out.println("Fazer login na página ok");
    }
    ValidationsElements validation = new ValidationsElements();
    @Step("Validar se está na página authentication")
    public void isPageAuthentication(){
        Assert.assertTrue(validation.isPageAuthentication());
        System.out.println("Validar página Authentication ok");
    }






}
