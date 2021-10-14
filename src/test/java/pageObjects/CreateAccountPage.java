package pageObjects;

import elementMapper.CreateAccountPageElementMapper;
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

    public void fillAllAddressInformation(){

        clickAddressBoxCompany();
        fillAddressCompany();
        clickAddressAddress();
        fillAddress();
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
    public void fillAllAditionalsInformations(){
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
    public void clickRegister(){
        boxRegister.click();
        System.out.println("Cadastro Registrado ok");
    }






}
