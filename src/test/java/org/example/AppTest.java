package org.example;

import static org.junit.Assert.assertTrue;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public AppiumDriver<WebElement> driver;
    public WebDriverWait wait;



    By acceptButton = By.id("com.android.chrome:id/terms_accept");
    By noThanksButton = By.id("com.android.chrome:id/negative_button");


    By hideButton = By.id("com.android.chrome:id/tab_switcher_button");

    By newTab = By.xpath("//android.support.v7.widget.RecyclerView[@content-desc=\"New tab\"]");

    By menuButton = By.xpath("//android.widget.ImageButton[@content-desc=\"More options\"]");

    By settingsButton = By.xpath("//android.widget.TextView[@content-desc=\"Settings\"]");

    By paymentMethodsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.RelativeLayout");

    By paymenthBackButton = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

    By closePromoButton = By.xpath("com.android.chrome:id/signin_promo_close_button");

    By settingsBackButton = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

    By searchButton = By.xpath("//android.support.v7.widget.RecyclerView[@content-desc=\"New tab\"]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText");

    By editButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.EditText");

    By siteButton_appcent = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]");

    By desktopCheckButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[12]/android.widget.ImageView");

    By contactUsAppcent = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View");

    //By menuButton = By.id("com.android.chrome:id/search_provider_logo");

    //By buttonFour = By.id("com.android.chrome:id/button_four");

    //By settingsButton = By.id("com.android.chrome:id/menu_item_text");

    //By closeButton = By.id("com.android.chrome:id/signin_promo_close_button");

    //By generalHelpButton = By.id("com.android.chrome:id/menu_id_general_help");

    //By sendFeedbackButton = By.id("com.google.android.gms:id/gh_feedback_option");

    @BeforeTest
    public void setup() {
        try {
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "Pixel 4 API 29");
            cap.setCapability("udid", "emulator-5554");
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "10.0");
            cap.setCapability("skipUnlock", "true");
            cap.setCapability("appPackage", "com.android.chrome");
            cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
            cap.setCapability("noReset", "false");

            driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
            wait = new WebDriverWait(driver,10);

        }catch (MalformedURLException mx){
            System.out.println("Hatalı oluşturulmuş URL İstisnası!");

        }

    }

    @Test

    public void test() throws InterruptedException{

        Thread.sleep(1000);

        WebElement acceptButtonClick = driver.findElement(acceptButton);
        acceptButtonClick.click();

        Thread.sleep(1000);

        WebElement noThanksButtonClick = driver.findElement(noThanksButton);
        noThanksButtonClick.click();

        Thread.sleep(1000);

        WebElement menuButtonClick = driver.findElement(menuButton);
        menuButtonClick.click();

        Thread.sleep(1000);

        WebElement settingsButtonClick = driver.findElement(settingsButton);
        settingsButtonClick.click();

        Thread.sleep(1000);

        WebElement paymenthMethodsClick = driver.findElement(paymentMethodsButton);
        paymenthMethodsClick.click();

        Thread.sleep(1000);

        WebElement paymenthBackButtonClick = driver.findElement(paymenthBackButton);
        paymenthBackButtonClick.click();

        Thread.sleep(1000);

        WebElement settingsBackButtonClick = driver.findElement(settingsBackButton);
        settingsBackButtonClick.click();

        Thread.sleep(1000);

        WebElement searchButtonClick = driver.findElement(searchButton);
        searchButtonClick.click();

        Thread.sleep(1000);

        WebElement editButtonClick = driver.findElement(editButton);
        editButtonClick.sendKeys("Appcent mobi");

        driver.getKeyboard().sendKeys(Keys.ENTER);

        Thread.sleep(5000);

       // WebElement siteButtonClick_appcent = driver.findElement(siteButton_appcent);
       // siteButtonClick_appcent.click();

       // Thread.sleep(2000);

       // WebElement menuButtonClickAppcent = driver.findElement(menuButton);
       // menuButtonClickAppcent.click();

       // WebElement desktopCheckButtonClick = driver.findElement(desktopCheckButton);
       // desktopCheckButtonClick.click();

        //WebElement contactUsAppcentClick = driver.findElement(contactUsAppcent);
        //contactUsAppcentClick.click();


/*
        WebElement buttonFourClick = driver.findElement(buttonFour);
        buttonFourClick.click();

        WebElement settingsButtonClick = driver.findElement(settingsButton);
        settingsButtonClick.click();

        WebElement closeButtonClick = driver.findElement(closeButton);
        closeButtonClick.click();

        WebElement generalHelpClick = driver.findElement(generalHelpButton);
        generalHelpClick.click();

        WebElement sendFeedbackButtonClick = driver.findElement(sendFeedbackButton);
        sendFeedbackButtonClick.click(); */

    }


    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
