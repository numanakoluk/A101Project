import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Second {

    AppiumDriver<WebElement> driver;


    @BeforeEach
    public void setUp() throws MalformedURLException {
        //A101 application
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy S10");
        desiredCapabilities.setCapability("appPackage", "org.studionord.a101");
        desiredCapabilities.setCapability("appActivity", "org.studionord.a101.MainActivity");
        driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }



}
