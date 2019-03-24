package group23.HMW25;

import org.testng.annotations.Test;

import group23.HMW25.Inbox;
import group23.HMW25.MainMailRu;
import group23.HMW25.Content;
import group23.HMW25.SQL_request;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MailTest {

	private WebDriver driver;

	private MainMailRu mainmailru;
	private Inbox inbox;
	private SQL_request sql;
	private Content content;

	@Test
	public void InSpam() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		sql.fill();
		driver.get("http://mail.ru/");
		content = sql.getContent();
		System.out.println();
		mainmailru.enterData(content.getLogin(), content.getPassword());
		mainmailru.enterButton();
		System.out.println("Зашли");
		new WebDriverWait(driver, 5).until(ExpectedConditions.titleContains(content.getIncome()));

		inbox.chooseLetterClick();
		System.out.println("выбрали письмо");

		inbox.spamButtonClick();
		System.out.println("кинули в спам");

		assertTrue(inbox.notify(driver));
	}

	@Test
	public void OutOfSpam() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		sql.fill();
		driver.get("http://mail.ru/");
		content = sql.getContent();
		System.out.println();
		mainmailru.enterData(content.getLogin(), content.getPassword());
		mainmailru.enterButton();
		System.out.println("Зашли");
		new WebDriverWait(driver, 5).until(ExpectedConditions.titleContains(content.getIncome()));

		inbox.chooseLetterClick();
		System.out.println("выбрали письмо");

		inbox.spamButtonClick();
		System.out.println("кинули в спам");

		inbox.spamTabClick();
		System.out.println("перешли по вкладке спам");

		inbox.chooseLetterClick();
		System.out.println("выбрали письмо");

		inbox.notSpamTabClick();
		System.out.println("достали из спама");

		assertTrue(inbox.notify(driver));
	}

	@Test
	public void SendAll() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		sql.fill();
		driver.get("http://mail.ru/");
		content = sql.getContent();
		System.out.println();
		mainmailru.enterData(content.getLogin(), content.getPassword());
		mainmailru.enterButton();
		System.out.println("Зашли");
		new WebDriverWait(driver, 5).until(ExpectedConditions.titleContains(content.getIncome()));
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(inbox.newLetter));

		inbox.newLetter();
		System.out.println("тапнули по новому письму");

		inbox.enterNewLetter(content.getEmail(), content.getEmailSubject());
		inbox.sendButtonClick();
		inbox.confirmPopupButton();
		assertTrue(inbox.messageSendConfirm(driver));
	}

	@Test
	public void ThreeFlag() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		sql.fill();
		driver.get("http://mail.ru/");
		content = sql.getContent();
		System.out.println();
		mainmailru.enterData(content.getLogin(), content.getPassword());
		mainmailru.enterButton();
		System.out.println("Зашли");
		new WebDriverWait(driver, 5).until(ExpectedConditions.titleContains(content.getIncome()));
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(inbox.newLetter));

		inbox.chooseThreeLettersClick();
		inbox.moreDrop();
		inbox.moreDropFlag();
		assertTrue(inbox.notify(driver));
		assertTrue(inbox.ifFirstFlag(driver));
		assertTrue(inbox.ifThirdFlag(driver));
		assertTrue(inbox.ifSecondFlag(driver));

	}

	@Test
	public void SkipFlag() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		sql.fill();
		driver.get("http://mail.ru/");
		content = sql.getContent();
		System.out.println();
		mainmailru.enterData(content.getLogin(), content.getPassword());
		mainmailru.enterButton();
		System.out.println("Зашли");
		new WebDriverWait(driver, 5).until(ExpectedConditions.titleContains(content.getIncome()));
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(inbox.newLetter));

		inbox.pickAll();
		inbox.moreDrop();
		inbox.SkipFlag();

	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		mainmailru = new MainMailRu(driver);
		inbox = new Inbox(driver);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();

	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		mainmailru = new MainMailRu(driver);
		inbox = new Inbox(driver);
		sql = new SQL_request(new Content());

	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
