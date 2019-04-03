package mailTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.xml.sax.SAXException;

import SQL.Content;
import SQL.SQL_request;
import adapter.JSONObject;
import adapter.JSONResponse;
import adapter.XMLResponse;
import adapter.XMLResponseAdapter;

import org.testng.AssertJUnit;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SingletonWebdriver;
import factories.GUIFactory;
import mailTest.Paint;
import parser.Run;

public class MailSteps {
	private static final Logger logger = Logger.getLogger(MailSteps.class);
	private static final String DATA_XML = "data.xml";

	private WebDriver driver;
	private Paint paint;

	private Inbox inbox;
	private MainMailRu mainMailRu;
	private SQL_request sql;
	private Content content;

	public MailSteps() {
		driver = SingletonWebdriver.getSingletonWebdriver();
		sql = new SQL_request(new Content());
		inbox = new Inbox(driver);
		mainMailRu = new MainMailRu(driver);

	}

	public MailSteps(GUIFactory factory) {
		paint = new Paint(factory);

	}

	@Given("^I am on page with url \"([^\"]*)\"$")
	public void loadPageWithUrl(String url) {
		driver.get(url);
		logger.info("im on the main page");
		paint.paint();

	}

	@When("^I enter login and pass$")
	public void loginAsCorrectUser() {
		sql.fill();
		content = sql.getContent();
		mainMailRu.enterData(content.getLogin(), content.getPassword());
		logger.info("enter log and pass");

	}

	@And("^I press enter Button$")
	public void enterButton() {
		mainMailRu.enterButton();
		new WebDriverWait(driver, 5).until(ExpectedConditions.titleContains(content.getIncome()));
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(inbox.newLetter));
		logger.info("press enter");

	}

	@And("^I choose letter$")
	public void clickFind() {
		inbox.chooseLetterClick();
		logger.info("choose letter");

	}

	@And("^I put letter in spam$")
	public void pickUpDate() {
		inbox.spamButtonClick();
		logger.info("click on spam button");

	}

	@Then("^I check if popup appers$")
	public void hotels() {
		AssertJUnit.assertEquals(inbox.notify(driver), true);
		logger.info("check if popup appers");

	}

	@And("^I click spam tab$")
	public void spamTab() {
		inbox.spamTabClick();
		logger.info("i click spam tab");

	}

	@And("^I take out letter from spam$")
	public void outSpamTab() {
		inbox.notSpamTabClick();
		logger.info("tke letter from spam");

	}

	@And("^I tap on new letter$")
	public void newLetter() {
		inbox.newLetter();
		logger.info("tap on new letter");

	}

	@And("^I enter mail for letter$")
	public void enterNewLetter() {
		try {
			inbox.enterNewLetter(Run.dataFill(), content.getEmailSubject());
		} catch (ParserConfigurationException | SAXException | IOException | XMLStreamException e) {
			e.printStackTrace();
		}
		logger.info("enter mail for letters");

	}

	@And("^I tap send button$")
	public void tapSend() {
		inbox.sendButtonClick();
		logger.info("click on send btn");

	}

	@And("^I tap confirm button$")
	public void confirmBtn() {
		inbox.confirmPopupButton();
		logger.info("click on confirm");

	}

	@Then("^I check if confirm popup appears$")
	public void confirmPopUp() {
		AssertJUnit.assertTrue(inbox.messageSendConfirm(driver));
		logger.info("check if popup appears");

	}

	@And("^I choose three letters$")
	public void chooseLetters() {
		inbox.chooseThreeLettersClick();
		logger.info("choose 3 letters");

	}

	@And("^I tap on more drop tab$")
	public void moreDrop() {
		inbox.moreDrop();
		logger.info("open more drop tab");

	}

	@And("^I tap on drop tab flag$")
	public void tabFlag() {
		inbox.moreDropFlag();
		logger.info("tap on drop tab flag");

	}

	@Then("^I check if three flags appear$")
	public void checkFlags() {
		AssertJUnit.assertTrue(inbox.notify(driver));
		AssertJUnit.assertTrue(inbox.ifFirstFlag(driver));
		AssertJUnit.assertTrue(inbox.ifThirdFlag(driver));
		AssertJUnit.assertTrue(inbox.ifSecondFlag(driver));
		logger.info("check if 3 flags appear");

	}

	@And("^I pick all letters$")
	public void pickAll() {
		inbox.pickAll();
		logger.info("pick all letters");

	}

	@And("^I tap skip button$")
	public void skipFlag() {
		inbox.SkipFlag();
		logger.info("tap on skip btn");

	}

	@Then("^I check if popup appears$")
	public void confirmNotify() {
		AssertJUnit.assertTrue(inbox.notify(driver));
		logger.info("check if popup appears");

	}

	@And("^I tap exit button$")
	public void exit() {
		inbox.exit();
		logger.info("tap exit btn");

	}

	@Then("^I check that login page opens$")
	public void checkLoginPage() {
		AssertJUnit.assertTrue(mainMailRu.ifInDisplayed(driver));
		logger.info("check login page open");

	}

	@And("^I enter \"([^\"]*)\" in search tab$")
	public void inputSearch(String text) {
		mainMailRu.enterSearchData(text);
		logger.info("enter text in seaech tab");

	}

	@And("^I press search button$")
	public void searchBtn() {
		mainMailRu.btnClick();
		logger.fatal("click on search btn");

	}

	@Then("^I check that google appears in results$")
	public void checkGoogle() {
		AssertJUnit.assertTrue(mainMailRu.ifGoogleHere(driver));
		logger.error("check if google appears");

	}

	@And("^I tap flag tab$")
	public void flagTab() {
		inbox.flagTabClick();
		logger.warn("click on flag tab");

	}

	@Then("^I check if any latters there$")
	public void checkAnyLetter() {
		AssertJUnit.assertFalse(inbox.ifAnyLetter());
		logger.debug("check if any letters here");

	}

	@AfterMethod
	public void screenshot() throws HeadlessException, AWTException, IOException {
		BufferedImage image = new Robot()
				.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image, "png", new File("/screenshot.png"));

	}

	@AfterClass
	public void adapter() {
		JSONObject JSONObject = new JSONObject("event: 'checkout';");
		JSONResponse jSONResponse = new JSONResponse(JSONObject);

		XMLResponse xMLResponse = new XMLResponse();
		XMLResponseAdapter XMLResponseAdapter = new XMLResponseAdapter(xMLResponse.getXMLObject());

		System.out.println(jSONResponse.isJSONEqual(XMLResponseAdapter.getJSONObject()));

	}

	@AfterMethod
	public void afterTest() {

		driver.quit();

	}

}
