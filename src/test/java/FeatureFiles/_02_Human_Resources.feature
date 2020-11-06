Feature: Human Resources

  Background:

    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario: Create Human Resources
    Given Navigate to Salary
    When Create new salary position "özge"
    Then Success message should be displayed


  Scenario:Edit Human Resources
    Given Navigate to Salary
    When Edit salary position "özge" "arda"
    Then Success message should be displayed

  Scenario:Delete Human Resources
    Given Navigate to Salary
    When Delete salary position "arda"
    Then Success message should be displayed

