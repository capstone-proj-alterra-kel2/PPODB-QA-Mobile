@TopUp
Feature: Topup
  As a user
  I want to topup
  So I can make transaction

  Scenario: User topup
    Given I have loged in
    When click topup button
    And choose payment method
    And input nominal
    And click bayr button
    And go to application
    Then top up success
