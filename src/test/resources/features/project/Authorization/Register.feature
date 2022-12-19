@Register
Feature: Register
  As a user
  I want to create my account
  So I can login to the application

  @Register1
  Scenario Outline: Register page 1
    Given I opened the app
    And I click daftar button
    When I input fullname "<name>" email "<email>" and phone number "<number>"
    And I click lanjutkan button
    Then I can verify the result "<result>"
    Examples:
    |name|email|number|result|
    |retiam|retiamelina10@gmail.com|085773471838|go to page 2|
    |retiam|retiamelina10@gmail.com|            |error num|
    |retiam|                       |085773471838|error email|
    |      |retiamelina10@gmail.com|085773471838|error name|
    |      |                       |085773471838|error name|
    |      |retiamelina10@gmail.com|            |error name|
    |retiam|                       |            |error email|
    |      |                       |            |error name|

  @Register2
  Scenario Outline: Register page 2
    Given I opened the app
    And I click daftar button
    And I input fullname "<name>" email "<email>" and phone number "<number>"
    And I click lanjutkan button
    When I Input password "<password>" and confirm password "<confirm>"
    And I click register button
    Then I get the result "<result2>"
    Examples:
    |name|email|number|password|confirm|result2|
    |retia|retiamelina1@gmail.com|087781128001|Retiaah10|Retiaah10|go to login page|
    |retia|retiamelina@gmail.com|085773471838|Retiaah10|Retiiah10|errr passcon2    |
    |retia|retiamelina@gmail.com|087781128001|Retiaah10|         |error passcon   |
    |retia|retiamelina@gmail.com|087781128001|         |Retiaah10|error pass   |
    |retia|retiamelina@gmail.com|087781128001|         |         |error pass   |
    |retia|retiamelina@gmail.com|087781128001|retiaah10|retiaah10|error hkapital   |
    |retia|retiamelina@gmail.com|087781128001|retiaah  |retiaah  |error karakterangka   |
    |retia|retiamelina@gmail.com|087781128001|RETIAAH10|RETIAAH10|error hkecil    |

    @Register3
  Scenario Outline: Register with an already
    Given I opened the app
    And I click daftar button
    And I input already fullname "<vname>", email "<vemail>" and phone number "<vnum>"
    And I click lanjutkan button
    When I Input password "<password>" and confirm password "<confirm>"
    And I click register button
    Then I get the results "<result2>"
    Examples:
      |vname|vemail|vnum|password|confirm|result2|
      |retia|retiamelina@gmail.com|087781128001|Retiaah10|Retiaah10|regist page 2|