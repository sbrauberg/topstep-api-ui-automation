@api @update
Feature: User Account Management Services (API)

  Background:
    Given User has valid request payload

  Scenario: Sending a PATCH request without modifications
    When User sends a PATCH request
    Then Status code should be 200
    And Response body should have profile_id 1272015 and status "enabled"

  Scenario: Sending a PATCH request new profile_id
    When User sends a PATCH request with new changes in the request payload
    Then Status code should be 200
    And Response body should have profile_id 1272016 and status "enabled"

  Scenario: Sending a PATCH request with an invalid user_id
    When User sends a PATCH request using invalid user_id in the endpoint
    Then Status code should be 403
    And Response body should have "Forbidden"
