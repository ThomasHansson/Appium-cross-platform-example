package AppiumSupport;

import io.appium.java_client.AppiumDriver;

/**
 * Created by Thomas on 2016-06-15.
 */
public abstract class AppiumBaseClass {

    protected AppiumDriver driver() {
        return AppiumController.instance.driver;
    }
}
