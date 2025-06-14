Feature: Add a new employee in OrangeHRM

  Scenario: Admin adds a new employee
    Given User is on the OrangeHRM login page
    When User logs in with valid credentials
    And User navigates to the PIM section
    And User clicks on Add Employee
    And User enters employee details
    Then A new employee should be added successfully
