package com.Testing_project.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

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
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_type_CO")
	private WebElementFacade newVacationRequestHolidayBtn;
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_type_CF")
	private WebElementFacade newVacationRequestVacationWithoutPaymentBtn;
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_type_CS")
	private WebElementFacade newVacationRequestSpecialVacationBtn;
	
	@FindBy(css = "option[value='CHILD_BIRTH']")
	private WebElementFacade childbirthvacation;
		
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_type_CM")
	private WebElementFacade newVacationRequestSickLeaveBtn;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_newVacationComment")
	private WebElementFacade newVacationRequestsAddCommentBtn;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_commentContent")
	private WebElementFacade newVacationRequestsCommentSpace;
	
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_saveButton")
	private WebElementFacade newVacationSaveBtn;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_withdrawnVacationRequest")
	private WebElementFacade newVacationWithdrawBtn;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_editVacationRequest")
	private WebElementFacade newVacationEditBtn;
	
	@FindBy(css="span[class='aui-panel-hd-text']")
	private WebElementFacade newVacationRequestsEditVacationTitle;
	
	@FindBy(css="#mainVacationContent > div > div.view-vacation > div.aui-column.aui-w20.vacation-actions.aui-column-first > div > div > div:nth-child(2) > div > i")
	private WebElementFacade newVacationRequestsWithdrawVacationTitle;
	
	@FindBy(css="#mainVacationContent > div > div.view-vacation > div.aui-column.aui-w70.vacation-info-column.aui-column-first > div > div.content-title")
	private WebElementFacade newVacationRequestsVacationInfoTitle;
	
	@FindBy(css = "#_evovacation_WAR_EvoVacationportlet_TabsBack")
	private WebElementFacade vacationInfoBackBtn;

	
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
	
	
	public void clickNewVacationRequestHolidayBtn(){
		newVacationRequestHolidayBtn.click();
	}
	
	public void clickNewVacationRequestVacationWithoutPaymentBtn(){
		newVacationRequestVacationWithoutPaymentBtn.click();
	}
	
	public void clickNewVacationRequestSpecialVacationBtn(){
		newVacationRequestSpecialVacationBtn.click();
	}
	
	public void chooseChildBirth() {
		childbirthvacation.click();

		 }
	
	public void clickNewVacationRequestSickLeaveBtn(){
		newVacationRequestSickLeaveBtn.click();	
	}
	
	public void clickNewVacationRequestAddComment(){
		newVacationRequestsAddCommentBtn.click();	
	}
	
	public void clickNewVacationRequestCommentSpace(){
		newVacationRequestsCommentSpace.click();	
	}
	
	public void typeComment(String comment){
		newVacationRequestsCommentSpace.sendKeys(comment);
	}	
	
	public void clickNewVacationSaveBtn(){
		newVacationSaveBtn.click();
	}
	
	public void clickNewVacationWithdrawBtn(){
		newVacationWithdrawBtn.click();
	}
	
	public void clickNewVacationEditBtn(){
		newVacationEditBtn.click();
	}
	
	public void verifyThatYourVacationWasWithdrawPage(){
		 Assert.assertTrue("You are not on the correct page!",newVacationRequestsWithdrawVacationTitle.getText().toLowerCase().contains(Constants.WITHDRAW_VACATION.toLowerCase()));
		 }
	
	
	public void verifyThatYourVacationWasEditPage(){
		 Assert.assertTrue("You are not on the correct page!",newVacationRequestsEditVacationTitle.getText().toLowerCase().contains(Constants.EDIT_VACATION.toLowerCase()));
		 }
	
	public void verifyThatYouAreOnVacationInfoPage(){
		 Assert.assertTrue("You are not on the correct page!",newVacationRequestsVacationInfoTitle.getText().toLowerCase().contains(Constants.VACATION_INFO.toLowerCase()));
		 }
	 
	
	public void clickVacationInfoBackBtn() {
		vacationInfoBackBtn.click();
	}

	
}
	
