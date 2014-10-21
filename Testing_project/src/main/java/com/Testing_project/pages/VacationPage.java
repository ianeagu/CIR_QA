package com.Testing_project.pages;

import java.util.List;

import junit.framework.Assert;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VacationPage extends PageObject {
	@SuppressWarnings("deprecation")
	public void verifyThatYouAreOnVacationPage(String navigationHeaderTitle) {
		List<WebElement> navHeaders = getDriver().findElements(
				By.cssSelector("div.content-title"));
		boolean found = false;
		for (WebElement navHeader : navHeaders) {
			if (navHeader.getText().toLowerCase()
					.equals(navigationHeaderTitle)) {
				System.out.println(navHeader.getText().toLowerCase());
				found = true;
				break;
			}
			Assert.assertTrue("You are not on vacation page!", found);
		}
	}
}
