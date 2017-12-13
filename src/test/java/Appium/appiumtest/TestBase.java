package Appium.appiumtest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Unit test for simple App.
 */
public class TestBase

{

	public AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		String serverIP = "0.0.0.0";
		String serverPort = "4723";
		String app = "com.cambassy";
		String deviceId = "520365e0f0c0a3cd";
		String deviceName = "j7xeltexx";
		String appDemo = "ApiDemos-debug.apk";
		AndroidDriver<AndroidElement> ad;

		System.out.println("test");
		File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		System.out.println("test2");
		dc.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		System.out.println("test3");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		System.out.println("test4");
		return ad;
	}

}
