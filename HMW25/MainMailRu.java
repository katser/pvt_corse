package group23.HMW25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMailRu {

	@FindBy(xpath = "//input[@id=\"mailbox:password\"]")
	private WebElement passField;

	@FindBy(xpath = "//input[@id=\"mailbox:login\"]")
	private WebElement loginField;

	@FindBy(xpath = "//input[@value=\"Войти\"]")
	private WebElement in;

	@FindBy(xpath = "//a[@id=\"mailbox:write_letter\"]/div[@class=\"i-relative i-link-deco menu__item_desc\"]")
	private WebElement newLetter;

	public MainMailRu(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterData(String login, String pass) {

		enterText(loginField, login);
		enterText(passField, pass);

	}

	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);

	}

	public void enterButton() {
		in.click();
	}

	public void newLetter() {
		newLetter.click();
	}
}
