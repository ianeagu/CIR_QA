package com.Testing_project.pages;

import java.util.List;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import tools.StringUtils;

import com.Testing_project.utilities.Constants;

public class ViewVacationsPage extends PageObject {

	@FindBy(css = "#p_p_id_evovacation_WAR_EvoVacationportlet_ > div > div > div > div > div > div.aui-column.aui-w25.aui-column-first > div > div:nth-child(3) > ul > li:nth-child(4) > a")
	private WebElementFacade viewVacationsBtn;

	@FindBy(css = "div[class='content-title']")
	private WebElementFacade viewVacationsTitle;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applyBtn;
	
	@FindBy(css="div[class='page-links']")
	private WebElementFacade pagesContainer;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_viewVacationsLastName")
	private WebElementFacade viewVacationsLastName;
	
	@FindBy(css="#_evovacation_WAR_EvoVacationportlet_viewVacationsFirstName")
	private WebElementFacade viewVacationsFirstName;
				
	public void clickViewVacationsBtn() {
		viewVacationsBtn.click();

	}

	public void verifyThatYouAreOnViewVacationsPage() {
		Assert.assertTrue("You are not on the correct page!",viewVacationsTitle.getText().toLowerCase().contains(Constants.VIEW_VACATIONS.toLowerCase()));

	}

	
	public void selectVacationType(String vacationType) {
		  boolean found = false;
		  List<WebElement> elements = getDriver()
		    .findElements(
		      By.cssSelector("div[class='aui-column-content aui-column-content-first column-three-content '] div[class='column-content'] span[class='aui-field-content']"));
		   System.out.println(elements.size());
		  for (WebElement element : elements) {
		   System.out.println(element.getText());

		   if (element.getText().toLowerCase()
		     .contains(vacationType.toLowerCase())) {
		    found = true;
		    if (!element.findElement(By.cssSelector("label")).isSelected())
		     element.findElement(By.cssSelector("label")).click();
		    break;
		   }

		  }
		  Assert.assertTrue("Vacation type was not found!", found);

		 }
	
	public void selectDaysNumber(String daysNumber) {
		  boolean found = false;
		  List<WebElement> elements = getDriver()
		    .findElements(
		      By.cssSelector("div[class='aui-column column-three column-center '] div[class='column-content'] span[class='aui-field-content']"));
		   System.out.println(elements.size());
		  for (WebElement element : elements) {
		   System.out.println(element.getText());

		   if (element.getText().toLowerCase()
		     .contains(daysNumber.toLowerCase())) {
		    found = true;
		    if (!element.findElement(By.cssSelector("label")).isSelected())
		     element.findElement(By.cssSelector("label")).click();
		    break;
		   }

		  }
		  Assert.assertTrue("Vacation type was not found!", found);

		 }
	
	public void selectVacationStatus(String vacationStatus) {
		  boolean found = false;
		  List<WebElement> elements = getDriver()
		    .findElements(
		      By.cssSelector("div[class='aui-column-content aui-column-content-last column-three-content column-center-content '] div[class='column-content'] span[class='aui-field-content']"));
		   System.out.println(elements.size());
		  for (WebElement element : elements) {
		   System.out.println(element.getText());

		   if (element.getText().toLowerCase()
		     .contains(vacationStatus.toLowerCase())) {
		    found = true;
		    if (!element.findElement(By.cssSelector("label")).isSelected())
		     element.findElement(By.cssSelector("label")).click();
		    break;
		   }

		  }
		  Assert.assertTrue("Vacation type was not found!", found);

		 }
	
	public void clickApplyBtn() {
		applyBtn.click();

	}
	
