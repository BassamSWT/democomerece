@smoke
Feature: F04_Search
  Scenario Outline: user could search using product name
    When user enter search "<search>"
    And user enter search button
    Then user check products title contains "<search>"
    Examples:
    |search|
    |book|
    |laptop|
    |nike|

    Scenario Outline: user could search for product using sku
      When user enter search "<search>"
      And user enter search button
      And user clicks on product
      Then user check sku of product "<search>"
      Examples:
      |search|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|