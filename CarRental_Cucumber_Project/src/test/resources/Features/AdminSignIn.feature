Feature: Admin Login Functionality for Car Rental Website

  Background: 
    Given admin launch the browser
    And admin is on the Car Rental page
    When admin clicks on Admin module
    Then admin navigates to sign in page

  Scenario: Successful login with valid credentials
    Given admin have entered a valid username and password
    When admin click on the login button
    Then admin should be logged in successfully

  Scenario Outline: Unsuccessful login with invalid and empty credentials
    Given admin have entered invalid "<username>" and "<password>"
    When admin click on the login button
    Then admin should see an error message indicating "<error_message>"

    Examples: 
      | username | password   | error_message   |
      | bunny    | Test@12345 | Invalid Details |
      | admin    | Test@12346 | Invalid Details |
      | bunny    | Test@12347 | Invalid Details |
      |          |            | Invalid Details |

  Scenario: Navigating to the back to home page
    When admin click on the "Back to Home" link
    Then admin should be redirected to the home page
