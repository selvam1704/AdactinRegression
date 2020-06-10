package com.stepdefinition;

import org.junit.Assert;

import com.baseclass.LibGlobal;
import com.pages.BookingPage;
import com.pages.ConfirmationPage;
import com.pages.LoginPage;
import com.pages.PageObjectManager;
import com.pages.SearchPage;
import com.pages.SelectPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinStepDef extends LibGlobal {
PageObjectManager pPage=new PageObjectManager();
	@Given("user should give username and password")
	public void user_should_give_username_and_password() {
		launchBrowser();
		loadUrl("https://adactin.com/HotelApp/");
		
		fill(pPage.getLoginPage().getTxtUsername(), "samsamsam");
		fill(pPage.getLoginPage().getTxtPassWord(), "samsamsam");

	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		
		btnClick(pPage.getLoginPage().getBtnlogin());

	}

	@Then("user should verfiy the Credentials")
	public void user_should_verfiy_the_Credentials() {
		Assert.assertTrue("verify url", dr.getCurrentUrl().contains("SearchHotel"));

	}

	@When("user should select the location hotel and Roomtype in Search page")
	public void user_should_select_the_location_hotel_and_Roomtype_in_Search_page() {
		SearchPage s = new SearchPage();
		selByText(s.getSelLocation(), "Brisbane");
		selByText(s.getSelHotel(), "Hotel Sunshine");
		selByText(s.getSelRoomtype(), "Double");

	}

	@When("user should select the no of rooms and no of adults and no of child")
	public void user_should_select_the_no_of_rooms_and_no_of_adults_and_no_of_child() {
		SearchPage s = new SearchPage();
		selByText(s.getSelRooms(), "3 - Three");
		selByText(s.getSelAdults(), "3 - Three");
		selByText(s.getSelChild(), "3 - Three");
	}

	@When("User should click Search button")
	public void user_should_click_Search_button() {
		SearchPage s = new SearchPage();
		btnClick(s.getBtnSubmit());

	}

	@When("user should select the hotel in select hotel page")
	public void user_should_select_the_hotel_in_select_hotel_page() {
		SelectPage s = new SelectPage();
		btnClick(s.getSelHotel());

	}

	@When("user should click continue button")
	public void user_should_click_continue_button() {
		SelectPage s = new SelectPage();

		btnClick(s.getBtnContinue());

	}

	@When("user Should give First name lastname and address and cc num")
	public void user_Should_give_First_name_lastname_and_address_and_cc_num() {
		BookingPage b = new BookingPage();
		fill(b.getTxtFirstName(), "selva");
		fill(b.getTxtLastName(), "m");
		fill(b.getTxtAddress(), "chennai");
		fill(b.getTxtCcNuml(), "1234567891234567");

	}

	@When("user should select cc type and exp date month")
	public void user_should_select_cc_type_and_exp_date_month() throws InterruptedException {
		BookingPage b = new BookingPage();
		selByText(b.getSelCardType(), "Master Card");
		selByText(b.getSelExpMonth(), "March");
		selByText(b.getSelExpYear(), "2022");
	}

	@When("User Should enter cvv num and click book now button")
	public void user_Should_enter_cvv_num_and_click_book_now_button() throws InterruptedException {
		BookingPage b = new BookingPage();
		fill(b.getTxtCvvnum(), "123");
		btnClick(b.getBtnBook());
		Thread.sleep(8000);

	}

	@Then("User Should get the order no")
	public void user_Should_get_the_order_no() {
		ConfirmationPage c = new ConfirmationPage();
		System.out.println("order no is");
		getTheEnteredText(c.getTxtOrderNo());
		btnClick(c.getBtnLogOut());

	}

}
