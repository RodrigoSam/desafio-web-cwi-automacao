package pageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper{
    public LoginPage(){

        PageFactory.initElements(Browser.getCurrentDriver(),this);

    }

    public void clickBoxEmailCreate(){
        emailCreate.click();

    }

    public void fillEmailadressToCreateAccount(){
        emailCreate.sendKeys("testedesafio@aol.com");
    }

    public void clickSubmitCreate(){
        SubmitCreate.click();
    }




}
