package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private By userNameField = By.cssSelector("#connectionForm-username");
    private By passwordField = By.cssSelector("#connectionForm-password");
    private By connexionButton = By.cssSelector(".form-group .btn-login-register");
    private By errorText = By.cssSelector(".errors .alert-danger");

    public LoginPage (WebDriver driver){

        this.driver = driver;
    }
    public void setUserName(String userName){
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(userNameField));
driver.findElement(userNameField).sendKeys(userName);


    }
    public  void setPasswordField (String inputPassword){
        driver.findElement((passwordField)).sendKeys(inputPassword);
    }

    public AccountLandingPage clickConnexionButton (){
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(userNameField));
    driver.findElement(connexionButton).click();
    return new AccountLandingPage(driver);

    }
    public String checkErrorText (){
        new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(errorText));
       return driver.findElement(errorText).getText();



    }
}
