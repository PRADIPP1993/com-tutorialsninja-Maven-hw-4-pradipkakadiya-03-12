package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNoteBooksTest extends BaseTest {
    HomePage homePage = new HomePage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();


    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        homePage.mouseHoverOnlaptop1();
        homePage.clickOnShowAlllaptop1();
        laptopsAndNotebooksPage.priceHigtToLow();
        laptopsAndNotebooksPage.PriceHighToLow1();
        laptopsAndNotebooksPage.priceHighToLowVerifty();
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() {
        homePage.mouseHoverOnlaptop1();
        homePage.clickOnShowAlllaptop1();
        homePage.£price();
        laptopsAndNotebooksPage.PriceHighToLow1();
        laptopsAndNotebooksPage.selectproduct();
        Assert.assertEquals(laptopsAndNotebooksPage.verifymacbook(), "MacBook", "Verify the Product");
        laptopsAndNotebooksPage.clickAddToCart();
        String expectedText1 = "Success: You have added MacBook to your shopping cart!\n" +
                "×";
        Assert.assertEquals(laptopsAndNotebooksPage.getText1(), expectedText1, "Product not added to cart");
        laptopsAndNotebooksPage.clickOnShoppingCard();
        Assert.assertEquals(laptopsAndNotebooksPage.getText2(), "Shopping Cart", "Verify the Text");
        Assert.assertEquals(laptopsAndNotebooksPage.VerifyLeptopHP(), "MacBook", "Verify the Text");
        laptopsAndNotebooksPage.ClearOnQuantity();
        laptopsAndNotebooksPage.AddQuantity();
        laptopsAndNotebooksPage.updatabuttonclick();
        String expectedText2 = "Success: You have modified your shopping cart!\n" +
                "×";
        Assert.assertEquals(laptopsAndNotebooksPage.getText3(), expectedText2, "Product updata added to cart");
        Assert.assertEquals(laptopsAndNotebooksPage.VerifyProductPrice(), "£737.45", "Verify the product Price");
        laptopsAndNotebooksPage.clickcheckout();
        Assert.assertEquals(laptopsAndNotebooksPage.Verifytextcheckout(), "Checkout", "Verify The Text in Checkout");
        Assert.assertEquals(laptopsAndNotebooksPage.Verifytextnewcustomer1(), "New Customer", "Verify The Text in New Customer");
        laptopsAndNotebooksPage.clickguestCheckout();
        laptopsAndNotebooksPage.clickaccoutbutton();
        laptopsAndNotebooksPage.mandatoryfields();
        laptopsAndNotebooksPage.clickaccoutbutton1();
        laptopsAndNotebooksPage.commentmMass();
        laptopsAndNotebooksPage.clickaccoutbutton2();
        laptopsAndNotebooksPage.clickaccoutbutton3();
        String expectedText3 = "Warning: Payment method required!\n" +
                "×";
        Assert.assertEquals(laptopsAndNotebooksPage.paymentreq(), expectedText3, "Verify Text Mass.");
    }


}
