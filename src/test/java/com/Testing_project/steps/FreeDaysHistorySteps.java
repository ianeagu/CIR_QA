package com.Testing_project.steps;

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

}
