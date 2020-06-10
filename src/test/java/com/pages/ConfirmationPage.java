package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class ConfirmationPage extends LibGlobal {

	public ConfirmationPage() {
		PageFactory.initElements(dr, this);
	}

	@FindBy(id = "order_no")
	private WebElement txtOrderNo;
	@FindBy(id = "logout")
	private WebElement btnLogOut;

	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}

	public WebElement getBtnLogOut() {
		return btnLogOut;
	}

}
