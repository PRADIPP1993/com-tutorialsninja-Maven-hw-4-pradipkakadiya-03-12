package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        homePage.mouseHoverOnDesktops();
        homePage.mouseHoverToElementAndClick(By.linkText("Show All Desktops"));
        desktopsPage.productname();
        desktopsPage.NameZToA();
        desktopsPage.productnameZtoA();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        homePage.mouseHoverOnDesktops();
        homePage.mouseHoverToElementAndClick(By.linkText("Show All Desktops"));
        desktopsPage.productname();
        homePage.£price();
        desktopsPage.NameAToZ();
        desktopsPage.Selectproduct();
        Assert.assertEquals(desktopsPage.getproductname(), "HP LP3065", "Verify the Product");
        desktopsPage.clicklaptop();
        desktopsPage.selectdate();
        desktopsPage.AddtoCardproduct();
        String expectedText1 = "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×";
        Assert.assertEquals(desktopsPage.getText1(), expectedText1, "Product not added to cart");
        desktopsPage.clickOnShoppingCard();
        Assert.assertEquals(desktopsPage.getText2(), "Shopping Cart", "Verify the Text");
        Assert.assertEquals(desktopsPage.VerifyLeptopHP(), "HP LP3065", "Verify the Text");
        Assert.assertEquals(desktopsPage.VerifyDeliveryDate(), "Delivery Date: 2023-11-30", "Verify the Text");
        Assert.assertEquals(desktopsPage.VerifyModelName(), "Product 21", "Verify the Text");
        Assert.assertEquals(desktopsPage.VerifyProductPrice(), "£74.73", "Verify the product Price");

    }

}
