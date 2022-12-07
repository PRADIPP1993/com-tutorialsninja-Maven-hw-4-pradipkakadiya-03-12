package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By desktoclick = By.linkText("Desktops");
    By showalldesktops = By.linkText("Show All Desktops");

    By verifytext = By.xpath("//h2[contains(text(),'Desktops')]");

    By LaptopsNotebooksclick = By.linkText("Laptops & Notebooks");
    By showallLaptopsNotebooks = By.linkText("Show All Laptops & Notebooks");

    By verifytext1 = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");

    By Componentsclick = By.linkText("Components");
    By showallComponents = By.linkText("Show All Components");

    By verifytext2 = By.xpath("//h2[contains(text(),'Components')]");


// 1.1 //1.2//1.3 Mouse hover on “Desktops” Tab and click
    public void mouseHoverOnDesktops() {
        mouseHoverToElementAndClick(desktoclick);

    }

    public void clickOnShowAllDesktops() {
        clickOnElement(showalldesktops);
    }

    public String VerifyText() {
        return getTextFromElement(verifytext);
    }

    //2.1//2.2//2.3 Mouse hover on “Laptops & Notebooks” Tab and click
    public void mouseHoverOnlaptop1() {
        mouseHoverToElementAndClick(LaptopsNotebooksclick);
    }
    //3.1//3.2//3.3 Mouse hover on “Components” Tab and click
    public void clickOnShowAlllaptop1() {
        clickOnElement(showallLaptopsNotebooks);
    }
    public void clickOnShowAllComponents() {
        clickOnElement(showallComponents);
    }

    public String VerifyText1() {
        return getTextFromElement(verifytext1);
    }

    public void mouseHoverOnComponents() {
        mouseHoverToElementAndClick(Componentsclick);

    }

    public void mouseHoverOnComponents1() {
        mouseHoverToElementAndClick(By.xpath("//a[contains(text(),'Show All Desktops')]"));

    }

    public String VerifyText2() {
        return getTextFromElement(verifytext2);
    }

    public void £price() {
        clickOnElement(By.xpath("//span[contains(text(),'Currency')]"));
        List<WebElement> currencyList = driver.findElements(By.xpath("//ul[@class = 'dropdown-menu']/li"));
        for (WebElement e : currencyList) {
            if (e.getText().equalsIgnoreCase("£ Pound Sterling")) {
                e.click();
                break;
            }
        }
    }


}
