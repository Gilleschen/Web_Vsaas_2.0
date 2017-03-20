package Vsaas;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import Vsaas.LoadBrowserList;

public class Platform {

	static LoadBrowserList bl = new LoadBrowserList();
	public static WebDriver driver[] = new WebDriver[bl.BrowserList.size()];
	public static DesiredCapabilities cap[] = new DesiredCapabilities[bl.BrowserList.size()];

	public Platform() {

		for (int i = 0; i < bl.BrowserList.size(); i++) {
			cap[i] = new DesiredCapabilities();
		}

		for (int i = 0; i < bl.BrowserList.size(); i++) {

			if (bl.BrowserList.get(i).equals("IE")) {
				cap[i] = DesiredCapabilities.internetExplorer();
				// cap.setCapability("platform", "Windows 10");

			} else if (bl.BrowserList.get(i).equals("Chrome")) {
				cap[i] = DesiredCapabilities.chrome();
				// .setCapability("platform", "Windows 10");

			} else if (bl.BrowserList.get(i).equals("FireFox")) {
				cap[i] = DesiredCapabilities.firefox();
				// cap.setCapability("platform", "Windows 10");

			}
			try {
				driver[i] = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap[i]);
			} catch (MalformedURLException e) {
				;
			}
			driver[i].get("https://alpha.kalay.us/");

		}
		// Object obj= new Platform();
		// Class c = obj.getClass();
		// Method method = null;
		// method = c.getMethod(LoadBrowserList.BrowserList.get(i), new Class[]
		// {});
		// method.invoke(c.newInstance());

	}

	public static void main(String[] args) {

	}
}
