package com.Testing_project.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Testing_project.utilities.Constants;

import net.thucydides.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://192.168.1.68:9090/vacation")
public class NewVacationRequestPage extends PageObject {

    @FindBy(css="div[class='aui-column-content aui-column-content-first '] div:nth-child(1) ul li:nth-child(2) a")
    private WebElementFacade newVacationRequestBtn;

    @FindBy(css="h1[class='header-title'] span")
    private WebElementFacade createVacationTitle;
    
    
    public void clickNewVacationRequest(){
    	newVacationRequestBtn.click();
    	
    }
    
    public void verifyThatYouAreOnCreateNewVacationRequestPage(){
        Assert.assertTrue("you are not on the correct page!",createVacationTitle.getText().toLowerCase().contains(Constants.CREATE_NEW_VACATION_REQUEST.toLowerCase()));  
      	
    }
    
    
    
    
    
    
    

//    
//    public List<String> getDefinitions() {
//        WebElementFacade definitionList = find(By.tagName("ol"));
//        List<WebElement> results = definitionList.findElements(By.tagName("li"));
//        return convert(results, toStrings());
//    }
//
//    private Converter<WebElement, String> toStrings() {
//        return new Converter<WebElement, String>() {
//            public String convert(WebElement from) {
//                return from.getText();
//            }
//        };
//    }
}