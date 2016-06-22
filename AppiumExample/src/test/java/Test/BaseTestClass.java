package Test;

import AppiumSupport.AppiumBaseClass;
import PageObjects.*;
import org.junit.After;
import org.junit.Before;

import AppiumSupport.AppiumController;

/**
 * Created by Thomas on 2016-06-15.
 */
public class BaseTestClass extends AppiumBaseClass{
    protected ContactSearchPage searchPage;
    protected ContactDetailPage detailPage;

    @Before
    public void setUp() throws Exception {
        AppiumController.instance.start();
        switch (AppiumController.executionOS) {
            case ANDROID:
                searchPage = new ContactSearchPageAndroid(driver());
                detailPage = new ContactDetailPageAndroid(driver());
                break;
            case IOS:
                searchPage = new ContactSearchPageIOS(driver());
                detailPage = new ContactDetailPageIOS(driver());
                break;
        }
    }

    @After
    public void tearDown() {
        AppiumController.instance.stop();
    }
}
