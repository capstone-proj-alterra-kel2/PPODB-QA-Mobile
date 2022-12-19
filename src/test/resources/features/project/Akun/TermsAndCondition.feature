@TC
Feature: Terms and Condition
  As a user
  I want to see the terms and condition
  So I can find out the terms and condition of the application

  Scenario: List terms and condition
    Given I have logged in
    And I go to akun menu
    When I click terms and condotion
    Then I can see list therm and condition

  Scenario: See detail one of term and condition
    Given I have logged in
    And I go to akun menu
    When I click terms and condotion
    And I click detail
    Then I can see the term and condition