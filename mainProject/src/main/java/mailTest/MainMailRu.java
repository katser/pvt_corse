package mailTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainMailRu {

	@FindBy(xpath = "//input[@id=\"mailbox:password\"]")
	private WebElement passField;

	@FindBy(xpath = "//input[@id=\"mailbox:login\"]")
	private WebElement loginField;

	@FindBy(xpath = "//input[@value=\"Войти\"]")
	private WebElement in;

	@FindBy(xpath = "//a[@id=\"mailbox:write_letter\"]/div[@class=\"i-relative i-link-deco menu__item_desc\"]")
	private WebElement newLetter;

	@FindBy(xpath = "//input[@class=\"input search__input i-no-right-radius\"]")
	private WebElement inputSearch;

	@FindBy(xpath = "//input[@class=\"btn btn_orange search__btn i-no-left-radius\"]")
	private WebElement SearchBtn;

	@FindBy(xpath = "//a[@href=\"http://www.google.ru/\"]")
	private WebElement google;

	public MainMailRu(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterData(String login, String pass) {

		enterText(loginField, login);
		enterText(passField, pass);

	}

	public void enterSearchData(String text) {

		enterText(inputSearch, text);

	}

	public boolean ifGoogleHere(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(google));
		return google.isDisplayed();
	}

	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);

	}

	public void enterButton() {
		in.click();
	}

	public boolean ifInDisplayed(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(loginField));
		return loginField.isDisplayed();
	}

	public void newLetter() {
		newLetter.click();
	}

	public void btnClick() {
		SearchBtn.click();
	}
}
