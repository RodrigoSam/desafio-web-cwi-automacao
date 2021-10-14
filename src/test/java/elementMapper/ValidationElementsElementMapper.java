package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidationElementsElementMapper {

    @FindBy(className = ("navigation_page"))
    public WebElement nameCategoryAuthentication;

    @FindBy(className = "navigation_page")
    public WebElement nameAuthenticationToPageCreateAccount;
}
