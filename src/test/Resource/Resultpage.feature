Feature: Resultpage functionality

  Background:
    Given user is on the homepage of argos website
    When user wants to search for product
    Then user should see all the relevant searched products

  Scenario: click on Running filter
    Given user is on the result page of the argos website
    When user clicks on the Running filter
    Then user should see all the products associated with running filter