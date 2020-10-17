import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;

public class TC01_SendKeys extends Base{
    public static void main(String[] args) throws MalformedURLException {
        IOSDriver driver = caps();

        driver.findElementByAccessibilityId("Alert Views").click();
        driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Text Entry']").click();
        driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("hello");
        driver.findElementByName("OK").click();

    }
}
