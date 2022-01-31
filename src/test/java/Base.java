import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Base implements appLocalVariables {

    public static IOSDriver desiredCapabilities() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device_name);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,platform_version);

        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT,500000);
        capabilities.setCapability("commandTimeouts","12000");

        capabilities.setCapability(MobileCapabilityType.APP,app_local_url);

        IOSDriver driver = new IOSDriver(new URL(appium_url),capabilities);
        return driver;

    }

}
