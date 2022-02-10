@login_user_correct
Feature: login_user_correct
  Scenario: TC02_login_user_with_correct_email_and_password
    When user launches the browser
    And user navigates to home page
    Then user verifies home page is visible
    And user clicks login button
    And user verifies login to your account is visible
    And user enters correct email_address and password
  |email_address|password|
  |haci@gmail.com|Asd123.|
    And user clicks login button
    Then user verifies logged in as username is visible
