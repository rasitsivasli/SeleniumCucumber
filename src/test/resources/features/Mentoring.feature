@login
Feature: Contact List App
  Background: ortak stepler
    Given go to the home page

  @negativeLoginTest1
  Scenario: Invalid Credentials Test
    When enter invalid email
    And enter invalid password
    And click submit button
    Then verify incorrect message
    And close Browser

  @negativeLoginTest2
  Scenario: Space Credentials Test
    When click submit button
    Then verify incorrect message
    And close Browser

  @negativeLoginTest3
  Scenario: Invalid Email Emty Password Credentials Test
    When enter invalid email
    And click submit button
    Then verify incorrect message
    And close Browser

  @negativeLoginTest4
  Scenario: Emty Password Invalid Password Credentials Test
    And enter invalid password
    And click submit button
    Then verify incorrect message
    And close Browser

  @positiveLoginTest1
  Scenario: Invalid  Credentials Test
    When enter valid email
    And enter valid password
    And click submit button
    Then verify correct contactList message
    And close Browser

  @signIn
  Scenario: sign up
    When click sign Up button
    And enter first and last name and email and Password
    When click add a new Contact button
    And enter firstName and lastName
    And close Browser



