@Login
Feature: Login
  As a user
  I want to login
  So I can make transactions

@Login1
  Scenario Outline: Login
    Given I have register
    When I input email "<email>" and password "<password>"
    And I click masuk button
    Then I can verify the result3 "<result3>"
    Examples:
    |email|password|result3|
    |retiamelina10@gmail.com|Retiaah10|go to dasboard|
    |retiamelina10@gmail.com|         |error pass |
    |                       |Retiaah10|error email |
  #  |retiam@gmail.com       |Retiaah10|error email |
  #  |retiamelina10@gmail.com|retiam   |error pass |
   # |retiam@gmail.com       |retiam   |error email |
    |                       |         |error pass |

@Login2
  Scenario Outline: Login with phone num
    Given I have register
    When I input phonenum "<phone>" and password "<password>"
    And I click masuk button
    Then I can verify the result4 "<result4>"
    Examples:
      |phone|password|result4|
     # |087781128001         |Retiaah10|go to dasboard|
      |087781128001          |         |error pass |
      |                      |Retiaah10|error num |
     |08778112800112345     |Retiaah10|error num |
      |087781128001          |retiam   |error pass |
      |08778112800112345     |retiam   |error num |
      |                      |         |error pass |