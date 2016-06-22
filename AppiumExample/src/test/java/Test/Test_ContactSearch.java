package Test;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
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
        MobileElement searchResult = searchPage.getFirstSearchResult();
        Assert.assertEquals("Sara Alston", searchResult.getText());

        //Navigate to detail page
        searchResult.click();

        //Verify that correct page is displayed
        Assert.assertEquals("Sara Alston", detailPage.getContactName());
    }
}
