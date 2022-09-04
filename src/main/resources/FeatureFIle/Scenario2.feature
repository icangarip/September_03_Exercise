Feature: Login website Functionality

  Scenario: Login user account
    Given User navigate to login page
    When User enter login credentials
    Then User should login successfully
    When User navigate to my account page
    And Add new address
    Then Validate address