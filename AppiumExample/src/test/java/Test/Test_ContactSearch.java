package Test;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Thomas on 2016-06-15.
 */
public class Test_ContactSearch extends BaseTestClass {

    @Test
    public void searchContact() {
        //Search for contact
        searchPage.search("Sara");

        //Verify result
        searchPage.assertSearchResult("Sara Alston");

        //Navigate to detail page
        searchPage.navigateToSearchResultDetails();

        //Verify that correct page is displayed
        detailPage.assertContactName("Sara Alston");
    }
}
