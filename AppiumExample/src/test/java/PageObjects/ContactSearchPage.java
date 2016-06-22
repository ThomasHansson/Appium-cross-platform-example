package PageObjects;

import io.appium.java_client.MobileElement;

/**
 * Created by Thomas on 2016-06-15.
 */
public interface ContactSearchPage {

    public void search(String name);

    public MobileElement getFirstSearchResult();
}
