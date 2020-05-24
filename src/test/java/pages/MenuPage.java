package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

import static org.openqa.selenium.By.*;

public class MenuPage extends AbstractPage {
    public MenuPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    private By btnOpenMenu = className("android.widget.ImageButton");
    private By btnAuth = id("com.gsgroup.tricoloronline.mobile:id/sign_in_button");
    private String  btnChanel = "com.gsgroup.tricoloronline.mobile:id/drawer_item_layout";

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
    List<MobileElement> clickBtnChanel = driver.findElementsById(btnChanel);
    clickBtnChanel.get(1).click();
}









}
