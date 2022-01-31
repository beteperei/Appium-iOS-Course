import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class ScrollTest extends Base{
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        IOSDriver driver = desiredCapabilities();

        //Scroll
        Map<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put("name", "Web View");

        driver.executeScript("mobile:scroll", scrollObject);
        driver.findElementByAccessibilityId("Web View").click();

        //Return to HomePage
        Thread.sleep(1000);
        driver.findElementByXPath("//XCUIElementTypeButton[@name='UIKitCatalog']").click();

        //Picker View
        driver.findElementByAccessibilityId("Picker View").click();
        driver.findElementByAccessibilityId("Red color component value").sendKeys("80");
        driver.findElementByAccessibilityId("Green color component value").sendKeys("220");
        driver.findElementByAccessibilityId("Blue color component value").sendKeys("105");

    }
}
