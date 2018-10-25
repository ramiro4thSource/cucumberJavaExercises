package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	protected static WebDriver driver;

	public DriverFactory() {
		initialize();
	}

	public void initialize() {
		if (driver == null)
			createNewDriverInstance();
	}

	public void createNewDriverInstance() {
		String browser = new PropertyReader().readProperty("browser");
		if ("firefox".equals(browser)) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
			driver = new FirefoxDriver();

		} else if ("chrome".equals(browser)) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if ("explorer".equals(browser)) {
			driver = new InternetExplorerDriver();

		} else {
			System.out.println("can't read browser type");

		}
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void destroyDriver() {
		driver.quit();
		driver = null;
	}

}
