package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.*;

public class MenuPage extends AbstractPage {
    public MenuPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    private By btnOpenMenu = className("android.widget.ImageButton");
    private By btnAuth = id("com.gsgroup.tricoloronline.mobile:id/sign_in_button");
    private By btnChanel = xpath("//*[contains(@text, 'Каналы')]");

private void openMenu(){
    new MainPage(driver).openMainPage();
    clickButton(btnOpenMenu,30);
}

public void clicBtnAuth(){
    openMenu();
    clickButton(btnAuth,3);
}

public void clicBtnChanel(){
    openMenu();
    clickButton(btnChanel,3);
}









}
