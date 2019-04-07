@navigation
Feature: Navigation

  As a user
  I want to navigate the website
  So that I can access different pages

  Scenario: Use can navigate from Account page to Login page
    Given I log in
    When I click the 'Menu' button on the 'Home' page
    And I click the 'Logout' button
    Then I am logged out