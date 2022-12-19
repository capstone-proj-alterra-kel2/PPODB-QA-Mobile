@PDAM
Feature: PDAM
  As a user
  I want to pay PDAM
  So I can make transaction
  @PDAM1
  Scenario Outline: User pay PDAM with valid Id
    Given I have log in
    And I chose pdam on product menu
    When I chose wilayah
    And I input valid user num "<va>"
    And click lanjutkan button
    And select payyment method
    And click bayyar button
    Then the transaction is success
    Examples:
      |va|
      |5225406|

  Scenario Outline: User pay pdam with invalid id
    Given I have log in
    And I chose pdam on product menu
    When I chose wilayah
    When I input invalid user num "<va>"
    Then payment pdam is failed "<result>"
    Examples:
      |va|result|
      |08577347183812345|Silakan Masukan Nomor Pelanggan Yang Benar|

  Scenario Outline: User pay pdam without choose wilayah
    Given I have log in
    And I chose pdam on product menu
    When I input invalid user num "<va>"
    Then payment pdam is failed "<result>"
    Examples:
      |va|result|
      |08577347183812345|Silakan Pilih Daerah Anda|