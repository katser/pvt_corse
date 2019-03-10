package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeachTab {

	@FindBy(xpath = "//*[@id=\"ss\"]")
	private WebElement searchField;

	@FindBy(xpath = "//*[@id=\"xp__guests__toggle\"]")
	private WebElement searchButton;

	@FindBy(xpath = ".//span[text()=\"2 взрослых\"]")
	private WebElement twoOldOneBed;

	@FindBy(xpath = ".//span[text()=\"1 номер\"]")
	private WebElement oneBed;

	@FindBy(xpath = "//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button/span[1]")
	private WebElement search;

	public SeachTab(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterNewLetter(String place) {

		enterText(searchField, place);

	}

	private void enterText(WebElement element, String text) {
		searchField.clear();
		searchField.sendKeys(text);

	}

	public void searchButtonClick() {
		searchButton.click();
	}

	public boolean twoOldOneBedIs(WebDriver driver) {

		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(twoOldOneBed));
		return twoOldOneBed.isDisplayed();
	}

	public boolean oneBed(WebDriver driver) {

		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(oneBed));
		return oneBed.isDisplayed();
	}

	public void searchClick() {
		search.click();
	}

}
