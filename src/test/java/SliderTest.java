import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.testng.Assert;


import java.net.MalformedURLException;

public class SliderTest extends Base{

    public static void main(String[] args) throws MalformedURLException {
        IOSDriver driver = desiredCapabilities();

        driver.findElementByAccessibilityId("Sliders").click();

       IOSElement slider = (IOSElement)driver.findElementByXPath("//XCUIElementTypeSlider");
       //setValue only takes values between 0 - 1
       slider.setValue("0%");
       slider.setValue("1%");
       Assert.assertEquals("98%", slider.getAttribute("value"));

    }
}
