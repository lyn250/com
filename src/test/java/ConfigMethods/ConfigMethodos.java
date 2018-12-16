package ConfigMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class ConfigMethodos {
	private WebDriver driver;
	private String appURL = "https://www.falabella.com/falabella-cl/";
	
	public WebDriver getDriver() {
		return driver;
	}
	
    public void setDriver(String browserType) throws MalformedURLException {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
		case "ie":
			driver = initIEDriver(appURL);
			break;
		case "edge":
			driver = initEdgeDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType
					+ " es invalido, ejecutando chrome por defecto...");
			driver = initChromeDriver(appURL);
		}
	}
    
    private static WebDriver initChromeDriver(String appURL) throws MalformedURLException {
		System.out.println("Ejecutando Chrome...");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
        options.addArguments("no-sandbox");
		DesiredCapabilities browser = DesiredCapabilities.chrome();
		browser.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), browser);
		driver.manage().window().maximize();
		driver.get(appURL);
		return driver;
	}

	private static WebDriver initFirefoxDriver(String appURL) throws MalformedURLException {
		System.out.println("Ejecutando Firefox...");
		FirefoxOptions options = new FirefoxOptions();
		DesiredCapabilities browser = DesiredCapabilities.firefox();
		browser.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), browser);
		driver.manage().window().maximize();
		driver.get(appURL);
		return driver;
	}
	
	private static WebDriver initIEDriver(String appURL) throws MalformedURLException {
		System.out.println("Ejecutando Internet Explorer...");
		DesiredCapabilities browser = DesiredCapabilities.internetExplorer();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), browser);
		driver.get(appURL);
		return driver;
	}
	
	private static WebDriver initEdgeDriver(String appURL) throws MalformedURLException {
		System.out.println("Ejecutando Edge...");
		DesiredCapabilities browser = DesiredCapabilities.edge();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), browser);
		driver.manage().window().maximize();
		driver.get(appURL);
		return driver;
	}
}
