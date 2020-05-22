import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestTest {

    private AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.gsgroup.tricoloronline.mobile");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.gsgroup.phoenix.ui.screen.launch.LauncherActivity");
        caps.setCapability(MobileCapabilityType.APP, "H:\\project mobile\\tricolor\\src\\test\\resources\\Кино и ТВ.apk");
//        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "1250");
        URL appiumURL = new URL("http://localhost:4723/wd/hub");

        driver = new AppiumDriver<MobileElement>(appiumURL, caps);
    }

    @AfterTest
    public void testStop(){
//        driver.quit();
    }

    @Test
    public void firstTest(){

        WebElement element = waitElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Открыть меню\"]"), 20);
        element.click();

        WebElement auth = waitElement(By.id("com.gsgroup.tricoloronline.mobile:id/sign_in_button"), 10);
        auth.click();

        WebElement login = waitElement(By.id("com.gsgroup.tricoloronline.mobile:id/authLogin"), 3);
        login.sendKeys("41219007268222");

        WebElement password = waitElement(By.id("com.gsgroup.tricoloronline.mobile:id/authPass"), 3);
        password.sendKeys("92090009");

        WebElement btnAuth = waitElement(By.id("com.gsgroup.tricoloronline.mobile:id/startAuth"), 3);
        btnAuth.click();





    }

    public WebElement waitElement(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }

}
