Feature: Google UI testing feature file

  @Run
  Scenario Outline: Validating home page items are showing.
    Given "<Google>" homepage opens
    Then All main homepage elements are showing
    Examples:
      | Google |
      | https://www.google.com/ |

  @Run
    @Last
  Scenario Outline: Validating image search elements shows when click on image search button.
    Given "<Google>" homepage opens
    When Clicking on image search button
    Then User moved to image search page.
    Examples:
      | Google |
      |   https://www.google.com/    |



  @NotRun
  Scenario Outline: Validating Search works correctly with valid input.
    Given "<Google>" homepage opens
    When Valid search "<text>" is entered in the search bar
    And clicked on search
    Then Moved to another page and URL changed
      Examples:
        | text || Google |
        | test ||   https://www.google.com/     |
        | Speed ||  https://www.google.com/     |

  @NotRun
  Scenario Outline: Validating search works correctly with invalid input.
    Given "<Google>" homepage opens
    When Invalid search "<text>" is entered in the search bar
    And clicked on search
    Then Proper error message is shown
    Examples:
      | text || Google |
      | lknvlangslv alksdfkaweflLjf[kf;amsdfojOJF    ||https://www.google.com/|
      | lknvlangslvfawevgaralksdfkaweflLjf[kf;amsdfojOJF    ||https://www.google.com/|

  @NotRun
  Scenario Outline: Validating feeling luck works correctly with valid input.
    Examples:
      |  |

  @NotRun
  Scenario Outline: Validating feeling luck works correctly with invalid input.
    Examples:
      |  |

  @NotRun
  Scenario Outline: Validating search suggestion shows related suggestion with valid input.
    Given "<Google>" homepage opens
    When Valid search "<text>" is entered in the search bar
    Then Relative suggestion are shown
    Examples:
      | text || Google |
      | text ||    https://www.google.com/    |
      | money ||   https://www.google.com/    |


