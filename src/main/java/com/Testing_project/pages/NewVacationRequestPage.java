package com.Testing_project.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Testing_project.utilities.Constants;

public class NewVacationRequestPage extends PageObject {

	@FindBy(css = "div[class='aui-column-content aui-column-content-first '] div:nth-child(1) ul li:nth-child(2) a")
	private WebElementFacade newVacationRequestBtn;

	@FindBy(css = "h1[class='header-title'] span")
	private WebElementFacade createVacationTitle;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_TabsBack")
	private WebElementFacade newVacationBackBtn;

	@FindBy(css = "content-title")
	private WebElementFacade myRequestsTitle;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_startDate")
	private WebElementFacade startDateBox;

	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_endDate")
	private WebElementFacade endDateBox;

	@FindBy(css = "div[style*='block'] td.dp_caption")
	private WebElementFacade calendarTitle;

	@FindBy(css = "div[style*='block'] td.dp_next")
	private WebElementFacade nextButton;

	@FindBy(css = "div[style*='block'] td.dp_previous")
	private WebElementFacade previousButton;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_type_CM")
	private WebElementFacade newVacationSickLeaveBtn;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_saveButton")
	private WebElementFacade newVacationSaveBtn;

	public void clickNewVacationRequest() {
		newVacationRequestBtn.click();

	}

	public void verifyThatYouAreOnCreateNewVacationRequestPage() {
		Assert.assertTrue("You are not on the correct page!",createVacationTitle.getText().toLowerCase().contains(Constants.CREATE_NEW_VACATION_REQUEST.toLowerCase()));

	}

	
	public void clickStartDateBox() {
		startDateBox.click();
	}

	public void clickEndDateBox() {
		endDateBox.click();
	}

	public void setDate(int month, int day, int year) throws ParseException {

		Calendar calNew = Calendar.getInstance();
		SimpleDateFormat sdfNew = new SimpleDateFormat("dd/MM/yyyy");
		calNew.setTime(sdfNew.parse("1/" + String.valueOf(month) + "/"
				+ String.valueOf(year)));

		Calendar cal = Calendar.getInstance();
		do {
			element(calendarTitle).waitUntilVisible();
			String MandY = calendarTitle.getText();
			MandY = MandY.replace(",", "");
			SimpleDateFormat sdf = new SimpleDateFormat("MMM yyyy dd");
			System.out.println(MandY + " 1");
			cal.setTime(sdf.parse(MandY + " 1"));

			if (cal.compareTo(calNew) == -1) {
				nextButton.click();
			}
			if (cal.compareTo(calNew) == 1) {
				previousButton.click();
			}
		} while (cal.compareTo(calNew) != 0);

		List<WebElement> days = getDriver().findElements( // By.cssSelector("div[aria-hidden='false'] .aui-calendar-day.aui-calendar-day-month.aui-state-default"));
				By.cssSelector("div[style*='block'] td"));
		for (WebElement currentDay : days) {
			if (currentDay.getText().toLowerCase()
					.contains(String.valueOf(day).toLowerCase()))
				currentDay.click();
		}

	}
	
	public void clickNewVacationSickLeaveBtn(){
		newVacationSickLeaveBtn.click();
	}
	
	public void clickNewVacationSaveBtn(){
		newVacationSaveBtn.click();
	}
	
//	public void clickNewVacationBackBtn() {
//		newVacationBackBtn.click();
//	}
//
//
//	 public void verifyThatYouAreOnMyRequestsPage(){
//	 Assert.assertTrue("You are not on the correct page!",myRequestsTitle.getText().toLowerCase().contains(Constants.MY_REQUESTS.toLowerCase()));
//	
//	 }

	
}