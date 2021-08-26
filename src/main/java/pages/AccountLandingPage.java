package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountLandingPage {
    private WebDriver driver;
    private By loggedIdText =By.cssSelector("#dropdownUserMenu");


    public AccountLandingPage (WebDriver driver) { this.driver = driver; }

    public String getLoggedUserText() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(loggedIdText));
       return driver.findElement(loggedIdText).getText();

    }




}
