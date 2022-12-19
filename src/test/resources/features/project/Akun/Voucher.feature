@Voucher
Feature: Voucher
  As a user
  I want to see my vouchers
  So I can use the vouchers

  Scenario: Voucher
    Given I have logged in
    And I go to akun menu
    When I click voucher
    Then I can see my vouchers