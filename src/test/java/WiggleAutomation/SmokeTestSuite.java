package WiggleAutomation;

import Wigglepages.HomePage;
import Wigglepages.MyAccountPage;
import Wigglepages.RegistrationPage;
import Wigglepages.YourAccountPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SmokeTestSuite extends BaseTest{

    //Test Data
    public static String URL = "https://www.wiggle.com/";
    public static String searchField = "Bike";
    public static String emailAddress = "kranthi_kavilas@yahoo.co.in";
    public static String confirmEmailAddress = "kranthi_kavilas@yahoo.co.in";
    public static String password = "Testing@123";
    public static String firstName = "kranthi";
    public static String lastName = "kumar";

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    YourAccountPage yourAccountPage = new YourAccountPage();
    MyAccountPage myAccountPage = new MyAccountPage();

    @Test
    public void tc01(){
        Assert.assertTrue(homePage.isUserOnHomePage());
        homePage.goToYourAccountField();
        Assert.assertTrue(yourAccountPage.newCustomerPanel());
        yourAccountPage.enterEmail(emailAddress);
        yourAccountPage.clickContinue();
        Assert.assertTrue(registrationPage.isUserOnRegistrationPage());
        registrationPage.confirmEmailAddress(confirmEmailAddress);
        registrationPage.enterPassword(password);
        registrationPage.enterFirstName(firstName);
        registrationPage.enterLastName(lastName);
        registrationPage.clickRegister();
        WebElement captcha = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/form/div[5]/div"));
        builder.moveToElement(captcha, 50, 30).click().build().perform();
        Assert.assertTrue(myAccountPage.myAccount());
    }
}
