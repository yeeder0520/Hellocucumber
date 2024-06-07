Feature: Is it Friday yet?
  Everybody want to know when it's Friday

  Scenario Outline: Check if it's Friday
    Given today is "<weekday>"
    When I ask whether it's Friday yet2
    Then I should be told "<answer>"

    Examples:
      | weekday   | answer |
      | Sunday    | No     |
      | Monday    | No     |
      | Tuesday   | No     |
      | Wednesday | No     |
      | Thursday  | No     |
      | Friday    | Yes    |
      | Saturday  | No     |