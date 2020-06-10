package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class LoginPage extends LibGlobal {
	public LoginPage() {
		PageFactory.initElements(dr, this);
	}
	
	
	@FindBy(id = "username")
	private WebElement txtUsername;
	@FindBy(id = "password")
	private WebElement txtPassWord;
	@FindBy(id = "login")
	private WebElement btnlogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
}
