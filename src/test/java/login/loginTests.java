package login;

import base.baseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountLandingPage;
import pages.LoginPage;

public class loginTests extends baseTests {


@Test
public void testSuccesfullLogin(){
    homePage.closePopUp();
    LoginPage loginPage = homePage.clickButton();
    loginPage.setUserName("spatariuandrei@yahoo.com");
    loginPage.setPasswordField("12345678");
    AccountLandingPage accountLandingPage = loginPage.clickConnexionButton();
    Assert.assertEquals(accountLandingPage.getLoggedUserText(), "Andrei","Incorrect username");



}
@Test
    public void testWrongUserNameOrPassword(){
    homePage.closePopUp();
    LoginPage loginPage = homePage.clickButton();
    loginPage.setUserName("spatariuandrei@yahoo.com");
    loginPage.setPasswordField("a");
    loginPage.clickConnexionButton();
    Assert.assertEquals(loginPage.checkErrorText(),"L'email et/ou le mot de passe n'est pas valide." , "User can Log in with wrong username or password");

}


}
