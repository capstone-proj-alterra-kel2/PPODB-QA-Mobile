@Faq
Feature: Faq
  As a user
  I want see faq menu
  So I can see the answer to my problem

  Scenario: Faq
    Given I have loged in
    When I click faq menu
    And I click one Of article
    Then I can see the article
