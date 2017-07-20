Feature: Test Facebook smoke scenario.

  Scenario Outline: Test login with valid credentials.
    Given Open chrome and Start Applicattion
    When I enter valid "<username>" and valid "<password>"
    Then user should able to login successfully
    Then Application should be close

    Examples: 
      | username           | password   |
      | debazzroy@yahoo.in | Nabonita2@ |
      | debazroy@gmail.com | Nabonita2  |
