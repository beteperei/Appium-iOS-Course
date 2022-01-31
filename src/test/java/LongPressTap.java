import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSTouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;


public class LongPressTap extends LongTapBase{
    public static void main(String[] args) throws MalformedURLException {

        IOSDriver driver = desiredCapabilities();

        // Long Press
        MobileElement e = (MobileElement)driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Long tap']");

        IOSTouchAction touch = new IOSTouchAction(driver);
        touch.longPress(longPressOptions().withElement(element(e)).withDuration(ofSeconds(2)))
                .release().perform();

        // Switches
        MobileElement s = (MobileElement)driver.findElementByXPath("//XCUIElementTypeSwitch[1]");
        touch.tap(tapOptions().withElement(element(s))).perform();
    }
}