	public void verifyVacationType(String vacationType) {
		  waitABit(2000);
		  //WebElement goToFirstPage = getDriver().findElement(By.cssSelector("span[class='aui-paginator-link aui-paginator-first-link']"));
		  
		  List<Integer> numberOfPagesList = StringUtils
		    .getAllIntegerNumbersFromString(pagesContainer.getText());
		  int noOfPages = numberOfPagesList.get(1);
		  System.out.println("Pages number: " + noOfPages);
		  waitABit(2000);

		  for (int i = 0; i < noOfPages; i++) {
		   waitABit(2000);
		   List<WebElement> items = getDriver()
		     .findElements(
		       By.cssSelector("table[class='taglib-search-iterator'] tr td:nth-child(8)"));
		   waitABit(2000);
		   System.out.println("Items size: " + items.size());
		   items.remove(0);
		   System.out.println("Items size: " + items.size());
		   for (WebElement item : items) {
		    System.out.println(item.getText());
		    $(item).waitUntilVisible();
		    Assert.assertTrue(
		      "hopahopa",item.getText().toLowerCase().equals(vacationType.toLowerCase()));
		      

		   }

		   if (i < noOfPages - 1) {
		    WebElement nextButton= getDriver().findElement(By.cssSelector("div[class='page-links'] a[class='aui-paginator-link aui-paginator-next-link']"));
		    nextButton.click();

		   }
		  }

		 }
	
	
	public void verifyDaysNumber(int lowerValue, int higherValue) {
		  waitABit(2000);
		  //WebElement goToFirstPage = getDriver().findElement(By.cssSelector("span[class='aui-paginator-link aui-paginator-first-link']"));
		  
		  List<Integer> numberOfPagesList = StringUtils
		    .getAllIntegerNumbersFromString(pagesContainer.getText());
		  int noOfPages = numberOfPagesList.get(1);
		  System.out.println("Pages number: " + noOfPages);
		  waitABit(2000);

		  for (int i = 0; i < noOfPages; i++) {
		   waitABit(2000);
		   List<WebElement> items = getDriver()
		     .findElements(
		       By.cssSelector("table[class='taglib-search-iterator'] tr td:nth-child(7)"));
		   waitABit(2000);
		   System.out.println("Items size: " + items.size());
		   items.remove(0);
		   System.out.println("Items size: " + items.size());
		   for (WebElement item : items) {
		    System.out.println(item.getText());
		    $(item).waitUntilVisible();
		    Assert.assertTrue(
		      "hopahopa",Integer.parseInt(item.getText()) >= lowerValue && Integer.parseInt(item.getText()) <= higherValue) ;
		      

		   }

		   if (i < noOfPages - 1) {
		    WebElement nextButton= getDriver().findElement(By.cssSelector("div[class='page-links'] a[class='aui-paginator-link aui-paginator-next-link']"));
		    nextButton.click();

		   }
		  }

		 }
	
	public void verifyVacationStatus(String vacationStatus) {
		  waitABit(2000);
		  //WebElement goToFirstPage = getDriver().findElement(By.cssSelector("span[class='aui-paginator-link aui-paginator-first-link']"));
		  
		  List<Integer> numberOfPagesList = StringUtils
		    .getAllIntegerNumbersFromString(pagesContainer.getText());
		  int noOfPages = numberOfPagesList.get(1);
		  System.out.println("Pages number: " + noOfPages);
		  waitABit(2000);

		  for (int i = 0; i < noOfPages; i++) {
		   waitABit(2000);
		   List<WebElement> items = getDriver()
		     .findElements(
		       By.cssSelector("table[class='taglib-search-iterator'] tr td:nth-child(9)"));
		   waitABit(2000);
		   System.out.println("Items size: " + items.size());
		   items.remove(0);
		   System.out.println("Items size: " + items.size());
		   for (WebElement item : items) {
		    System.out.println(item.getText());
		    $(item).waitUntilVisible();
		    Assert.assertTrue(
		      "hopahopa",item.getText().toLowerCase().equals(vacationStatus.toLowerCase()));
		      

		   }

		   if (i < noOfPages - 1) {
		    WebElement nextButton= getDriver().findElement(By.cssSelector("div[class='page-links'] a[class='aui-paginator-link aui-paginator-next-link']"));
		    nextButton.click();

		   }
		  }

		 }
	public void verifyEmployeeName(String firstName, String lastName) {
		  waitABit(2000);
		  //WebElement goToFirstPage = getDriver().findElement(By.cssSelector("span[class='aui-paginator-link aui-paginator-first-link']"));
		  
		  List<Integer> numberOfPagesList = StringUtils
		    .getAllIntegerNumbersFromString(pagesContainer.getText());
		  int noOfPages = numberOfPagesList.get(1);
		  System.out.println("Pages number: " + noOfPages);
		  waitABit(2000);

		  for (int i = 0; i < noOfPages; i++) {
		   waitABit(2000);
		   List<WebElement> items = getDriver()
		     .findElements(
		       By.cssSelector("table[class='taglib-search-iterator'] tr td:nth-child(1)"));
		   waitABit(2000);
		   System.out.println("Items size: " + items.size());
		   items.remove(0);
		   System.out.println("Items size: " + items.size());
		   for (WebElement item : items) {
		    System.out.println(item.getText());
		    $(item).waitUntilVisible();
		    Assert.assertTrue(
		      "hopahopa",item.getText().toLowerCase().contentEquals(firstName.toLowerCase()+" "+lastName.toLowerCase()));
		      

		   }

		   if (i < noOfPages - 1) {
		    WebElement nextButton= getDriver().findElement(By.cssSelector("div[class='page-links'] a[class='aui-paginator-link aui-paginator-next-link']"));
		    nextButton.click();

		   }
		  }

		 }
	
	
	public void clickViewVacationsLastName() {
		viewVacationsLastName.click();
	}
	
	
	public void clickViewVacationsLastName(String comment){
	  viewVacationsLastName.sendKeys(comment);
	}	
	
	public void clickViewVacationsFirstName() {
		viewVacationsFirstName.click();
	}
	
	public void clickViewVacationsFirstName(String comment){
		  viewVacationsFirstName.sendKeys(comment); 
		}	
		
	
}

	
