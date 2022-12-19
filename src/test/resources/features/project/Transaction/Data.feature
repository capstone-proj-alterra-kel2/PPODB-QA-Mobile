@Data
Feature: Paket Data
  As a user
  I want to buy paket data
  So I can make transaction
@Data1
  Scenario Outline: User buy data with valid phone number
    Given I have log in
    And I chose paket data on product menu
    When I input valid phone number "<num>"
    And click lanjutkan button
    And select data paket
    And select Mycuan method
    And click bayarr button
    Then the data transaction is success
    Examples:
      |num|
      |081273471838|

  Scenario Outline: User buy data with invalid number
    Given I have log in
    And I chose paket data on product menu
    When I input invalid phone number "<num>"
    Then transaction is failed "<result>"
    Examples:
      |num|result|
      |08127347183812345|invalid number|
      |081273471        |invalid number|
      |024568893572     |invalid provider|

    @Data2
  Scenario Outline: User buy data with valid phone number and use voucher
    Given I have log in
    And I chose paket data on product menu
    When I input valid phone number "<num>"
    And click lanjutkan button
    And select data paket
    And select voucher
    And select dana paymentt method
    And click bayarr button
    Then the data transaction is success
    Examples:
      |num|
      |081273471838|