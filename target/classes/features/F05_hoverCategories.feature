@smokeHover
Feature: F05_hoverCategories
  Scenario: user hovers on one of main categories then click on sub category
    When user need to hover one of the categories
    And user need to select on of the sub categories
    Then user check whether page title equal the selected sub category
