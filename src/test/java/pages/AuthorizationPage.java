package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.id;

public class AuthorizationPage extends AbstractPage{
    public AuthorizationPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    private By fieldLogin = id("com.gsgroup.tricoloronline.mobile:id/authLogin");
    private By fieldPassword = id("com.gsgroup.tricoloronline.mobile:id/authPass");
    private By btnStartAuth = id("com.gsgroup.tricoloronline.mobile:id/startAuth");

public void authUser(String login, String password){
    sendValue(fieldLogin, 5, login);
    sendValue(fieldPassword, 5, password);
    clickButton(btnStartAuth,5);
}
}
