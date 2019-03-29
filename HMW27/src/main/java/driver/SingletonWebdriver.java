package driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonWebdriver {

	private static ChromeDriver driver;

	private SingletonWebdriver() {

	}

	public static ChromeDriver getSingletonWebdriver() {

		if (driver == null) {
			driver = new ChromeDriver();
		}
		return driver;
	}

}
