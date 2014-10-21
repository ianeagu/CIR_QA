package com.Testing_project.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class HomePage extends PageObject {

	//buton de "Sign In" din "Home Page"
	@FindBy(css = "a[id='sign-in']")
	public WebElementFacade signInButton_homePage;	
	
	
    public void click_SignIn_button() {
		signInButton_homePage.click();
	}
  
    
}