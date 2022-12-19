@Listrik
Feature: Listrik
  As a user
  I want to pay lisrik
  So I can make transaction
@Listrik1
  Scenario Outline: User pay listrik with valid Id
    Given I have log in
    And I chose listrik on product menu
    When I input valid id "<id>"
    And click lanjutkan button
    And select payyment method
    And click bayyar button
    Then the transaction is success
    Examples:
      |id|
      |123456789101|

  Scenario Outline: User pay listrik with invalid id
    Given I have log in
    And I chose listrik on product menu
    When I input invalid id "<id>"
    Then payment is failed "<result>"
    Examples:
      |id|result|
      |08577347183812345|Silakan masukan nomor yang valid|
      |085773471        |Silakan masukan nomor yang valid|