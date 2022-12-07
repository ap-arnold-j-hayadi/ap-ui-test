package astrapay.apps.user;

//import io.appium.java_client.MobileBy;
//import io.appium.java_client.android.AndroidElement;

import astrapay.apps.user.onboarding.OnboardingPage;
import astrapay.apps.user.phoneinput.PhoneInputPage;
import astrapay.components.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class OnboardingTest extends BaseTest {

    @Test(groups = {"essential"})
    public void ClickSignInOrRegisterButtonRedirectsToPhoneInputPage() {
        System.out.println("D. starting test 1. . . .");
        OnboardingPage onboardingPage = new OnboardingPage(driver);
        PhoneInputPage phoneInputPage = new PhoneInputPage(driver);
        onboardingPage.clickLoginOrRegisterButton();
        phoneInputPage.isCurrentPage();
    }
}
