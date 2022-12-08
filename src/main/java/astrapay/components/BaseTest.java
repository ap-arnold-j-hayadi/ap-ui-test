package astrapay.components;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;


public class BaseTest {
    public static AndroidDriver driver = null;
    public static AppiumDriverLocalService service;

    public String testConfig = "local-android.conf.json";

    @BeforeSuite(alwaysRun = true)
    public void setupServer() {

        if (testConfig == null || testConfig.isEmpty()) {
            testConfig = System.getProperty("config");
        }

        if (testConfig.contains("local")) {
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
                System.out.println("Exception server " + e);
                if (driver != null) {
                    driver.quit();
                }

                if (service != null) {
                    service.stop();
                }
            }
        }
        setUp();
    }

//    @BeforeClass(alwaysRun=true)
    public void setUp() {
        try {
            System.out.println("D. Setting Up Test. . . .");
            AndroidDriverSingleton singleton = AndroidDriverSingleton.getInstance();
            driver = singleton.getDriver();
        } catch (Exception e) {
            System.out.println("Exception setUp " +e);
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
        System.out.println("D. AfterSuite: Driver " +driver);
        } catch (Exception e) {
            System.out.println("Exception teardown " +e);
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
            System.out.println("D. AfterMethod: Driver " +driver);
        } catch (Exception e) {
            System.out.println("Exception closeapp " +e);
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
