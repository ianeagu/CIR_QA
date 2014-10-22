package com.Testing_project.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class FreeDaysHistoryPage extends PageObject {

	@FindBy(css = "div[class='aui-column-content aui-column-content-first '] div:nth-child(1) ul li:nth-child(5) a")
	private WebElementFacade freeDaysHistory;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_COCheckbox")
	private WebElementFacade vacationDaysCheckBox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_FIFTHCheckbox")
	private WebElementFacade oneFiveCheckBox;

	@FindBy(id = "_evovacation_WAR_EvoVacationportlet_ADDED_DAYSCheckbox")
	private WebElementFacade addedDaysCheckBox;

	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_applyButton'] ")
	private WebElementFacade applyBtn;

	public void clickFreeDaysHistory() {
		freeDaysHistory.click();

	}

	public void clickvacationDaysCheckBox() {
		vacationDaysCheckBox.click();

	}

	public void clickOneFiveCheckBox() {
		oneFiveCheckBox.click();

	}

	public void clickAddedDaysCheckBox() {
		addedDaysCheckBox.click();

	}

	public void clickApplyBtn() {
		applyBtn.click();

	}

	public List<String> returnFreeDaysHistoryType() {
		List<WebElement> TypeList = getDriver().findElements(
				By.cssSelector("td[class*='header.type']"));
		List<String> TypeStrList = new ArrayList<String>();
		for (WebElement i : TypeList) {
			TypeStrList.add(i.getText());
		}
		return TypeStrList;
	}

	public List<String> returnFreeDaysHistoryOperation() {
		List<WebElement> OperationList = getDriver().findElements(
				By.cssSelector("td[class*='header.operation']"));
		List<String> OperationStrList = new ArrayList<String>();
		for (WebElement i : OperationList) {
			OperationStrList.add(i.getText());
		}
		return OperationStrList;
	}

	public List<Integer> returnFreeDaysHistoryNumber() {
		List<WebElement> NumberList = getDriver().findElements(
				By.cssSelector("td[class*='header.number']"));
		List<Integer> NumberIntList = new ArrayList<Integer>();
		for (WebElement i : NumberList) {
			NumberIntList.add(Integer.parseInt(i.getText()));
		}
		return NumberIntList;
	}
	
	
	

}
