@smoke
Feature: F08_Wishlist

  Scenario:  user check that the product successfully added to the wishlist with a success message
    When user clicks on wishlist button
    Then user check that success message appeared

  Scenario:  user check that the product successfully added to the wishlist with a quantity
    When user clicks on wishlist button
    And user check that success message appeared
    And user clicks on wishlist label
    Then user check the quantity
