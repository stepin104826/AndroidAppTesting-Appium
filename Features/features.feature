Feature: Google Search
  As a frequent web user, I want to perform Google Search on a daily basis.


  Scenario Outline: Simple Google Search Test
    Given Google page is loaded to the browser successfully
    When the search phrase "<name>" is entered
    And Enter key is pressed
    Then the relevant search results are shown


    Examples: 
      |search phrase|
      |Taj Mahal|
      |Pop Songs|
