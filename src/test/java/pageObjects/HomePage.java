package pageObjects;

import elementMapper.HomePageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends HomePageElementMapper {
    public HomePage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    @Step("Clicar em SignIn na home")
    public void clickButtonSignIn() {
        login.click();
    }






















































}
