package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {


    By VerifyProduct = By.xpath("//h1[contains(text(),'HP LP3065')]");

    By clickproduct = By.xpath("//h1[contains(text(),'HP LP3065')]");

    By AddtoCard = By.xpath("//button[@id='button-cart']");

    By Verify1Text = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By ShoppingCard = By.xpath("//a[contains(text(),'shopping cart')]");

    By Verify2Text = By.xpath("//a[contains(text(),'Shopping Cart')]");
    By VerifyLeptop = By.linkText("HP LP3065");
    By VerifyDeliveryDate1 = By.xpath("//small[contains(text(),'Delivery Date: 2023-11-30')]");

    By ModelName = By.xpath("//td[contains(text(),'Product 21')]");
    By ProductPrice = By.xpath("//tbody/tr[1]/td[6]");


    //1.3 Select Sort By position "Name: Z to A"
    public void productname() {
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
    }

    public void NameZToA() {
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (Z - A)");
    }

    public void productnameZtoA() {
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }

        System.out.println(afterSortByZToAProductsName);
    }

    //2.3 Select Sort By position "Name: A to Z"
    public void NameAToZ() {
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (A - Z)");
    }

    //2.4 Select product “HP LP3065”
    public void Selectproduct() {
        clickOnElement(By.xpath("//a[contains(text(),'HP LP3065')]"));
    }

    //2.5 Verify the Text "HP LP3065"
    public String getproductname() {
        return getTextFromElement(VerifyProduct);
    }

    public void clicklaptop() {
        clickOnElement(clickproduct);
    }

    //2.6 Select Delivery Date "2022-11-30"
    public void selectdate() {
        clickOnElement(By.xpath("//input[@id='input-option225']"));
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

    //2.8 Click on “Add to Cart” button
    public void AddtoCardproduct() {
        clickOnElement(AddtoCard);
    }

    //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
    public String getText1() {
        return getTextFromElement(Verify1Text);
    }
    //2.10 Click on link “shopping cart” display into success message

    public void clickOnShoppingCard() {
        clickOnElement(ShoppingCard);
    }

    //2.11 Verify the text "Shopping Cart"
    public String getText2() {
        return getTextFromElement(Verify2Text);
    }

    //2.12 Verify the Product name "HP LP3065"
    public String VerifyLeptopHP() {
        return getTextFromElement(VerifyLeptop);
    }

    //2.13 Verify the Delivery Date "2022-11-30"
    public String VerifyDeliveryDate() {
        return getTextFromElement(VerifyDeliveryDate1);
    }

    //2.14 Verify the Model "Product21"
    public String VerifyModelName() {
        return getTextFromElement(ModelName);
    }

    //2.15 Verify the Todat "£74.73"
    public String VerifyProductPrice() {
        return getTextFromElement(ProductPrice);
    }

}
