Feature: Homepage functionality

  @regression
  Scenario: Search product
    Given user is on the homepage of argos website
    When user wants to search for product
    Then user should see all the relevant searched products

  @smoke
  Scenario: Clicking on Account button
      Given user is on the homepage of argos website
      When user clicks on the account button
      Then user should see the detail of account

    @Sanity
    Scenario Outline: search multiple products      //Outline is used for multiple search
      Given user is on the homepage of argos website
      When user try to find multiple "<product>"
      Then user should see all the relevant searched products

      Examples:
        | product |
        |nike|
        |puma|