package astrapay.apps.user.registration;

import astrapay.components.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegistrationPage extends BasePage {
    private AppiumDriver driver;

    public RegistrationPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[1]")
    private WebElement titleText;

//    public void clickButtonSignUp() {
//        signUpButton.click();
//    }

    @Override
    public void isCurrentPage() {
        Assert.assertTrue(
                titleText.getText().equals("Lengkapi data-data dibawah ini:")
        );
    }
}
