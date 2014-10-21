package com.Testing_project.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class MyRequestsPage extends PageObject {
	
	//identificare buton - "New Request"
	@FindBy(css = "div[class*='carousel'] a[href*='menuItem=my-request']")
	public WebElementFacade myRequestsButton;
	
	//identificare text - "Show only future vacations"
	@FindBy(css = "label[for*='futureVacationsCheckbox']")
	public WebElementFacade futureVacationsLabel;
	
	//identificare check-box "holiday" din "Vacation Type"
	@FindBy(css = "label[for*='HOLIDAYCheckbox']")
	public WebElementFacade holidayVacationType;
	
	//identificare buton "Apply"
	@FindBy(css = "input[id='_evovacation_WAR_EvoVacationportlet_applyButton']")
	public WebElementFacade applyButton;
	
	//identifiare prim element - selectie "Vacation Type" - holiday
	@FindBy(css = "td[id='_evovacation_WAR_EvoVacationportlet_evozonVacationsSearchContainer_col-my.request.column.header.type_row-1']")
	public WebElementFacade firstFieldTypeColumn;
	
	//metoda - click buton "New Request"
	public void clickOnMyRequests() {
		myRequestsButton.click();
	}
	
	//metoda - verificare prezenta element in pagina
	public boolean labelIsPresent() {
		return futureVacationsLabel.isPresent();
	}
		
	//metoda - click checkbox "Holiday"
	public void clickOnHoliday() {
		holidayVacationType.click();
	}
	
	//metoda - click buton "Apply"
	public void clickOnApplyButton() {
		applyButton.click();
	}
		
}

