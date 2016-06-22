package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thomas on 2016-06-15.
 */
public class ContactDetailPageIOS implements ContactDetailPage {

    public ContactDetailPageIOS(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]")
    public MobileElement contactName;

    public String getContactName() {
        return contactName.getText();
    }
}
