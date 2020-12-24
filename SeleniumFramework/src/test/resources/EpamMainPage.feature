Feature: Checking Functionality on EPAM main page
Background: browser is open
Background: the user navigates to main page

  Scenario: Checking Contact us Functionality
    Given the user clicks on Apply
    When the user clicks on Contact us
    Then the user navigates to Contact us form
  
  
    Scenario: Successful search of words
    Given the user clicks on Search
    And Search pop-up opens
    When the user type special word to find in field
    And clicks Find
    Then the Search page should open
    
     Scenario: Route to SolutionHub
    Given the user clicks on button How we do it
    When the user click on words our own IP
    Then the user go to the page SolutionHub
    
    Scenario: Reading the article
    Given the user clicks on button How we do it
    When the user on the page How we do it
    And the user click on infographic
    Then the user go to the article What’s Next for Digital Learning
    
    Scenario: searching for Automation
    Given the user click on Search button
    When the user search for Automation
    Then the user sees list of articles that have word Automation
    
    Scenario: Reading FAQ
    Given the user click on About 
    When the user click on Investors
    And the user click on FAQ
    Then the user navigates to the page with FAQ
    
     Scenario: Searching for cucumber
     Given the user click langButton
     And the user change language to Ukrainian
    When the user click on Search button
    And the user search for cucumber
    Then the user sees list of articles that have word cucumber
    
    Scenario: Going home
    Given the user navigates to insights
    When the user click on Epam
    Then the user navigates to main page