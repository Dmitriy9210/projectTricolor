package actions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AuthorizationPage;
import pages.MenuPage;

import java.net.MalformedURLException;
import java.net.URL;

public class TestTricolor {

    private AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.gsgroup.tricoloronline.mobile");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.gsgroup.phoenix.ui.screen.launch.LauncherActivity");
//        caps.setCapability(MobileCapabilityType.APP, "\\src\\test\\java\\actions.TestTest.java");
        URL appiumURL = new URL("http://localhost:4723/wd/hub");

        driver = new AppiumDriver<MobileElement>(appiumURL, caps);
    }

    @AfterTest
    public void testStop() {
        driver.quit();
    }

    @Test
    public void firstTest() {
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clicBtnAuth();
        new AuthorizationPage(driver).authUser("41219007268222", "92090009");
        menuPage.clicBtnChanel();
    }

}
