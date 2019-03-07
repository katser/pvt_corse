package maksimka;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver;

	private SeachTab seachTab;
	private ListTab listTab;

	@Test
	public void FirstTask() {
		seachTab.enterNewLetter(" Москва");
		seachTab.searchButtonClick();
		assertTrue(seachTab.twoOldOneBedIs(driver));
		assertTrue(seachTab.oneBed(driver));
		seachTab.searchClick();
		listTab.ifCalendar();
		listTab.pickUpDate();
		listTab.find();
		assertTrue(listTab.ifDate() > 0);
	}

	@Test
	public void SecondTask() {
		seachTab.enterNewLetter(" Москва");
		seachTab.searchButtonClick();
		assertTrue(seachTab.twoOldOneBedIs(driver));
		assertTrue(seachTab.oneBed(driver));
		seachTab.searchClick();
		listTab.threeDotsClick();
		listTab.bestrate();
		listTab.firstLink(driver);
		assertTrue(listTab.rateNine() >= 9);

	}

	@BeforeMethod
	public void beforeTest() {
		driver = new ChromeDriver();
		seachTab = new SeachTab(driver);
		listTab = new ListTab(driver);
		driver.get("http://booking.com/");
	}

	@AfterMethod
	public void afterTest() {

		driver.quit();

	}

}