package maksimka;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TaskTest {
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

	@BeforeTest
	public void beforeTest() {
		driver.get("http://booking.com/");
	}

	@AfterTest
	public void afterTest() {

		driver.quit();

	}

}