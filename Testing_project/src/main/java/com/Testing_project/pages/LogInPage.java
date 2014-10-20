package com.Testing_project.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;

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

@DefaultUrl(Constants.URL)
public class LogInPage extends PageObject {

    @FindBy(id="sign-in")
    private WebElementFacade signIN;


	@FindBy(css = "a[id='sign-in']")
	public WebElementFacade signInButton_homePage;

	@FindBy(css = "input[id='_58_login']")
	public WebElementFacade inputName;

	@FindBy(css = "input[id='_58_password']")
	public WebElementFacade inputPassword;
	
	@FindBy(css = "input[type='submit']")
	public WebElementFacade signIN_loginPage;
    

    public void signIn() {
    	signIN.click();
    }
    
    public void click_SignIn_button() {
		signInButton_homePage.click();
	}
    
    

    public void logInAs() {
		System.out.println("before USER");
		inputName.sendKeys("MCM");
		System.out.println("before password");
		inputPassword.sendKeys(Constants.Password);
		signIN_loginPage.click();
	}
}