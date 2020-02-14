package com.Sprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[@class='sprint-header-logo sprint-brand-header-new--size']//img") // Logo Validation
            WebElement Logo;

    public void ClickLogo() {
        Logo.click();
    }

    @FindBy(xpath = "//a[@class='langLink color--black']")
    WebElement Espanol;

    public void ValidateEspanol() {
        Espanol.click();
    }

    @FindBy(xpath = "//a[contains(@class,'langLink color--black')]")
    WebElement English;
    public void ValidateEnglish(){
        English.click();
    }

    @FindBy(xpath = "//a[contains(@class,'color--black')][contains(text(),'Business')]")
    WebElement Busniess;

    public void ValidateBusniess() {
        Busniess.click();
    }

    @FindBy(xpath = "//a[contains(@class,'color--black')][contains(text(),'Business')]")
    WebElement Stores;

    public void ValidateStores() {
        Stores.click();
    }

    @FindBy(id = "searchButtonText")
    WebElement Search;

    public void ValidateSearchButton() {
        Search.click();

    }

    @FindBy(xpath = "//a[@class='sprint-cart__element']//p[contains(text(),'Cart')]")
    WebElement Cart;

    public void ValidateCart() {
        Cart.click();
    }

    @FindBy(xpath = "//div[@class='sprint-brand-header-new--col ml-20']//a[@class='sprint-brand-header-menu radius-s']")
    WebElement SignInButton;

    public void ValidateSignInButton() {
        SignInButton.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Activate')]")
    WebElement ActivateLink;

    public void ValidateActivateLink() {
        ActivateLink.click();
    }

    @FindBy(xpath = "//a[@class='sprint-menu__root js-nav-link-root sprint-menu__root-link']//span[contains(text(),'Deals')]")
    WebElement DealLink;

    public void ValidateDeal() {
        DealLink.click();
    }

    @FindBy(xpath = "//u[contains(text(),'Learn')]")
    WebElement LearnTab;

    public void ValidateLearnTab() {
        LearnTab.click();
    }

    @FindBy(id = "slick-slide-control01")
    WebElement ImageChangingButton2;

    public void ImageChangeButton2() {
        ImageChangingButton2.click();
    }

    @FindBy(id = "slick-slide-control00")
    WebElement ImageChangingButton;

    public void ImageChangeButton() {
        ImageChangingButton.click();
    }

    @FindBy(id = "slick-slide-control02")
    WebElement ImageChangingButton3;

    public void ImageChangeButton3() {
        ImageChangingButton3.click();
    }

    @FindBy(id = "slick-slide-control03")
    WebElement ImageChangingButton4;

    public void ImageChangeButton4() {
        ImageChangingButton4.click();
    }
   /* @FindBy(xpath = "//*[@id=\"form-element-input_28550\"]")
    WebElement InputButton;
    public void ValidateInputButton(){
        InputButton.click();
    }*/
   @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div/div[2]/div/div/div[3]/div/div/div/div/div[2]/div/a")
    WebElement CheckCoverage;
   public void ValidateCheckCoverage(){
       CheckCoverage.click();
   }


}