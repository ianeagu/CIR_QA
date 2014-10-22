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
	public void checkOperationDoesNotContain(String operationTypeNotWanted){
	  List<String> OperationStrList = freeDaysHistoryPage.returnFreeDaysHistory();
	  Assert.assertFalse("Operation column contains element that should not be there after filter!!!", OperationStrList.contains(operationTypeNotWanted));
	}

}
