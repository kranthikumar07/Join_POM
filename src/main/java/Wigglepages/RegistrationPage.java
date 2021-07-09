package Wigglepages;

import Utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage{

    @FindBy(css = ".bem-checkout__title.bem-typography__header-1")
    WebElement registrationPage;

    @FindBy(css = "#RegisterModel_EmailConfirm")
    WebElement confirmEmail;

    @FindBy(css = "#RegisterModel_Password")
    WebElement createPassword;

    @FindBy(css = "#RegisterModel_FirstName")
    WebElement firstName;

    @FindBy(css = "#RegisterModel_Surname")
    WebElement lastName;

    @FindBy(css = "#qa-register")
    WebElement clickRegister;

    public RegistrationPage(){
        PageFactory.initElements(driver,this);
    }

    public boolean isUserOnRegistrationPage(){
        return Utils.isDisplayed(registrationPage);

    }
    public void confirmEmailAddress(String confirmEmailAddress){
        Utils.sendKeys(confirmEmail,confirmEmailAddress);
    }
    public void enterPassword(String pwd){
        Utils.sendKeys(createPassword,pwd);
    }
    public void enterFirstName(String fName){
        Utils.sendKeys(firstName,fName);
    }
    public void enterLastName(String lName){
        Utils.sendKeys(lastName,lName);
    }
    public void clickRegister(){
        Utils.click(clickRegister);
        Utils.waitToLoad(2);
    }



}
