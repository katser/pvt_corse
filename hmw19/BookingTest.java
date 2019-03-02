package test;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BookingTest {

	private WebDriver driver;

	@Test
	public void CheapFilter() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com");
		WebElement searchField = driver.findElement(By.xpath("//*[@id=\"ss\"]"));
		searchField.clear();
		searchField.sendKeys("Париж");
		System.out.println("Ввести 'Париж'");

		WebElement dropdownDate = driver.findElement(By.xpath(
				"		//span[@class=\"sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb\"][1]\n"
						+ ""));

		dropdownDate.click();
		System.out.println("клик по дропу с датами");

		WebElement firstDate = driver.findElement(By.xpath("//td[@data-date=\"2019-03-03\"]"));
		firstDate.click();
		System.out.println("клик по первой дате");

		WebElement seconfDate = driver.findElement(By.xpath("//td[@data-date=\"2019-03-10\"]"));
		seconfDate.click();
		System.out.println("клик по второй дате");

		WebElement search = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button/span[1]"));
		search.click();
		System.out.println("Клик по кнопке поиска");

		WebElement groupAdults = driver.findElement(By.id("group_adults"));
		Select groupAdultsSelect = new Select(groupAdults);
		groupAdultsSelect.selectByIndex(1);
		System.out.println("2 взрослых");

		WebElement rooms = driver.findElement(By.id("no_rooms"));
		Select roomsSelect = new Select(rooms);
		roomsSelect.selectByIndex(0);
		System.out.println("одна комната");

		WebElement groupChildren = driver.findElement(By.id("group_children"));
		Select groupChildrenSelect = new Select(groupChildren);
		groupChildrenSelect.selectByIndex(0);
		System.out.println("без детей");

		WebElement find = driver.findElement(By.xpath("//button[@class=\"sb-searchbox__button  \"]"));
		find.click();
		System.out.println("Клик по кнопке поиска");

		WebElement cheapFilter = driver.findElement(By.xpath("//li[@class=\" sort_category   sort_price \"]"));
		cheapFilter.click();
		System.out.println("Клик по сортировке от дешевых");

		List<WebElement> links = driver
				.findElements(By.xpath("//*[@class=\"sr_item_content sr_item_content_slider_wrapper \"]"));
		System.out.println("Кол-во отелей под нужную сортировку " + links.size());

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Подождали");

		WebElement fiveStars = driver.findElement(By.xpath("//a[@data-id=\"class_plus-5\"]"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", fiveStars);
		System.out.println("Проскролили");

		fiveStars.click();
		System.out.println("Выбрали 5 звезд");

		WebElement noMoney = driver.findElement(
				By.xpath("//*[@id=\"hotellist_inner\"]/div[1]/div[2]/div[2]/div/table/tbody/tr/td[2]/div/strong"));
		System.out.println("Стоимость: " + noMoney.getText());
		int lessThanNoMoney = Integer.parseInt(noMoney.getText().replaceAll("[\\D]", ""));

		AssertJUnit.assertTrue(lessThanNoMoney <= 700);

		driver.close();
		driver.quit();

	}

	@Test
	public void CheapFromExpensive() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com");
		WebElement searchField = driver.findElement(By.xpath("//*[@id=\"ss\"]"));
		searchField.clear();
		searchField.sendKeys("Париж");
		System.out.println("Ввести 'Париж'");

		WebElement dropdownDate = driver.findElement(By.xpath(
				"		//span[@class=\"sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb\"][1]\n"
						+ ""));

		dropdownDate.click();
		System.out.println("клик по дропу с датами");

		WebElement firstDate = driver.findElement(By.xpath("//td[@data-date=\"2019-03-03\"]"));
		firstDate.click();
		System.out.println("клик по первой дате");

		WebElement seconfDate = driver.findElement(By.xpath("//td[@data-date=\"2019-03-10\"]"));
		seconfDate.click();
		System.out.println("клик по второй дате");

		WebElement search = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button/span[1]"));
		search.click();
		System.out.println("Клик по кнопке поиска");

		WebElement groupAdults = driver.findElement(By.id("group_adults"));
		Select groupAdultsSelect = new Select(groupAdults);
		groupAdultsSelect.selectByIndex(3);
		System.out.println("4 взрослых");

		WebElement rooms = driver.findElement(By.id("no_rooms"));
		Select roomsSelect = new Select(rooms);
		roomsSelect.selectByIndex(1);
		System.out.println("две комнаты");

		WebElement groupChildren = driver.findElement(By.id("group_children"));
		Select groupChildrenSelect = new Select(groupChildren);
		groupChildrenSelect.selectByIndex(0);
		System.out.println("без детей");

		WebElement find = driver.findElement(By.xpath("//button[@class=\"sb-searchbox__button  \"]"));
		find.click();
		System.out.println("Клик по кнопке поиска");

		WebElement cheapFilter = driver.findElement(By.xpath("//li[@class=\" sort_category   sort_price \"]"));
		cheapFilter.click();
		System.out.println("Клик по сортировке от дешевых");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Подождали");

		WebElement expFilter = driver.findElement(By.xpath("//a[@data-id=\"pri-5\"]"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", expFilter);
		System.out.println("Проскролили");

		int minHighPrice = Integer.parseInt(expFilter.getText().replaceAll("[\\D]", ""));

		System.out.println("ценовой порог: " + minHighPrice);

		expFilter.click();
		System.out.println("Высокая стоимость");

		WebElement manyMoney = driver.findElement(
				By.xpath("//*[@id=\\\"hotellist_inner\\\"]/div[1]/div[2]/div[2]/div/table/tbody/tr/td[2]/div/strong"));
		System.out.println("Стоимость: " + manyMoney.getText());
		int moreThanManyMoney = Integer.parseInt(manyMoney.getText().replaceAll("[\\D]", ""));

		AssertJUnit.assertTrue(moreThanManyMoney >= minHighPrice);

		driver.close();
		driver.quit();

	}

	@Test
	public void Booking() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com");
		WebElement searchField = driver.findElement(By.xpath("//*[@id=\"ss\"]"));
		searchField.clear();
		searchField.sendKeys("Париж");
		System.out.println("Ввести 'Париж'");

		WebElement dropdownDate = driver.findElement(By.xpath(
				"		//span[@class=\"sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb\"][1]\n"
						+ ""));

		dropdownDate.click();
		System.out.println("клик по дропу с датами");

		WebElement firstDate = driver.findElement(By.xpath("//td[@data-date=\"2019-03-03\"]"));
		firstDate.click();
		System.out.println("клик по первой дате");

		WebElement seconfDate = driver.findElement(By.xpath("//td[@data-date=\"2019-03-10\"]"));
		seconfDate.click();
		System.out.println("клик по второй дате");

		WebElement search = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button/span[1]"));
		search.click();
		System.out.println("Клик по кнопке поиска");

		WebElement groupAdults = driver.findElement(By.id("group_adults"));
		Select groupAdultsSelect = new Select(groupAdults);
		groupAdultsSelect.selectByIndex(3);
		System.out.println("4 взрослых");

		WebElement rooms = driver.findElement(By.id("no_rooms"));
		Select roomsSelect = new Select(rooms);
		roomsSelect.selectByIndex(1);
		System.out.println("две комнаты");

		WebElement groupChildren = driver.findElement(By.id("group_children"));
		Select groupChildrenSelect = new Select(groupChildren);
		groupChildrenSelect.selectByIndex(0);
		System.out.println("без детей");

		WebElement find = driver.findElement(By.xpath("//button[@class=\"sb-searchbox__button  \"]"));
		find.click();
		System.out.println("Клик по кнопке поиска");

		WebElement cheapFilter = driver.findElement(By.xpath("//li[@class=\" sort_category   sort_price \"]"));
		cheapFilter.click();
		System.out.println("Клик по сортировке от дешевых");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Подождали");

		WebElement expFilter = driver.findElement(By.xpath("//a[@data-id=\"pri-5\"]"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", expFilter);
		System.out.println("Проскролили");

		expFilter.click();
		System.out.println("Высокая стоимость");

		WebElement hotelButton = driver.findElement(By.xpath("//div[@class=\"sr-cta-button-row\"][1]"));
		jse.executeScript("arguments[0].scrollIntoView()", hotelButton);
		System.out.println("Проскролили до кнопки отеля");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Поспали");

		WebElement hotelButtonTwo = driver.findElement(By.xpath("//div[@class=\"sr-cta-button-row\"][1]/div/div/a[1]"));
		hotelButtonTwo.click();
		System.out.println("Тапнули по кнопке");

		System.out.println(driver.getCurrentUrl());
		Set<String> windows = driver.getWindowHandles();
		for (String winHandle : windows) {
			driver.switchTo().window(winHandle);
		}
		System.out.println("новая стр");
		System.out.println(driver.getCurrentUrl());

		WebElement booking = driver
				.findElement(By.xpath("//div[@id='wrap-hotelpage-top']//button[@id='hp_book_now_button']"));
		booking.click();
		System.out.println("Тапнули по забронировать");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Опять спать");

		WebElement numberHuman = driver.findElement(By.xpath("//select[@class=\"hprt-nos-select\"][1]"));
		Select numberSelect = new Select(numberHuman);
		numberSelect.selectByIndex(1);
		System.out.println("Выбрали кол-во людей");

		WebElement bookingExactly = driver.findElement(By.xpath("//div[@class=\"hprt-reservation-cta\"]/button"));
		bookingExactly.click();
		System.out.println("Тапнули по забронировать под скролом");

		WebElement travelByJob = driver.findElement(By.xpath("//label[@for=\"bp_travel_purpose_business\"]"));
		travelByJob.click();
		System.out.println("Тапнули по путешевствую по работе");

		WebElement sex = driver.findElement(By.xpath("//select[@class=\"bp_input_select bp_form__field__input\"]"));
		Select sexSelect = new Select(sex);
		sexSelect.selectByIndex(1);
		System.out.println("г-н");

		WebElement nameField = driver.findElement(By.xpath("//input[@type=\"text\"][1]"));
		nameField.clear();
		nameField.sendKeys("Maksim");
		System.out.println("Ввести 'maksim'");

		WebElement surnameField = driver.findElement(By.xpath("//input[@id=\"lastname\"]"));
		surnameField.clear();
		surnameField.sendKeys("kat");
		System.out.println("Ввести 'kat'");

		WebElement emailField = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		jse.executeScript("arguments[0].scrollIntoView()", emailField);
		System.out.println("Проскролили до поля емэила");
		emailField.clear();
		emailField.sendKeys("max_kacer@mail.ru");
		System.out.println("Ввести 'max_kacer@mail.ru'");

		WebElement emailConfirmField = driver.findElement(By.xpath("//input[@id=\"email_confirm\"]"));
		emailConfirmField.clear();
		emailConfirmField.sendKeys("max_kacer@mail.ru");
		System.out.println("Ввести 'max_kacer@mail.ru'");

		WebElement whoGuest = driver.findElement(By.xpath("//input[@id=\"notstayer_false\"]"));
		whoGuest.click();
		System.out.println("я гость");

		WebElement numberOfGuests = driver.findElement(
				By.xpath("//select[@class=\"ClickTaleSensitive bp_bs2_guest_dropdown bp_input_select notranslate\"]"));
		jse.executeScript("arguments[0].scrollIntoView()", numberOfGuests);
		System.out.println("Проскролили до селекта гостей");
		Select guestSelect = new Select(numberOfGuests);
		guestSelect.selectByIndex(0);
		System.out.println("Выбрали кол-вао гостей");

		WebElement nameSurnameGuest = driver.findElement(By.xpath("//input[@size=\"22\"][1]"));
		nameSurnameGuest.clear();
		nameSurnameGuest.sendKeys("maksim kat");
		System.out.println("Ввести 'maksim kat'");

		WebElement submitButton = driver.findElement(By.xpath("//button[@type=\"submit\"][1]"));
		jse.executeScript("arguments[0].scrollIntoView()", submitButton);
		System.out.println("Проскролили до кнопки подтвердить");
		submitButton.click();
		System.out.println("клик по подтвердить");

		WebElement phone = driver.findElement(By.xpath("//input[@id=\"phone\"]"));
		phone.clear();
		phone.sendKeys("375333911111");
		System.out.println("Ввести '375333911111'");

		WebElement cc = driver.findElement(By.xpath("//select[@id=\"cc_type\"]"));
		jse.executeScript("arguments[0].scrollIntoView()", cc);
		System.out.println("Проскролили до кредитки");
		Select ccSelect = new Select(cc);
		ccSelect.selectByIndex(2);
		System.out.println("Выбрали тип сс");

		WebElement ccNumber = driver.findElement(By.xpath("//input[@name=\"cc_number\"]"));
		ccNumber.clear();
		ccNumber.sendKeys("4242 4242 4242 4241");
		System.out.println("Ввести '4242 4242 4242 4241'");

		WebElement ccYear = driver.findElement(By.xpath("//select[@id=\"ccYear\"]"));
		jse.executeScript("arguments[0].scrollIntoView()", ccYear);
		System.out.println("Проскролили до кредитки");
		Select ccSelectYear = new Select(ccYear);
		ccSelectYear.selectByIndex(1);
		System.out.println("Выбрали год истечения сс");

		WebElement cvc = driver.findElement(By.xpath("//input[@name=\"cc_cvc\"]"));
		cvc.clear();
		cvc.sendKeys("851");
		System.out.println("cvc 851");

		WebElement endBook = driver
				.findElement(By.xpath("//*[@id=\"bookwrapper_cell\"]/div[4]/div[2]/button[2]/ins/span"));
		jse.executeScript("arguments[0].scrollIntoView()", endBook);
		System.out.println("Проскролили до кнопки бука");
		endBook.click();
		System.out.println("тыкнули по ней");

		WebElement error = driver.findElement(By.xpath("//a[@id=\"js--pay-form__error__anchor_all\"]"));
		System.out.println("ошибка из-за неправильно введенной карты");

		driver.close();
		driver.quit();

	}

	@BeforeMethod
	public void setUp() {

	}

	@AfterMethod
	public void afterMethod() {
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@BeforeClass
	public void beforeClass() {
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
