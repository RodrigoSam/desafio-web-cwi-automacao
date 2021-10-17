package pageObjects;

import elementMapper.CreateAccountPageElementMapper;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CreateAccountPage extends CreateAccountPageElementMapper {

    public CreateAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }
    public void clickButtonGen(){
        buttonGen.click();
    }
    public void clickBoxFirstName(){
        boxFirstName.click();
    }
    public void fillFirstName(){
        boxFirstName.sendKeys("Ethan");
    }
    public void clickBoxLastName(){
        boxLastName.click();
    }
    public void fillLastName(){
        boxLastName.sendKeys("Hunt");
    }
    public void clickBoxPassWD(){
        boxPassword.click();
    }
    public void fillPassWD(){
        boxPassword.sendKeys("12345");
    }
    public void clickBoxDays(){
        boxDay.click();
    }
    public void fillDay(){
        boxDay.sendKeys("18");
    }
    public void clickBoxMonth(){
        boxMonths.click();
    }
    public void fillMonth(){
        boxMonths.sendKeys("August");
    }
    public void clickBoxYear(){
        boxYears.click();
    }
    public void fillYear(){
        boxYears.sendKeys("1964");
    }
    public void clickBoxNewsLetter(){
        boxNewsLetter.click();
    }
    public void clickBoxReceiveOffers(){
        boxReceiveOffers.click();
    }
    @Step("Preenchimento dos campos Your Personal Information")
    public void fillInAllPersonalInformation(){
        clickButtonGen();
        clickBoxFirstName();
        fillFirstName();
        clickBoxLastName();
        fillLastName();
        clickBoxPassWD();
        fillPassWD();
        clickBoxDays();
        fillDay();
        clickBoxMonth();
        fillMonth();
        clickBoxYear();
        fillYear();
        clickBoxNewsLetter();
        clickBoxReceiveOffers();
        System.out.println("Preenchimento dos campos Your Personal Information ok");

    }


    public void clickAddressBoxCompany(){
        boxAddressCompany.click();
    }
    public void fillAddressCompany(){
        boxAddressCompany.sendKeys("CWI");
    }
    public void clickAddressAddress(){
        boxAddressAddress1.click();
    }
    public void fillAddress(){
        boxAddressAddress1.sendKeys("Rossie St");
    }
    public void clickAddressBoxAddress2(){
        boxAddressAddress2.click();
    }
    public void fillBoxAddress2(){
        boxAddressAddress2.sendKeys("Apartment");
    }

    public void clickCity(){
        boxCity.click();
    }
    public void fillCity(){
        boxCity.sendKeys("Mystic");
    }
    public void clickState(){
        boxState.click();
    }
    public void fillState(){
        boxState.sendKeys("Connecticut");
    }
    public void clickPostCode(){
        postCode.click();
    }
    public void fillPostCode(){
        postCode.sendKeys("06388");
    }
    public void clickCoutry(){
        boxCoutry.click();
    }
    public void fillCountry(){
        boxCoutry.sendKeys("United States");
    }
    @Step("Preenchimento de informações de endereço")
    public void fillAllAddressInformation(){

        clickAddressBoxCompany();
        fillAddressCompany();
        clickAddressAddress();
        fillAddress();
        clickAddressBoxAddress2();
        fillBoxAddress2();
        clickCity();
        fillCity();
        clickState();
        fillState();
        clickPostCode();
        fillPostCode();
        clickCoutry();
        fillCountry();
        System.out.println("Preenchimento de informações de endereço ok");

    }

    public void clickBoxAdditionalInformaion(){
        boxAdditionalInformation.click();
    }
    public void fillBoxAdditionalInformation(){
        boxAdditionalInformation.sendKeys("Desafio Top, vocês são 1000%");
    }
    public void clickBoxHomePhone(){
        boxHomePhone.click();
    }
    public void fillHomePhone(){
        boxHomePhone.sendKeys("5130442755");
    }
    public void clickBoxPhoneMobile(){
        boxPhoneMobile.click();
    }
    public void fillPhoneMobile(){
        boxPhoneMobile.sendKeys("51987654321");
    }
    public void clickBoxEndReference(){
        boxEndReference.click();
    }
    public void fillEndReference(){
        boxEndReference.sendKeys("Evergreen Terrace, 632");
    }
    @Step("Preenchimento das informações adicionais")
    public void fillAllAdditionalInformation(){
        clickBoxAdditionalInformaion();
        fillBoxAdditionalInformation();
        clickBoxHomePhone();
        fillHomePhone();
        clickBoxPhoneMobile();
        fillPhoneMobile();
        clickBoxEndReference();
        fillEndReference();
        System.out.println("Informações adicionais ok");

    }
    @Step("Registrar cadastro")
    public void clickRegister(){
        boxRegister.click();
        System.out.println("Cadastro Registrado ok");
    }
        ValidationsElements validation = new ValidationsElements();
    @Step("Validar se está na página Create account")
    public void isPageCreateAccount(){
        Assert.assertTrue(validation.isPageCreateAccount());
        System.out.println("Validar se estamos na página Create account ok");
    }






}
