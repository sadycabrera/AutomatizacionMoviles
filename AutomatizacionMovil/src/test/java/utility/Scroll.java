package utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Scroll {

	private AndroidDriver<MobileElement> driver;
	private String path;

//	@Test	
	public static void verticalSwipe(TouchAction touch, int X0, int Y0, int Xend, int Yend)
			throws MalformedURLException, InterruptedException {

		touch = new TouchAction(Hook.getDriver());
		Thread.sleep(1000);
		touch.press(X0, Y0).moveTo(Xend, Yend).release().perform();

			//touch.press(200, 1080).moveTo(200, 1020).release().perform();// GENERAL
		}

	

	public void tap_por_coordenadas() {
		Hook.getDriver().tap(1, 23, 232, 200);
	}

}
