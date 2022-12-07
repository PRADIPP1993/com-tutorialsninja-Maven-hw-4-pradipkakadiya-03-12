package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest {
    MyAccountPage MyAccountPage = new MyAccountPage();



    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        MyAccountPage.clickOnMyAccount1();
        MyAccountPage.clikcOnRegister();
        Assert.assertEquals(MyAccountPage.verifyTextRegisterAccount(),"Register Account","Error message not displayed");

    }
    @Test
    public void  verifyUserShouldNavigateToLoginPageSuccessfully(){
        MyAccountPage.clickOnMyAccount1();
        MyAccountPage.clikOnLoginButton();
        Assert.assertEquals(MyAccountPage.verifyTextReturningCustomer(),"Returning Customer","Error message not displayed");
    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){
        MyAccountPage.clickOnMyAccount1();
        MyAccountPage.clikcOnRegister();
        MyAccountPage.EnterYourFirstName();
        MyAccountPage.EnterYourLastName();
        MyAccountPage.EnterYourEmailId();
        MyAccountPage.EnterYourTelephoneNumber();
        MyAccountPage.EnterYourPassword();
        MyAccountPage.EnterYourConfirmPassword();
        MyAccountPage.clikOnYesRadioButton();
        MyAccountPage.clickOnPrivacyPolicy();
        MyAccountPage.clickOnButtonContine();
        Assert.assertEquals(MyAccountPage.verifyYourAccountCreatedText(),"Your Account Has Been Created!","Error message not displayed");
        MyAccountPage.clickTheButtonContine3();
        MyAccountPage.clickOnMyAccountLink();
        MyAccountPage.clickOnLogout();
        Assert.assertEquals(MyAccountPage.verifyAccountLogoutText(),"Account Logout","Error message not displayed");
        MyAccountPage.clickOnContinueButton4();

    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        MyAccountPage.clickOnMyAccount1();
        MyAccountPage.clikOnLoginButton();
        MyAccountPage.clearemailAddress();
        MyAccountPage.enterYourRegisterPassword();
        MyAccountPage.clickOnAccountLoginButton();
        Assert.assertEquals(MyAccountPage.verifyMyaccountText1(),"My Account","Error message not displayed");
        MyAccountPage.clickOnMyAccountLink1();
        MyAccountPage.clickOnParameterLogout();
        Assert.assertEquals(MyAccountPage.verifyMyaccountLogoutText1(),"Account Logout","Error message not displayed");
        MyAccountPage.clickOnContinueButtonInEnd();
    }

}
