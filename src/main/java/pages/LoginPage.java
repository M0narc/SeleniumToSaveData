package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By userNameField = By.id("username");
    private By passField = By.id("password");
    private By logIn = By.cssSelector("#login button");


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserNameField(String username){
        //sendKeys -> type in
        driver.findElement(userNameField).sendKeys(username);
    }

    public void setPassField(String password){
        driver.findElement(passField).sendKeys(password);
    }

    public SecureAreaPage clickLogInButton(){
        driver.findElement(logIn).click();
        return new SecureAreaPage(driver);
    }

}
