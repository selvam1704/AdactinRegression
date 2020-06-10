$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/adactinsite.feature");
formatter.feature({
  "name": "verifying adactin site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user should enters the valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user should give username and password",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinStepDef.user_should_give_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click login button",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDef.user_should_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verfiy the Credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDef.user_should_verfiy_the_Credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the location hotel and Roomtype in Search page",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDef.user_should_select_the_location_hotel_and_Roomtype_in_Search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the no of rooms and no of adults and no of child",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDef.user_should_select_the_no_of_rooms_and_no_of_adults_and_no_of_child()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click Search button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDef.user_should_click_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the hotel in select hotel page",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDef.user_should_select_the_hotel_in_select_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click continue button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDef.user_should_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Should give First name lastname and address and cc num",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDef.user_Should_give_First_name_lastname_and_address_and_cc_num()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select cc type and exp date month",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDef.user_should_select_cc_type_and_exp_date_month()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Should enter cvv num and click book now button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDef.user_Should_enter_cvv_num_and_click_book_now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Should get the order no",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDef.user_Should_get_the_order_no()"
});
formatter.result({
  "status": "passed"
});
});