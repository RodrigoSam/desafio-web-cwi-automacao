package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElementMapper {

    @FindBy(id = ("email_create"))
    public WebElement emailCreate;

    @FindBy(css= ("#SubmitCreate") )
    public WebElement SubmitCreate;

    public WebElement email;

    public WebElement passwd;

    public WebElement SubmitLogin;





}
