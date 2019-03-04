package homework20;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Inbox {

	@FindBy(xpath = "//a[@id=\"PH_logoutLink\"]")
	private WebElement logOut;

	@FindBy(xpath = "//div[@class=\"js-item-checkbox b-datalist__item__cbx\"][1]")
	private WebElement chooseLetter;

	@FindBy(xpath = "//div[@data-name=\"spam\"][1]")
	private WebElement spamButton;

	@FindBy(xpath = "//a[@href=\"/messages/spam/\"][1]")
	private WebElement spamTab;

	@FindBy(xpath = "//div[@class=\"notify\"]")
	private WebElement notify;

	@FindBy(xpath = "//div[@data-name=\"noSpam\"][1]")
	public WebElement notSpam;

	@FindBy(xpath = "//a[@data-name=\"compose\"][1]")
	public WebElement newLetter;

	@FindBy(xpath = "//textarea[@class=\"js-input compose__labels__input\"][1]")
	private WebElement inputMail;

	@FindBy(xpath = "//input[@class=\"b-input\"]")
	private WebElement title;

	@FindBy(xpath = "//div[@class=\"b-toolbar__item b-toolbar__item_ b-toolbar__item_false\"][1]")
	private WebElement sendButton;

	@FindBy(xpath = "//div[@class=\"is-compose-empty_in\"]//button[@class=\"btn btn_stylish btn_main confirm-ok\"]")
	private WebElement confirmPopup;

	@FindBy(xpath = "//div[@class=\"message-sent__title\"]")
	private WebElement messageSendConfirm;

	@FindBy(xpath = "//div[@class='b-datalist__body']//div[2]//div[1]//a[1]//div[1]//div[1]//div[1]")
	private WebElement chooseLetterTwo;

	@FindBy(xpath = "//div[@class='b-layout b-layout_main']//div[3]//div[1]//a[1]//div[1]//div[1]//div[1]")
	private WebElement chooseLetterThree;

	@FindBy(xpath = "//div[@data-shortcut=\".: 'true', q: 'read', u: 'unread', i: 'flag_toggle', shift+c: 'addressbook', shift+l:'create_filter', shift+s: 'search' \"][1]")
	private WebElement moreDrop;

	@FindBy(xpath = "//div[@class=\"b-dropdown b-dropdown_more b-dropdown_adaptive b-dropdown_right b-dropdown_false b-dropdown_grouped b-dropdown_grouped_last b-dropdown_expanded\"]//a[@data-num=\"3\"]")
	private WebElement flagDrop;

	@FindBy(xpath = "//div[@class=\"js-hover b-flag b-flag_yes b-flag_onhover\"]")
	private WebElement flag;

	@FindBy(xpath = "//body[@class='compose__beautiful GlobalOnlineMode layout-fixed g-default-font g-macintosh-font']/div[@class='msglist-wrapper']/div[@class='msglist-wrapper__inner']/div[@class='theme minwidth']/div[@class='theme__left']/div[@class='theme__right']/div[@class='theme__top']/div[@class='theme__bottom']/div[@class='theme__left-center']/div[@class='theme__right-center']/div[@class='theme__top-center']/div[@class='theme__bottom-center']/div[@class='theme__center']/div[@class='theme__top-left']/div[@class='theme__top-right']/div[@class='theme__bottom-left']/div[@class='theme__bottom-right']/div[@class='threads-enabled']/div[@class='b-layout b-layout_main']/div[@class='b-layout__col b-layout__col_2_2']/div/div[@class='b-datalists']/div[@data-cache-key='0_undefined_false']/div[@class='b-datalist b-datalist_letters b-datalist_letters_from']/div[@class='b-datalist__body']/div[2]/div[1]/a[1]/div[3]/div[1]")
	private WebElement flagTwo;

	@FindBy(xpath = "//body/div[@class='msglist-wrapper']/div[@class='msglist-wrapper__inner']/div[@class='theme minwidth']/div[@class='theme__left']/div[@class='theme__right']/div[@class='theme__top']/div[@class='theme__bottom']/div[@class='theme__left-center']/div[@class='theme__right-center']/div[@class='theme__top-center']/div[@class='theme__bottom-center']/div[@class='theme__center']/div[@class='theme__top-left']/div[@class='theme__top-right']/div[@class='theme__bottom-left']/div[@class='theme__bottom-right']/div[@class='threads-enabled']/div[@class='b-layout b-layout_main']/div[@class='b-layout__col b-layout__col_2_2']/div/div[@class='b-datalists']/div[@data-cache-key='0_undefined_false']/div[@class='b-datalist b-datalist_letters b-datalist_letters_from']/div[@class='b-datalist__body']/div[3]/div[1]/a[1]/div[3]/div[1]")
	private WebElement flagThree;

	@FindBy(xpath = "//div[@class=\"b-toolbar__item b-toolbar__item_selectAll\"]/div/div/div/div[1]")
	private WebElement pickAll;

	@FindBy(xpath = "//div[@class=\"b-dropdown b-dropdown_more b-dropdown_adaptive b-dropdown_right b-dropdown_false b-dropdown_grouped b-dropdown_grouped_last b-dropdown_expanded\"]//a[@data-num=\"4\"]")
	private WebElement dropFlag;

	public Inbox(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean Logout(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(logOut));
		return logOut.isDisplayed();
	}

	public void SkipFlag() {
		dropFlag.click();
	}

	public void pickAll() {
		pickAll.click();
	}

	public void chooseLetterClick() {
		chooseLetter.click();
	}

	public void chooseThreeLettersClick() {
		chooseLetter.click();
		chooseLetterTwo.click();
		chooseLetterThree.click();
	}

	public void spamButtonClick() {
		spamButton.click();
	}

	public void spamTabClick() {
		spamTab.click();
	}

	public boolean notify(WebDriver driver) {

		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(notify));
		return notify.isDisplayed();
	}

	public boolean ifFirstFlag(WebDriver driver) {

		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(flag));
		return flag.isDisplayed();
	}

	public boolean isFirstFlagNot(WebDriver driver) {

		if (flag.isDisplayed()) {
			return false;
		}
		return true;
	}

	public boolean ifSecondFlag(WebDriver driver) {

		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(flagTwo));
		return flagTwo.isDisplayed();
	}

	public boolean ifThirdFlag(WebDriver driver) {

		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(flagThree));
		return flagThree.isDisplayed();
	}

	public void notSpamTabClick() {
		notSpam.click();
	}

	public void newLetter() {
		newLetter.click();
	}

	public void moreDrop() {
		moreDrop.click();
	}

	public void moreDropFlag() {
		flagDrop.click();
	}

	public void enterNewLetter(String mail, String ttle) {

		enterText(inputMail, mail);
		enterText(title, ttle);

	}

	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);

	}

	public void sendButtonClick() {
		sendButton.click();
	}

	public void confirmPopupButton() {
		confirmPopup.click();
	}

	public boolean messageSendConfirm(WebDriver driver) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(messageSendConfirm));
		return messageSendConfirm.isDisplayed();
	}

}
