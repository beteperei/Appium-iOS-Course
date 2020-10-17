import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TC04_SafariBrowser {
    static IOSDriver<IOSElement> driver;
    @Test
    public void browser() throws MalformedURLException{
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.BROWSER_NAME,"safari");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"13.3");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro");

        String url = "http://127.0.0.1:4723/wd/hub";
        driver = new IOSDriver(new URL(url),dc);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");
        driver.findElementByName("q").sendKeys("Appium");
        driver.findElementsByClassName("sbct").get(0).click();
    }

}
