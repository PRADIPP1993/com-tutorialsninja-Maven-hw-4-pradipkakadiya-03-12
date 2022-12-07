package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    /*
       1.3 Verify the text ‘Desktops’*/
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.mouseHoverOnDesktops();
        homePage.clickOnShowAllDesktops();
        Assert.assertEquals(homePage.VerifyText(), "Desktops", "Verify the text");

    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        homePage.mouseHoverOnlaptop1();
        homePage.clickOnShowAlllaptop1();
        Assert.assertEquals(homePage.VerifyText1(), "Laptops & Notebooks", "Verify the text");

    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        homePage.mouseHoverOnComponents();
        homePage.clickOnShowAllComponents();
        Assert.assertEquals(homePage.VerifyText2(), "Components", "Verify the text");

    }

}
