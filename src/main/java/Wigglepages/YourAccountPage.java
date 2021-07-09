package Wigglepages;

import Utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccountPage extends BasePage{
    @FindBy(css = ".bem-checkout__title.bem-typography__header-1")
    WebElement newCustomerField;

    @FindBy(css = "#DualRegisterEmailModel_Email")
    WebElement emailAddressField;

    @FindBy(css="#qa-dual-register")
    WebElement clickButton;

    public  YourAccountPage(){
        PageFactory.initElements(driver,this);

    }

    public boolean newCustomerPanel(){
        return Utils.isDisplayed(newCustomerField);
    }

    public void enterEmail(String emailAddress){
        Utils.sendKeys(emailAddressField,emailAddress);

    }

    public void clickContinue(){
        Utils.click(clickButton);
        Utils.waitToLoad(2);
    }
}
