package com.pages;

public class PageObjectManager {
	LoginPage lPage;
	BookingPage bPage;
	SearchPage srPage;
	ConfirmationPage cPage;
	SelectPage sPage;

	public LoginPage getLoginPage() {
           if (lPage == null) {
			lPage = new LoginPage();
		}
		return lPage;
	} 

	public SearchPage getSearchPage() {
		if (srPage == null) {
			srPage = new SearchPage();
		}
		return srPage;

	}

	public SelectPage getSelectPage() {
		if (sPage == null) {
			sPage = new SelectPage();
		}
		return sPage;

	}

	public ConfirmationPage getConfPage() {
		if (cPage == null) {
			cPage = new ConfirmationPage();
		}
		return cPage;

	}

	public BookingPage getBookingPage() {
		if (bPage == null) {
			bPage = new BookingPage();
		}
		return bPage;

	}
}