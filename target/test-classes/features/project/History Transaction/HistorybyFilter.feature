@History
    Feature: History
    As a U ser
    I want to see my history
    So I can manage my hitsory transaction

  Scenario: User will validate theire transaction
        Given I have loged in
        And I buy pulsa
        When I click history on dashboard
     #   When select one of history
        Then I see my pulsa transaction

  Scenario: User will see history list
        Given I have loged in
        When I click history on dashboard
        Then I can see my list history transaction
@his2
      Scenario: User will validate theire transaction
        Given I have loged in
        And I buy paket data
        When I click history on dashboard
        #When select one of history
        Then I see my data transaction