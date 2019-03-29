package homework;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListTab {

	@FindBy(xpath = "//*[@id=\"frm\"]/div[3]/div/div[1]/div[1]/div/div/div[2]/div[1]")
	private WebElement calendar;

	@FindBy(xpath = ".//span[text()=\"28\"][1]")
	private WebElement pickUpDate;

	@FindBy(xpath = "//*[@id=\"frm\"]/div[5]/div[2]/button/span[1]")
	private WebElement find;

	@FindBy(xpath = "//*[@class=\"sr_item_content sr_item_content_slider_wrapper \"]")
	private List<WebElement> links;

	@FindBy(xpath = "//*[@id=\"sortbar_dropdown_button\"]")
	private WebElement threeDots;

	@FindBy(xpath = "//a[contains(text(),'Оценка + кол-во отзывов')]")
	private WebElement bestrate;

	@FindBy(xpath = "//h3[1]")
	private WebElement firstLink;

	@FindBy(xpath = "//div[@class='bui-review-score__badge'][1]")
	private WebElement rateNine;

	public ListTab(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void ifCalendar() {

		if (calendar.isDisplayed()) {
		} else {
			calendar.click();
		}

	}

	public void firstLink(WebDriver driver) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(firstLink));
		Actions actions = new Actions(driver);
		actions.moveToElement(firstLink).perform();
		firstLink.click();

	}

	public void bestrate() {
		bestrate.click();
	}

	public int rateNine() {
		int moreNine = Integer.parseInt(rateNine.getText());
		return moreNine;
	}

	public void threeDotsClick() {
		threeDots.click();
	}

	public void pickUpDate() {
		pickUpDate.click();
	}

	public void find() {
		find.click();
	}

	public int ifDate() {
		return links.size();
	}

}
