package homework;

import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.WebDriver;

import adapter.JSONObject;
import adapter.JSONResponse;
import adapter.XMLResponse;
import adapter.XMLResponseAdapter;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SingletonWebdriver;
import factories.GUIFactory;
import homework.Paint;

public class Homework27Steps {
	private Paint paint;
	private WebDriver driver;

	private SeachTab seachTab;
	private ListTab listTab;

	public Homework27Steps() {

		driver = SingletonWebdriver.getSingletonWebdriver();

		seachTab = new SeachTab(driver);
		listTab = new ListTab(driver);
	}

	public Homework27Steps(GUIFactory factory) {
		paint = new Paint(factory);

	}

	@Given("^I am on page with url \"([^\"]*)\"$")
	public void loadPageWithUrl(String url) {
		driver.get(url);
	}

	@And("^Where am I$")
	public void nameIt() {
		paint.paint();

	}

	@And("^I check the adapter$")
	public void adapter() {
		JSONObject JSONObject = new JSONObject("event: 'checkout';");
		JSONResponse jSONResponse = new JSONResponse(JSONObject);

		XMLResponse xMLResponse = new XMLResponse();
		XMLResponseAdapter XMLResponseAdapter = new XMLResponseAdapter(xMLResponse.getXMLObject());

		System.out.println(jSONResponse.isJSONEqual(XMLResponseAdapter.getJSONObject()));

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
