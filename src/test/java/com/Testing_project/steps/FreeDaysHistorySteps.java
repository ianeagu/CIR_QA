package com.Testing_project.steps;

import java.util.List;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.Testing_project.pages.FreeDaysHistoryPage;

public class FreeDaysHistorySteps extends ScenarioSteps {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	FreeDaysHistoryPage freeDaysHistoryPage;

	@Step
	public void clickFreeDaysHistory() {
		freeDaysHistoryPage.clickFreeDaysHistory();
	}

	@Step
	public void selectVacationDaysType() {
		freeDaysHistoryPage.clickvacationDaysCheckBox();
	}

	@Step
	public void selectOneToFiveDaysNumber() {
		freeDaysHistoryPage.clickOneFiveCheckBox();

	}

	@Step
	public void selectAddedDaysOperation() {
		freeDaysHistoryPage.clickAddedDaysCheckBox();
	}

	@Step
	public void clickApplyBtn() {
		freeDaysHistoryPage.clickApplyBtn();
	}

	@Step
	public void checkTypeDoesNotContain(String operationTypeNotWanted) {
		List<String> TypeStrList = freeDaysHistoryPage
				.returnFreeDaysHistoryType();
		Assert.assertFalse(
				"Type column contains element that should not be there after filter!!!",
				TypeStrList.contains(operationTypeNotWanted));
	}

	@Step
	public void checkOperationDoesNotContain(String operationTypeNotWanted) {
		List<String> OperationStrList = freeDaysHistoryPage
				.returnFreeDaysHistoryOperation();
		Assert.assertFalse(
				"Operation column contains element that should not be there after filter!!!",
				OperationStrList.contains(operationTypeNotWanted));
	}

//	@Step
//	public void checkDaysDoesNotContain(Integer operationTypeNotWanted) {
//		List<Integer> NumberIntList = freeDaysHistoryPage
//				.returnFreeDaysHistoryNumber();
//		Assert.assertFalse(
//				"Number column contains element that should not be there after filter!!!",
//				NumberIntList.contains(operationTypeNotWanted));
//	}

	@Step
	public void checkDaysNotContain(int min, int max) {
		boolean var = true;
		List<Integer> numberList = freeDaysHistoryPage
				.returnFreeDaysHistoryNumber();
		for (int i = 1; i < numberList.size(); i++){
			if ((i <= min) && (i >= max))
				var = false;
		}
		Assert.assertFalse( "Number column contains element that should not be there after filter!!!", var);
	}

	/*
	 * @Step public void checkVacationDaysNumberNotContain(int min , int max){
	 * List<Integer> daysNumberList = myrequestspage.returnDaysNumberList();
	 * System.out.println(daysNumberList.size()); for(Integer
	 * day:daysNumberList){ System.out.println(String.valueOf(day));
	 * 
	 * // Assert.assertTrue("Nooooooooooooo!!!", day >= min && day <= max );
	 * Assert.assertTrue("Nooooooooooooo!!!", (day.compareTo(min) > 0
	 * ||day.compareTo(min) == 0) && (day.compareTo(max) < 0 ||
	 * day.compareTo(max) == 0)) ;
	 * 
	 * }
	 */

}
