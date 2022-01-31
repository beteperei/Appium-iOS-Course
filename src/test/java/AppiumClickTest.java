import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;

public class AppiumClickTest extends UIKitCatalogBase {
    public static void main(String[] args) throws MalformedURLException {

        IOSDriver driver = desiredCapabilities();

        driver.findElementByAccessibilityId("Alert Views").click();

        driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Text Entry']").click();
        driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("hello");
        driver.findElementByXPath("//XCUIElementTypeButton[@name='Cancel']").click();

        driver.findElementByAccessibilityId("Confirm / Cancel").click();
        System.out.println(driver.findElementByXPath("//*[contains(@name,'message')]").getText());
        driver.findElementByXPath("//XCUIElementTypeButton[@name='Confirm']").click();

    }
}
