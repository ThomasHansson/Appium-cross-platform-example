package PageObjects;

import io.appium.java_client.MobileElement;

/**
 * Created by Thomas on 2016-06-15.
 */
public interface ContactSearchPage {

    void search(String name);

    MobileElement getFirstSearchResult();
}
