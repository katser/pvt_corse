package mailTest;

import mailTest.Paint;
import factories.GUIFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factories.BookingFactory;
import factories.MailRuFactory;

public class Configuration {
	@FindBy(xpath = "//input[@id=\"search:submit\"]")
	private static WebElement mailRuBtn;

	@FindBy(xpath = "//div[@data-sb-id=\"main\"]")
	private static WebElement bookBtn;

	public Configuration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private static Paint configureApplication() {
		Paint steps = null;
		GUIFactory factory;

		if (mailRuBtn.isDisplayed() == true) {
			factory = new MailRuFactory();
			steps = new Paint(factory);
		} else {

		}
		if (bookBtn.isDisplayed() == true) {
			factory = new BookingFactory();
			steps = new Paint(factory);
		} else {

		}

		return steps;
	}

	public static void main(String[] args) {
		Paint steps = configureApplication();
		steps.paint();
	}
}
