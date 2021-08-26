package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

private WebDriver driver;


private By ConexionButton = By.className("button-connection-expend");
private By userNameField = By.cssSelector("#connectionForm-username");
private By popUp = By.cssSelector("button.ab-close-button");

public HomePage(WebDriver driver){

        this.driver = driver;
    }

    public LoginPage clickButton(){

    driver.findElement(ConexionButton).click();
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.presenceOfElementLocated(userNameField));
    return new LoginPage(driver);

    }
    public void closePopUp(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(popUp));
        driver.findElement(popUp).click();


    }





 }

