package com.Testing_project.steps;

import java.util.List;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;

import com.Testing_project.pages.MainMenuPage;
import com.Testing_project.pages.MyRequestsPage;

public class MyRequestsSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MainMenuPage homePage;
	MyRequestsPage myRequestsPage;

	//click - pe "Vacation"
	@Step
	public void clickVacationTab() {
		homePage.clickVacationTab();
	}
	
	//click - pe "My requests"
	@Step
	public void clickMyReqButton() {
		myRequestsPage.clickOnMyRequests();
	}
	
	//verificare element pe pagina
	@Step
	public void label_ShouldbeDisplayed(boolean expected) {
		Assert.assertEquals(expected, myRequestsPage.labelIsPresent());
		
	}
	
	//check -> "VACATION TYPE"
	//check -> checkbox "Holiday"
	@Step
	public void checkHoliday() {
		myRequestsPage.clickOnHoliday();
	}
	
	//check -> checkbox "Vacation Without Payment"
	@Step
	public void checkVacationWithoutPay() {
		myRequestsPage.clickOnVacationWithOutPay();
	}
	
	//check -> checkbox "Special Vacation"
	@Step
	public void checkSpecialVacation() {
		myRequestsPage.clickOnSpecialVacation();
	}
	
	//check -> checkbox "Sick Leave"
	@Step
	public void checkSickLeave() {
		myRequestsPage.clickOnSickLeave();
	}
	
	//check -> checkbox "All"
	@Step
	public void checkAll() {
		myRequestsPage.clickOnAll();
	}
	
	//----------------------------------------------------------------------------------------
	//check -> "VACATION STATUS"
	//check -> checkbox "Rejected"
	@Step
	public void checkRejected() {
		myRequestsPage.clickOnRejected();
	}
	
	//check -> checkbox "Pending"
	@Step
	public void checkPending() {
		myRequestsPage.clickOnPending();
	}
	
	
	//check -> "DAYS NUMBER"
	//check -> checkbox "1-5"
	@Step
	public void checkDaysNumber15() {
		myRequestsPage.clickOnDaysNr15();
	}
	
	
	//click -> buton "Apply"
	@Step
	public void clickApply() {
		myRequestsPage.clickOnApplyButton();
	}
	
	//metoda pentru selectia unei "Vacation Type"
	public void selectVacationType(String typeVacation)
	{
//		int type=5;
//		String selectTypeVacation;
		if (typeVacation.contentEquals("All"))
			checkAll();
		else if (typeVacation.contentEquals("Holiday"))
			checkHoliday();
		else if (typeVacation.contentEquals("Vacation Without Payment"))
			checkVacationWithoutPay();
		else if (typeVacation.contentEquals("Special Vacation"))
			checkSpecialVacation();
		else if (typeVacation.contentEquals("Sick Leave"))
			checkSickLeave();					
	}
	
	//metoda pentru verificarea coloanei "Type"=vacation din tabel
	//in variabila vacationTypeList_1 ->punem lista extrasa din tabel. Verificam sa nu contina alte valori decat "Holiday"
	@Step
	public void checkVacationTypeDoesNotContain(String vacationTypeNotWanted){
	  List<String> vacationTypeList_1 = myRequestsPage.returnVacationTypeList();
	  Assert.assertFalse("Vacation type contains element that should not be there after filter!!!", vacationTypeList_1.contains(vacationTypeNotWanted));
	 }
	
	//metoda pentru verificarea coloanei "Vacation Status"=rejected din tabel
	//in variabila vacationStatusList_1 ->punem lista extrasa din tabel. Verificam sa nu contina alte valori decat "Rejected"
	@Step
	public void checkVacationStatusDoesNotContain(String vacationStatusNotWanted){
		List<String> vacationStatusList_1 = myRequestsPage.returnVacationStatusList();
		Assert.assertFalse("Vacation status contains elements that should not be there after filter!!!", vacationStatusList_1.contains(vacationStatusNotWanted));
	}
	
	//metoda pentru verificarea coloanei "Days Number"=1-5 din tabel
	//in variabila daysNumberList_1 ->punem lista extrasa din tabel. Verificam sa nu contina alte valori decat cele din intervalul 1-5
	@Step
	 public void checkDaysNumberDoesNotContain(int min , int max){
	  List<Integer> daysNumberList_1 = myRequestsPage.returnDaysNumberList();
	  System.out.println(daysNumberList_1.size());
	  for(Integer day:daysNumberList_1){
	   System.out.println(String.valueOf(day));
	  
	  // Assert.assertTrue("Nooooooooooooo!!!", day >= min && day <= max  );
	   Assert.assertTrue("Nooooooooooooo!!!", (day.compareTo(min) > 0 ||day.compareTo(min) == 0) && (day.compareTo(max) < 0 || day.compareTo(max) == 0)) ; 
	   
	  }
	}
	    
} 
		

