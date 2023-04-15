@smoke
  Feature: F02_Login | users could use login functionality to use their accounts
    Scenario Outline: user could login with email and password
      Given user go to login page
      When user login with "<email>" and "<password>"
      And user press on login button
      Then user login to the system successfully
    Examples:
      |email|password|
      |test123@example.com|P@ssw0rd|
      |wrong@example.com|P@ssw0rd|
#
#    Scenario Outline: user could login with invalid email and password
#    Given user go to login page
#    When user login with "invalid" "wrong@example.com" and "P@ssw0rd"
#    And user press on login button
#    Then user could not login to the system
