package astrapay.apps.user.onboarding;

import astrapay.components.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class OnboardingPage extends BasePage {
    private AppiumDriver driver;

    public OnboardingPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.ada.astrapayupdate:id/btnLogin")
    private WebElement btnLogin;

    public void clickLoginOrRegisterButton() {
        waitForElementToAppear(driver, btnLogin);
        btnLogin.click();
    }

    @Override
    public void isCurrentPage() {
        waitForElementToAppear(driver, btnLogin);
        Assert.assertTrue(btnLogin.isDisplayed());
    }
}
