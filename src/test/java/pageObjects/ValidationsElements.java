package pageObjects;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import elementMapper.ValidationElementsElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ValidationsElements extends ValidationElementsElementMapper {
    public ValidationsElements(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);

    }
public String getCategoryAuthenticationPage(){
        return nameCategoryAuthentication.getText();
}
public boolean isPageAuthentication(){
        return getCategoryAuthenticationPage().contains("Authentication");
}
public String getNameAuthenticationToPageCreateAccount(){
        return nameCategoryAuthentication.getText();
}
public boolean isPageCreateAccount(){
        return getNameAuthenticationToPageCreateAccount().contains("Authentication");
}




}
