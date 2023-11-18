Feature: Dashboard Functionality

  Scenario: Valid Dashboard with Correct Credentials
    Given the user is on the dashboard page
    When the user enters valid dusername and dpassword
    And clicks on the dLogin button
    Then the user should be navigated to the dashboard