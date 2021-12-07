import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class Base {

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"15.0");

        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT,500000);
        capabilities.setCapability("commandTimeouts","12000");

        capabilities.setCapability(MobileCapabilityType.APP,"UIKitCatalog.app");

        String url = "http://localhost:4723/wd/hub";

        IOSDriver driver = new IOSDriver(new URL(url),capabilities);

    }

}
