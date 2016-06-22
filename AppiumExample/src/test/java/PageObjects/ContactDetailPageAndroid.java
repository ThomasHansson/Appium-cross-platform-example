package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thomas on 2016-06-15.
 */
public class ContactDetailPageAndroid implements ContactDetailPage {

    public ContactDetailPageAndroid(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "detail_name")
    public MobileElement contactName;

    public String getContactName() {
        return contactName.getText();
    }
}
