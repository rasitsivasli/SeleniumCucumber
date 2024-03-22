@login
Feature: Contact List App
  Background: ortak stepler
    Given go to the home page

  @ScenarioOutline
  Scenario Outline: Login Scenario Outline
    When enter valid username "<username>"
    And enter valid password "<password>"
    And click submit button
    Then verify correct contactList message
    And close Browser

    Examples:
      | username        | password   |
      | asya@clarus.com | asya123    |
      | test2@fake.com  | myPassword |
      |rasit@gmail.com  |rasit123    |





