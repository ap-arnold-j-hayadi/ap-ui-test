package astrapay.apps.user;

//import io.appium.java_client.MobileBy;
//import io.appium.java_client.android.AndroidElement;

import astrapay.components.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest extends BaseTest {

    @Test
    public void test() throws Exception {
        System.out.println("starting test 1. . . .");
//        jse.executeScript("browserstack_executor: {\"action\": \"annotate\", \"arguments\": {\"data\": \"Starting Test 1 . . .\", \"level\": \"info\"}}");
//        jse.executeScript("browserstack_executor: {\"action\": \"annotate\", \"arguments\": {\"data\": \"Sleeping for 30000ms . . .\", \"level\": \"info\"}}");
//        Thread.sleep(30000);
      WebElement searchElement = new WebDriverWait(driver, Duration.ofSeconds(30)).until(
          ExpectedConditions.elementToBeClickable(AppiumBy.id("com.ada.astrapayupdate:id/btnLogin")));
//      searchElement.click();
//      AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(
//          ExpectedConditions.elementToBeClickable(MobileBy.id("com.ada.astrapayupdate:id/btnLogin")));
//      searchElement.click();
//      List<AndroidElement> allProductsName = driver.findElementsByClassName("android.widget.TextView");
//            StarterPage starterPage = new StarterPage(driver);
//            starterPage.clickLoginOrRegisterButton();

      Assert.assertTrue(searchElement.isDisplayed());

//            if (searchElement.isDisplayed()) {
//                jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Results found!\"}}");
//            }
//            else {
//                jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Results not found\"}}");
//            }

    }

    @Test
    public void test2() throws Exception {
        System.out.println("starting test 2. . . .");
//        StarterPage starterPage = new StarterPage(driver);
        WebElement searchElement = new WebDriverWait(driver, Duration.ofSeconds(30)).until(
                ExpectedConditions.elementToBeClickable(AppiumBy.id("com.ada.astrapayupdate:id/btnLogin")));
//        searchElement.click();
//      AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(
//          ExpectedConditions.elementToBeClickable(MobileBy.id("com.ada.astrapayupdate:id/btnLogin")));
//      searchElement.click();
//      List<AndroidElement> allProductsName = driver.findElementsByClassName("android.widget.TextView");
        Assert.assertTrue(searchElement.isDisplayed());
    }

    @Test
    public void test3() throws Exception {
        System.out.println("starting test 3. . . .");
//        Thread.sleep(30000);

        WebElement searchElement = new WebDriverWait(driver, Duration.ofSeconds(30)).until(
                ExpectedConditions.elementToBeClickable(AppiumBy.id("com.ada.astrapayupdate:id/btnLogin")));
//      searchElement.click();
//      AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(
//          ExpectedConditions.elementToBeClickable(MobileBy.id("com.ada.astrapayupdate:id/btnLogin")));
//      searchElement.click();
//      List<AndroidElement> allProductsName = driver.findElementsByClassName("android.widget.TextView");
        Assert.assertTrue(searchElement.isDisplayed());
    }

    @Test
    public void test4() throws Exception {
        System.out.println("starting test 4. . . .");
        WebElement searchElement = new WebDriverWait(driver, Duration.ofSeconds(30)).until(
                ExpectedConditions.elementToBeClickable(AppiumBy.id("com.ada.astrapayupdate:id/btnLogin")));
//        searchElement.click();
//      AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(
//          ExpectedConditions.elementToBeClickable(MobileBy.id("com.ada.astrapayupdate:id/btnLogin")));
//      searchElement.click();
//      List<AndroidElement> allProductsName = driver.findElementsByClassName("android.widget.TextView");
        Assert.assertTrue(searchElement.isDisplayed());
    }
}
