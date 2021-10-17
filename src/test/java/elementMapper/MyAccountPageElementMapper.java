package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageElementMapper {

   @FindBy(css = ".sf-menu > li:nth-child(2) > a:nth-child(1)")
    public WebElement menuDresses;

}
