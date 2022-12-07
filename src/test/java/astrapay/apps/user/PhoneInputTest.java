package astrapay.apps.user;

//import io.appium.java_client.MobileBy;
//import io.appium.java_client.android.AndroidElement;

import astrapay.apps.user.onboarding.OnboardingPage;
import astrapay.apps.user.phoneinput.PhoneInputPage;
import astrapay.apps.user.pininput.PinInputPage;
import astrapay.apps.user.registration.RegistrationPage;
import astrapay.components.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhoneInputTest extends BaseTest {

    @Test
    public void inputCorrectButUnregisteredPhoneNumberAndContinue() throws Exception {
        System.out.println("starting second test 1. . . .");
        OnboardingPage onboardingPage = new OnboardingPage(driver);
        PhoneInputPage phoneInputPage = new PhoneInputPage(driver);
        onboardingPage.clickLoginOrRegisterButton();
        phoneInputPage.inputUnregisteredCorrectPhoneNumber();
        phoneInputPage.clickButtonContinue();
        phoneInputPage.isNumberNotRegistered();
    }

    @Test
    public void inputCorrectButRegisteredPhoneNumberAndContinue() throws Exception {
        System.out.println("starting second test 2. . . .");
        OnboardingPage onboardingPage = new OnboardingPage(driver);
        PhoneInputPage phoneInputPage = new PhoneInputPage(driver);
        PinInputPage pinInputPage = new PinInputPage(driver);
        onboardingPage.clickLoginOrRegisterButton();
        phoneInputPage.inputRegisteredCorrectPhoneNumber();
        phoneInputPage.clickButtonContinue();
        pinInputPage.isCurrentPage();
    }

//    @Test
//    public void test3() throws Exception {
//        System.out.println("starting second test 3. . . .");
////        Thread.sleep(30000);
//
//        WebElement searchElement = new WebDriverWait(driver, Duration.ofSeconds(30)).until(
//                ExpectedConditions.elementToBeClickable(AppiumBy.id("com.ada.astrapayupdate:id/btnLogin")));
////      searchElement.click();
////      AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(
////          ExpectedConditions.elementToBeClickable(MobileBy.id("com.ada.astrapayupdate:id/btnLogin")));
////      searchElement.click();
////      List<AndroidElement> allProductsName = driver.findElementsByClassName("android.widget.TextView");
//        Assert.assertTrue(searchElement.isDisplayed());
//    }
//
//    @Test
//    public void test4() throws Exception {
//        System.out.println("starting second test 4. . . .");
//        WebElement searchElement = new WebDriverWait(driver, Duration.ofSeconds(30)).until(
//                ExpectedConditions.elementToBeClickable(AppiumBy.id("com.ada.astrapayupdate:id/btnLogin")));
////        searchElement.click();
////      AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(
////          ExpectedConditions.elementToBeClickable(MobileBy.id("com.ada.astrapayupdate:id/btnLogin")));
////      searchElement.click();
////      List<AndroidElement> allProductsName = driver.findElementsByClassName("android.widget.TextView");
//        Assert.assertTrue(searchElement.isDisplayed());
//    }
}
