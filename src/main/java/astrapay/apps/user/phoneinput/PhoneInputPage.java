package astrapay.apps.user.phoneinput;

import astrapay.components.BasePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PhoneInputPage extends BasePage {
    private AndroidDriver driver;

    public PhoneInputPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.ada.astrapayupdate:id/userForgotPinInformationBox")
    private WebElement titleText;
    @AndroidFindBy(id = "com.ada.astrapayupdate:id/input_phone_number")
    private WebElement inputPhoneTextInput;
    @AndroidFindBy(id = "com.ada.astrapayupdate:id/btnContinue")
    private WebElement continueButton;

    @AndroidFindBy(id = "com.ada.astrapayupdate:id/labelMsg")
    private WebElement labelText;
    @AndroidFindBy(id = "com.ada.astrapayupdate:id/btnConfirm")
    private WebElement signUpButton;



    public void inputUnregisteredCorrectPhoneNumber() {
        inputPhoneTextInput.sendKeys("8888888888");
    }

    public void inputRegisteredCorrectPhoneNumber() {
        inputPhoneTextInput.sendKeys("8196000196");
    }

    public void clickButtonContinue() {
        continueButton.click();
    }

    public void isNumberNotRegistered() {
        Assert.assertTrue(labelText.isDisplayed());
    }

    @Override
    public void isCurrentPage() {
        Assert.assertTrue(
                titleText.getText().equals("Silakan masukan nomor handphone yang terdaftar")
        );
    }
}
