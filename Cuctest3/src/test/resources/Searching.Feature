Feature: Searching

Scenario: Search with enter key
    Given User on google's landing page
    When User on clicks on searchbar
    And User enters fender stratocaster in searchbar
    And User presses enter key on searchbar
    Then title of webpage is "fender stratocaster - Google Search"

Scenario: Search with click icon
    Given User on google's landing page
    When User on clicks on searchbar
    And User enters fender stratocaster in searchbar
    And User presses clicks search icon
    Then title of webpage is "fender stratocaster - Google Search"