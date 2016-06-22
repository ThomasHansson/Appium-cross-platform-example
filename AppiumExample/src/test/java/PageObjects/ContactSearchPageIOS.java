package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thomas on 2016-06-15.
 */
public class ContactSearchPageIOS implements ContactSearchPage {

    public ContactSearchPageIOS(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIASearchBar[1]")
    public MobileElement searchFieldDefault;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIASearchBar[1]")
    public MobileElement searchFieldHighlighted;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")
    public MobileElement firstSearchResultName;

    public void search(String name) {
        searchFieldDefault.click();
        searchFieldHighlighted.sendKeys(name);
    }

    public MobileElement getFirstSearchResult() {
        return firstSearchResultName;
    }
}
