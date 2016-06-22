package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thomas on 2016-06-15.
 */
public class ContactSearchPageAndroid implements ContactSearchPage {

    public ContactSearchPageAndroid(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "main_search")
    public MobileElement searchField;

    @FindBy(id = "name")
    public MobileElement firstSearchResultName;


    public void search(String name) {
        searchField.sendKeys(name);
    }

    public MobileElement getFirstSearchResult() {
        return firstSearchResultName;
    }
}
