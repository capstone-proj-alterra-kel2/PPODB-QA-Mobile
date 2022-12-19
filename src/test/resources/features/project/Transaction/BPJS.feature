@BPJS
Feature: BPJS
  As a user
  I want to pay BPJS
  So I can make transaction
  @BPJS1
  Scenario Outline: User pay BPJS with valid Id
    Given I have log in
    And I chose bpjs on product menu
    When I input valid VA "<va>"
    And click lanjutkan button
    And select payyment method
    And click bayyar button
    Then the transaction is success
    Examples:
      |va|
      |1234567891011|

  Scenario Outline: User pay bpjs with invalid id
    Given I have log in
    And I chose bpjs on product menu
    When I input invalid va "<va>"
    Then payment is failed "<result>"
    Examples:
      |va|result|
      |08577347183812345|Silakan masukan nomor yang valid|
      |085773471        |Silakan masukan nomor yang valid|