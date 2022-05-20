Feature: Test Login Functionality
  @smoketest
  Scenario Outline: Check login is successfully with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page
    Examples:
    |username|password|
    |Almain  |12345   |
#    |Alin    |1234    |
