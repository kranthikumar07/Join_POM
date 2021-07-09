package Wigglepages;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    @FindBy(css = "#accountLink")
    WebElement assertHomePage;

    @FindBy(css = "#accountLink")
    WebElement yourAccountLink;

    public HomePage(){
        PageFactory.initElements(driver,this);

    }
    public boolean isUserOnHomePage(){
       return Utils.isDisplayed(assertHomePage);

    }
    public void goToYourAccountField(){
        Utils.click(yourAccountLink);
        Utils.waitToLoad(2);
    }
    public void pageTitle(){
        Utils.pageTitle();
    }
}
