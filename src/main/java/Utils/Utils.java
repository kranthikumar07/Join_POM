package Utils;

import Wigglepages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {
    public static void click(WebElement element){
        element.click();
    }

    public static void sendKeys(WebElement element,String text){
        element.sendKeys(text);
    }

    public static boolean isDisplayed(WebElement element){
        return element.isDisplayed();
    }

    public static void selectByText(WebElement element,String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public static void selectByValue(WebElement element,String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public static void selectByIndex(WebElement element,int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public static boolean containsText(WebElement element,String text){
        return element.getText().contains(text);
    }

    public static String getText(WebElement element){
        return element.getText();
    }
    public static String pageTitle(){
        return driver.getTitle();
    }

    public static void waitToLoad(long seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

    }

}
