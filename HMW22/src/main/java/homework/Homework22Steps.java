package homework;

import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homework22Steps {
	private WebDriver driver;

	private SeachTab seachTab;
	private ListTab listTab;

	public Homework22Steps () {
		driver = new ChromeDriver();
		seachTab = new SeachTab(driver);
		listTab = new ListTab(driver);
	}

	  @Given("^I am on page with url \"([^\"]*)\"$")
	    public void loadPageWithUrl(String url)
	    {
	        driver.get(url);
	    }

	@When("^I enter the city$")
	public void loginAsCorrectUser() {
		seachTab.enterNewLetter("Москва");
		seachTab.searchButtonClick();
	}

	@And("^I check numbers of room and people$")
	public void checkNumber() {
		assertTrue(seachTab.twoOldOneBedIs(driver));
		assertTrue(seachTab.oneBed(driver));
	}

	@And("^I click on find button$")
	public void clickFind() {
		seachTab.searchClick();

	}

	@And("^I choose the date on calendar$")
	public void pickUpDate() {
		listTab.ifCalendar();
		listTab.pickUpDate();
		listTab.find();
	}

	@Then("^I check if there are hotels$")
	public void hotels() {
		assertTrue(listTab.ifDate() > 0);

	}

	@And("^I sorted hotels by rating$")
	public void sortByRating() {
		listTab.threeDotsClick();
		listTab.bestrate();

	}

	@And("^I open the first hotel$")
	public void firstHotel() {
		listTab.firstLink(driver);

	}

	@Then("^I check rate of hotel$")
	public void rateOfFirst() {
		assertTrue(listTab.rateNine() >= 9);

	}

	@After
	public void afterTest() {

		driver.quit();

	}

}
