package Appium.appiumtest;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Test1 extends TestBase {
	@Test
	public void f() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
	}
}
