package Wigglepages;

import Utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage{
    @FindBy(css= ".bem-button.float-right.hidden-xs")
    WebElement logOut;

    @FindBy(css= ".bem-button.float-right.hidden-xs")
    WebElement myAccountPage;

    public  MyAccountPage(){
        PageFactory.initElements(driver,this);
    }

    public void signOut(){
        Utils.click(logOut);
    }

    public boolean myAccount(){
        return Utils.isDisplayed(myAccountPage);
    }
}
