package astrapay.apps.user;

import astrapay.apps.user.onboarding.OnboardingPage;
import astrapay.apps.user.phoneinput.PhoneInputPage;
import astrapay.components.BaseTest;
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
