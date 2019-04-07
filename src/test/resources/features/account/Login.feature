@account
Feature: Login

  As a user
  I want to login
  So that I can check my account details

  Scenario: User can login
    Given I am on the 'Login' page
    When I enter a valid <username> in the 'Username' textbox on the 'Login' page
      | username      |
      | standard_user |
    And I enter a valid <password> in the 'Password' textbox on the 'Login' page
      | password     |
      | secret_sauce |
    And I click the 'Login' button
    Then I should be logged in successfully

  Scenario Outline: User can login sucessfully
    Given I am on the 'Login' page
    When I enter a <username> in the 'Username' textbox on the 'Login' page
    And I enter a <password> in the 'Password' textbox on the 'Login' page
    And I click the 'Login' button
    Then I should be logged in successfully

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

