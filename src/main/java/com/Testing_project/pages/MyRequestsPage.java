package com.Testing_project.pages;

import java.util.ArrayList;
import java.util.List;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyRequestsPage extends PageObject {
	
	//identificare buton - "New Request"
	@FindBy(css = "div[class*='carousel'] a[href*='menuItem=my-request']")
	public WebElementFacade myRequestsButton;
	
	//identificare text - "Show only future vacations"
	@FindBy(css = "label[for*='futureVacationsCheckbox']")
	public WebElementFacade futureVacationsLabel;
	
	//-------------------------------------------------------------------------------------------------------------------------
	//checkbox-uri VACATION TYPE
	//identificare check-box "holiday" din "Vacation Type"
	@FindBy(css = "label[for*='HOLIDAYCheckbox']")
	public WebElementFacade holidayVacationType;
	
	//identificare element - selectie "Vacation Type" - vacation without payment
	@FindBy(css = "label[for*='PAYMENTCheckbox']")
	public WebElementFacade vacationWithoutPayVacationType;
	
	//identificare element - selectie "Vacation Type" - special vacation
	@FindBy(css = "label[for*='SPECIAL_VACATIONCheckbox']")
	public WebElementFacade specialVacVacationType;
	
	//identificare element - selectie "Vacation Type" - sick leave
	@FindBy(css = "label[for*='SICK_LEAVECheckbox']")
	public WebElementFacade sickLeaveVacationType;
	
	//identificare element - selectie "Vacation Type" - ALL
	@FindBy(css = "label[for*=vacationTypeALLCheckbox]")
	public WebElementFacade allVacationType;
	
	
	//---------------------------------------------------------------------------------------------------------------------------------
	//identificare buton "Apply"
	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_applyButton']")
	public WebElementFacade applyButton;
	
	//-------------------------------------------------------------------------------------------------------------------------
	//identificare element - selectie "Vacation Type" - holiday
	@FindBy(css = "td[id='_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainer_col-my.request.column.header.type_row-1']")
	public WebElementFacade firstFieldTypeColumn;
	
	//checkbox-uri VACATION STATUS
	//identifiare element - selectie "Vacation Status" - rejected
	@FindBy(css = "label[for*='REJECTEDCheckbox']")
	public WebElementFacade vacationStatusRejected;
	
	//identificare element - selectie "Vacation Status" - PENDING
	@FindBy(css = "label[for*='PENDINGCheckbox']")
	public WebElementFacade vacationStatusPending;
	
	//checkbox-uri DAYS NUMBER
	//identifiare element - selectie "Days Number" ->1-5
	@FindBy(css = "label[for*='FIFTHCheckbox']")
	public WebElementFacade daysNumber15;
	
	//identificare ELEMENT TABEL
	@FindBy(css ="td[id='_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainer_col-my.request.column.header.type_row-1'] a")
	public WebElementFacade tableTypeFirstElement;
	
	
	public void clickOnMyRequests() {
		myRequestsButton.click();
	}
	
	//metoda - verificare prezenta element in pagina
	public boolean labelIsPresent() {
		return futureVacationsLabel.isPresent();
	}
	

	//metode pentru checkbox-uri "Vacation Type"
	//metoda - click checkbox "Holiday"
	public void clickOnHoliday() {
		holidayVacationType.click();
	}
	
	//metoda - click checkbox "Vacation Without Payment"
	public void clickOnVacationWithOutPay() {
		vacationWithoutPayVacationType.click();
	}
	
	//metoda - click checkbox "Special Vacation"
	public void clickOnSpecialVacation() {
		specialVacVacationType.click();
	}
	
	//metoda - click checkbox "Sick Leave"
	public void clickOnSickLeave() {
		sickLeaveVacationType.click();
	}
	
	//metoda - click checkbox "ALL"
	public void clickOnAll() {
		allVacationType.click();
	}
	
	
	//metode pentru checkbox-uri "Vacation Status"
	//metoda - click checkbox "Rejected"
	public void clickOnRejected() {
		vacationStatusRejected.click();
	}
	
	//metode - click checkbox "Pending"
	public void clickOnPending() {
		vacationStatusPending.click();
	}
	
	
	//metode pentru checkbox-uri "Days Number"
	//metoda - click checkbox "1-5"
	public void clickOnDaysNr15() {
		daysNumber15.click();
	}
	
	
	//metoda - click first element in column "Type" of the table
	public void clickOnTypeColumnFirstElement() {
		tableTypeFirstElement.click();
		System.out.println("Click is performed!");
	}
	
	//metoda - click buton "Apply"
	public void clickOnApplyButton() {
		applyButton.click();
	}
	
	//metoda pentru obtinerea unei liste de valori (de tip String) - extragere coloana "Type" cu elem. de tip string (holiday)
	public List<String> returnVacationTypeList(){
		 List<WebElement> vacationTypeList = getDriver().findElements(By.cssSelector("td[class*='header.type'] a"));
		 List<String> vacationTypeStrList = new ArrayList<String>();
		 for (WebElement i : vacationTypeList){
		   vacationTypeStrList.add(i.getText());
		  }
		  return vacationTypeStrList;
	}
	
	//metoda pentru obtinerea unei liste de valori (de tip String)- extragere coloana "Status" cu elem. de tip string (rejected)
	public List<String> returnVacationStatusList(){
			List<WebElement> vacationStatusList = getDriver().findElements(By.cssSelector("td[class*='header.status'] a"));
			List<String> vacationStatusStrList = new ArrayList<String>();
			for (WebElement i : vacationStatusList){
				 vacationStatusStrList.add(i.getText());
			 }
			 return vacationStatusStrList;
	}
	
	//metoda pentru obtinerea unei liste de valori (de tip intreg)- extragere coloana "Days Number" cu elem. de tip intreg (1-5)
	public List<Integer> returnDaysNumberList(){
			List<WebElement> vacationDaysNrList = getDriver().findElements(By.cssSelector("td[class*='header.day.number'] a"));
			List<Integer> vacationDaysStrList = new ArrayList<Integer>();
			for (WebElement i : vacationDaysNrList){
				vacationDaysStrList.add(Integer.parseInt(i.getText()));
			}
			return vacationDaysStrList;
	}
		
}

