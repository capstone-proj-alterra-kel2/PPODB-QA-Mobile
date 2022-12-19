@BuyPulsa
Feature: Pulsa
  As a user
  I want to buy pulsa
  So I can make transaction

  Scenario Outline: User buy pulsa with valid phone number
    Given I have log in
    And I chose Pulsa on product menu
    When I input valid phone number "<num>"
    And click lanjutkan button
    And click nominal transaction
    And select payment method
    And click bayar button
    Then the transaction is success
    Examples:
    |num|
    |081273471838|

  Scenario Outline: User buy pulsa with entering a longer phone number than necessary
    Given I have log in
    And I chose Pulsa on product menu
    When I input invalid phone number "<num>"
    Then transaction is failed "<result>"
    Examples:
    |num|result|
    |0812345678901233|Nomor Handphone tidak ditemukan|
    |081273471   |Nomor Handphone tidak ditemukan|
    |024568893572|Maaf hanya menerima nomor provider indonesia|

  @Pulsa
  Scenario Outline: User buy pulsa with valid phone number and use voucher
    Given I have log in
    And I chose Pulsa on product menu
    When I input valid phone number "<num>"
    And click lanjutkan button
    And click nominal transaction
    And select voucher
    And select dana payment method
    And click bayar button
    And click go to application
    Then the transaction is success
    Examples:
      |num|
      |081273471838|



