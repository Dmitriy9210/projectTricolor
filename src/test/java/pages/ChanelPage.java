package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.id;

public class ChanelPage extends AbstractPage{

    public ChanelPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    MenuPage menuPage = new MenuPage(driver);

    private By pageChanel = id("com.gsgroup.tricoloronline.mobile:id/kdlRoot");

    public void openChanelPage(){
        menuPage.clicBtnChanel();
        waitElement(pageChanel,10);
    }

}
