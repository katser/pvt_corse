package hmw18;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	@Test
	public void FirstTask() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://booking.com/");
		WebElement searchField = driver.findElement(By.xpath("//*[@id=\"ss\"]"));
		searchField.clear();
		searchField.sendKeys(" Москва");
		System.out.println("Ввести 'Москва'");

		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"xp__guests__toggle\"]"));
		searchButton.click();
		System.out.println("Клик по выпадающему списку");

		WebElement twoOldOneBed = driver.findElement(By.xpath(".//span[text()=\"2 взрослых\"]"));
		if (twoOldOneBed.isDisplayed()) {
			System.out.println("Выбрано 2 взрослых");

		}

		WebElement oneBed = driver.findElement(By.xpath(".//span[text()=\"1 номер\"]"));
		if (oneBed.isDisplayed()) {
			System.out.println("Выбран 1 номер");

		}

		WebElement search = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button/span[1]"));
		search.click();
		System.out.println("Клик по кнопке поиска");

		if (driver.findElement(By.xpath("//*[@id=\"frm\"]/div[3]/div/div[1]/div[1]/div/div/div[2]/div[1]"))
				.isDisplayed()) {
			System.out.println("Календарь открыт");
		} else {
			WebElement calendar = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[3]/div/div[1]/div[1]/div"));
			calendar.click();
			System.out.println("Открыли календарик");
		}

		WebElement pickUpDate = driver.findElement(By.xpath(".//span[text()=\"28\"][1]"));
		pickUpDate.click();
		System.out.println("Клик по дате 28");

		WebElement find = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[5]/div[2]/button/span[1]"));
		find.click();
		System.out.println("Клик по найти");

		List<WebElement> links = driver
				.findElements(By.xpath("//*[@class=\"sr_item_content sr_item_content_slider_wrapper \"]"));
		System.out.println("Кол-во отелей на введеные даты: " + links.size());

		driver.close();
		System.out.println("Закрыли вкладку");

	}

	@Test(dataProvider = "dp")
	public void SecondTask(String booking) {
		WebDriver driver = new ChromeDriver();
		driver.get(booking);
		System.out.println("Перешли на сайт который написали в дэйтпровайдер'");

		WebElement searchField = driver.findElement(By.xpath("//*[@id=\"ss\"]"));
		searchField.clear();
		System.out.println("Очистили поле ввода'");

		searchField.sendKeys(" Москва");
		System.out.println("Ввели 'Москва'");

		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"xp__guests__toggle\"]"));
		searchButton.click();
		System.out.println("Клик по выпадающему списку");

		WebElement twoOldOneBed = driver.findElement(By.xpath(".//span[text()=\"2 взрослых\"]"));
		if (twoOldOneBed.isDisplayed()) {
			System.out.println("Выбрано 2 взрослых");

		}

		WebElement oneBed = driver.findElement(By.xpath(".//span[text()=\"1 номер\"]"));
		if (oneBed.isDisplayed()) {
			System.out.println("Выбран 1 номер");

		}

		WebElement search = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button/span[1]"));
		search.click();
		System.out.println("Клик по кнопке поиска");

		WebElement threeDots = driver.findElement(By.xpath("//*[@id=\"sortbar_dropdown_button\"]"));
		threeDots.click();
		System.out.println("Клик по кнопке c параметрами");

		WebElement bestrate = driver.findElement(By.xpath("//a[contains(text(),'Оценка + кол-во отзывов')]"));
		bestrate.click();
		System.out.println("Клик по  сортировке по рейтингу");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement firstLink = driver.findElement(By.xpath("//h3[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(firstLink).perform();

		firstLink.click();
		System.out.println("Клик по первому варианту из выборки");

		WebElement rateNine = driver.findElement(By.xpath("//div[@class='bui-review-score__badge'][1]"));
		System.out.println("Рейтинг отеля: " + rateNine.getText());
		int moreNine = Integer.parseInt(rateNine.getText());
		AssertJUnit.assertTrue(moreNine >= 9);

		driver.close();
		System.out.println("Закрыли вкладку");
		driver.quit();
		System.out.println("Закрыли браузер");

	}

	@BeforeMethod
	public void beforeMethod() {

	}

	@AfterMethod
	public void afterMethod() {
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "http://booking.com" },

		};
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
