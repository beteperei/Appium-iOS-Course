import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;


import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class TC02 extends Base{
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        IOSDriver driver = caps();

        driver.findElementByAccessibilityId("Alert Views").click();
        driver.findElementByAccessibilityId("Text Entry").click();
        driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("hello");
        driver.findElementByName("OK").click();
        driver.navigate().back();

        Map<String, Object> scroll = new HashMap<>();
        scroll.put("direction", "down");
        scroll.put("name", "Web Views");
        driver.executeScript("mobile: scroll", scroll);


        driver.findElementByAccessibilityId("Steppers").click();
        driver.findElementByXPath("(//XCUIElementTypeButton[@name='Increment'])[1]").click();
        driver.findElementByXPath("(//XCUIElementTypeButton[@name='Increment'])[1]").click();
        WebElement number = (WebElement) driver.findElementsByClassName("XCUIElementTypeStaticText").get(1);
        System.out.println(number.getText());
        driver.findElementByXPath("(//XCUIElementTypeButton[@name='Decrement'])[1]").click();

        WebElement numberDecrease = (WebElement) driver.findElementsByClassName("XCUIElementTypeStaticText").get(1);
        System.out.println(numberDecrease.getText());

    }
}
