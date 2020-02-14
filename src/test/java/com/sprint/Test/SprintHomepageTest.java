package com.sprint.Test;
import com.Sprint.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class SprintHomepageTest {

    public WebDriver driver;

    public HomePage homePageObj;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/dibashsaha/Desktop/LearnSetupMaven/DriverHere/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.sprint.com/");

        homePageObj = new HomePage(driver);

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }



    @Test(priority = 1)
    public void ValidateLogo() throws InterruptedException {
        homePageObj.ClickLogo();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void ValidateEspanol() throws InterruptedException {
        homePageObj.ValidateEspanol();
        Thread.sleep(3000);
    }
    @Test(priority = 3)
    public void ValidateEnglish() throws InterruptedException {
        homePageObj.ValidateEnglish();
        Thread.sleep(3000);
    }

    @Test(priority = 16)
    public void ValidateBusiness() throws InterruptedException {
        homePageObj.ValidateBusniess();
        Thread.sleep(3000);
    }

    @Test(priority = 4)
    public void ValidateStores() throws InterruptedException {
        homePageObj.ValidateStores();
        Thread.sleep(3000);
    }
/*
    @Test(priority = 5)
    public void ValidateSearch() throws InterruptedException {
        homePageObj.ValidateSearchButton();
        Thread.sleep(2000);
    }
*/
    @Test(priority = 6)
    public void ValidateCart() throws InterruptedException {
        homePageObj.ValidateCart();
        Thread.sleep(3000);
    }

    @Test(priority = 7)
    public void ValidateSignInButton() throws InterruptedException {
        homePageObj.ValidateSignInButton();
        Thread.sleep(3000);
    }

    @Test(priority = 8)
    public void ValidateActivateButton() throws InterruptedException {
        homePageObj.ValidateActivateLink();
        Thread.sleep(3000);
    }

    @Test(priority = 9)
    public void ValidateDeal() throws InterruptedException {
        homePageObj.ValidateDeal();
        Thread.sleep(3000);
    }

    @Test(priority = 10)
    public void ValidateLearnTab() throws InterruptedException {
        homePageObj.ValidateLearnTab();
        Thread.sleep(3000);
    }

    @Test(priority = 11)
    public void ValidateImageChangeButton2() throws InterruptedException {
        homePageObj.ImageChangeButton2();
        Thread.sleep(3000);
    }

    @Test(priority = 12)
    public void ValidateImageChangeButton() throws InterruptedException {
        homePageObj.ImageChangeButton();
        Thread.sleep(3000);
    }

    @Test(priority = 13)
    public void ValidateImageButton3() throws InterruptedException {
        homePageObj.ImageChangeButton3();
        Thread.sleep(3000);
    }

    @Test(priority = 14)
    public void ValidateImageButton4() throws InterruptedException {
        homePageObj.ImageChangeButton4();
        Thread.sleep(3000);
    }
    /*@Test(priority = 15)
    public void ValidateInputButton(){
        homePageObj.ValidateInputButton();
}*/
@Test(priority = 16)
    public void ValidateCheckCoverage() throws InterruptedException {
    homePageObj.ValidateCheckCoverage();
    Thread.sleep(3000);
}
}


