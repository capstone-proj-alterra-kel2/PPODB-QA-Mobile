@Logout
  Feature: Logout
    As a user
    I want to logout
    So I can login again

  Scenario: Logout
    Given I have logged in
    And I go to akun menu
    When I click log out
    Then I success logout