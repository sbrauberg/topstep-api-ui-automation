@ui
Feature: Topstep Login Functionality (UI)

  Background: User login
    Given User is on the Topstep login page

  Scenario: Authorized user should be able to login
    When User logins with username "valid.username" and password "valid.password"
    Then Page title should display "Dashboard - Topstep"


  Scenario Outline: An unauthorized user login attempt
    When User logins with username "<username>" and password "<password>"
    Then Error message "<error_message>" should be displayed


    Examples:
      | username               | password               | error_message                   |
      | invalid.username       | invalid.password       | Invalid login or password       |
      | invalid.username       | invalid.password.empty | Password cannot be blank.       |
      | invalid.username.empty | invalid.password       | Email/Username cannot be blank. |