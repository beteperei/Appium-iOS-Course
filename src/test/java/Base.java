import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Base {
    static IOSDriver<IOSElement> driver;

    public static IOSDriver<IOSElement> caps() throws MalformedURLException {
        DesiredCapabilities d = new DesiredCapabilities();
        d.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro");
        d.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
        d.setCapability(MobileCapabilityType.PLATFORM_VERSION,"13.3");
        d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        d.setCapability(MobileCapabilityType.APP,"//Users//bpena//Documents//Automation//UIKitCatalog.app");

        String url = "http://127.0.0.1:4723/wd/hub";
        driver = new IOSDriver<>(new URL(url),d);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }



}
