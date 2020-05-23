package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.id;

public class MainPage extends AbstractPage {
    public MainPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    private By mainPage = id("com.gsgroup.tricoloronline.mobile:id/feedsRecyclerView");

    public void openMainPage(){
        waitElement(mainPage,30);
    }


}



