import io.appium.java_client.ios.IOSDriver;


import java.net.MalformedURLException;

public class TC03_PickerView  extends Base{
    public static void main(String[] args) throws MalformedURLException {
        IOSDriver driver = caps();

        driver.findElementByAccessibilityId("Picker View").click();
        driver.findElementByAccessibilityId("Green color component value").sendKeys("220");
        driver.findElementByAccessibilityId("Red color component value").sendKeys("55");
        driver.findElementByAccessibilityId("Blue color component value").sendKeys("130");

    }
}
