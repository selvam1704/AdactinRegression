Feature: verifying adactin site

  Scenario: user should enters the valid credentials
    Given user should give username and password
    When user should click login button
    Then user should verfiy the Credentials
    When user should select the location hotel and Roomtype in Search page
    And user should select the no of rooms and no of adults and no of child
    And User should click Search button
    When user should select the hotel in select hotel page
    And user should click continue button
    When user Should give First name lastname and address and cc num
    When user should select cc type and exp date month
    And User Should enter cvv num and click book now button
    Then User Should get the order no
