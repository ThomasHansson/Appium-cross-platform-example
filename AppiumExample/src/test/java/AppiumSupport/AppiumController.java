package AppiumSupport;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Thomas on 2016-06-15.
 */
public class AppiumController {

    public static OS executionOS = OS.IOS;

    public enum OS {
        ANDROID,
        IOS
    }
    public static AppiumController instance = new AppiumController();
    public AppiumDriver driver;

    public void start() throws MalformedURLException {
        if (driver != null) {
            return;
        }
        switch(executionOS){
            case ANDROID:
                File classpathRoot = new File(System.getProperty("user.dir"));
                File appDir = new File(classpathRoot, "/app/Android");
                File app = new File (appDir, "Contacts.apk");
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("deviceName", "NotUsed");
                capabilities.setCapability("app", app.getAbsolutePath());
                capabilities.setCapability("appPackage", "com.jayway.contacts");
                capabilities.setCapability("appActivity", "com.jayway.contacts.MainActivity");
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;
            case IOS:
                classpathRoot = new File(System.getProperty("user.dir"));
                appDir = new File(classpathRoot, "/app/iOS/");
                app = new File(appDir, "ContactsSimulator.app");
                capabilities = new DesiredCapabilities();
                capabilities.setCapability("platformName", "ios");
                capabilities.setCapability("deviceName", "=iPhone 5s");
                capabilities.setCapability("app", app.getAbsolutePath());
                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;
        }
    }

    public void stop() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
