@Shopee
Feature:Shopee
  As a user
  I wan to topup my e-wallet
  So I can success topup

  Scenario: topup shopee
    Given I have loged in
    And I click lainya
   # When I click shopee
    And input my num e-wallet
    And click lanjutkan button
    And I input nominal
    And click lanjutkan button
    And click lanjutkan2 button
    Then top up e-wallet success