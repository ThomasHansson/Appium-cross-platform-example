package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thomas on 2016-06-15.
 */
public class ContactDetailPageIOS implements ContactDetailPage {

    public ContactDetailPageIOS(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Contacts\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
    private MobileElement contactName;

    public void assertContactName(String expectedName) {
        Assert.assertEquals(expectedName, contactName.getText());
    }
}
