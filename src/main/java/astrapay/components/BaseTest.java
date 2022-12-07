package astrapay.components;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

import java.io.File;


public class BaseTest {
    public AndroidDriver driver = null;
    public JavascriptExecutor jse;
    public static AppiumDriverLocalService service;

    @BeforeSuite(alwaysRun = true)
    public void setupServer() {
        try {
            if (service != null) {
                service.stop();
            }
            System.out.println("D. Setting Up Server. . . .");
            service = new AppiumServiceBuilder()
                    .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                    .withIPAddress("127.0.0.1")
                    .withArgument(GeneralServerFlag.BASEPATH, "/wd/hub/")
                    .usingPort(4723).build();
            Thread.sleep(5000);
            service.start();
        } catch (Exception e) {
            if(driver != null) {
                driver.quit();
            }

            if (service != null) {
                service.stop();
            }
        }


    }

    @BeforeClass(alwaysRun=true)
    public void setUp() {
        try {
            System.out.println("D. Setting Up Test. . . .");
            AndroidDriverSingleton singleton = AndroidDriverSingleton.getInstance();
            driver = singleton.getDriver();
        } catch (Exception e) {
            if(driver != null) {
                driver.quit();
            }

            if (service != null) {
                service.stop();
            }
        }

    }

    @AfterSuite(alwaysRun=true)
    public void tearDown() {
        try {
            System.out.println("D. Ending Appium session. . . .");
            driver.quit();
            service.stop();
        } catch (Exception e) {
            if(driver != null) {
                driver.quit();
            }

            if (service != null) {
                service.stop();
            }
        }

    }

    @AfterMethod(alwaysRun = true)
    public void closeApp() {
        try {
            System.out.println("D. AfterMethod: Closing App. . . .");
            driver.terminateApp("com.ada.astrapayupdate");
        } catch (Exception e) {
            if(driver != null) {
                driver.quit();
            }

            if (service != null) {
                service.stop();
            }
        }

    }

    @BeforeMethod(alwaysRun = true)
    public void openApp() throws InterruptedException {
        try {
            System.out.println("D. BeforeMethod: Launching App. . . .");
            driver.launchApp();
//        driver.activateApp("com.ada.astrapayupdate");
        } catch (Exception e) {
            if(driver != null) {
                driver.quit();
            }

            if (service != null) {
                service.stop();
            }
        }

    }


}
