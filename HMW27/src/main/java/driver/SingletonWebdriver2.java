package driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonWebdriver2 {

	private static ChromeDriver driver = new ChromeDriver();

	private SingletonWebdriver2() {

	}

	public static ChromeDriver getSingletonWebdriver() {

		return driver;

	}

}
