package astrapay.apps.user.pininput;

import astrapay.components.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PinInputPage extends BasePage {
    private AppiumDriver driver;

    public PinInputPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.ada.astrapayupdate:id/userForgotPinInformationBox")
    private WebElement titleText;

//    public void clickButtonSignUp() {
//        signUpButton.click();
//    }

    @Override
    public void isCurrentPage() {
        Assert.assertTrue(
                titleText.getText().equals("Silahkan masukkan PIN AstraPay")
        );
    }
}
