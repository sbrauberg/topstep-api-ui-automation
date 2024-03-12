@api @sign-in
Feature: User Sign-in Service (API)

  Scenario: User sign-in happy path
    Given User has a set of credentials of "brauberg27" and "Topstep1!" and "8914e4bcde2eed17b537f68e942e047e"
    When User sends a POST request to the sign-in endpoint with these credentials
    Then Status code should be 200
    And Response body should have "enabled"

  Scenario Outline: User sign-in negative scenario
    Given User has a set of credentials of "<username>" and "<password>" and "<device_uuid>"
    When User sends a POST request to the sign-in endpoint with these credentials
    Then Status code should be <status_code>
    And Response body should have "<response>"

    Examples:
      | username          | password             | device_uuid                       | status_code | response                  |
      | invalid.api.email | invalid.api.password | 8914e4bcde2eed17b537f68e942e0471e | 401         | Invalid login or password |
      | invalid.api.email | valid.api.password   | invalid.api.device_uuid           | 401         | Invalid login or password |
      | valid.api.email   |                      | 8914e4bcde2eed17b537f68e942e0471e | 401         | Invalid login or password |

