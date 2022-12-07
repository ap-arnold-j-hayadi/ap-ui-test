package astrapay.apps.user.onboarding;

import astrapay.components.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OnboardingPage extends BasePage {
    private AppiumDriver driver;

    public OnboardingPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.ada.astrapayupdate:id/btnLogin")
    private WebElement btnLogin;

    public void clickLoginOrRegisterButton() {
        btnLogin.click();
    }

    @Override
    public void isCurrentPage() {
        Assert.assertTrue(btnLogin.isDisplayed());
    }
}
