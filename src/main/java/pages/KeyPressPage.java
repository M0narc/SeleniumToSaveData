package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {

    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultTxt = By.id("result");

    public KeyPressPage(WebDriver driver){

        this.driver = driver;
    }
    /**
     * Only one character is detected, not a long ass text.
     * */
    public void sendKeyWord(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public String result(){
        return driver.findElement(resultTxt).getText();
    }
}
