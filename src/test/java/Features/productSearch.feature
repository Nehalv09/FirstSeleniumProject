Feature: product search

  As a user I want to search a product so that I can find the results

  Scenario: search an ite using product name
    Given I  am on the home page "https://www.next.co.uk"
    When  I search an item using product name "jeans"
    And   I click on search button
    Then  I should only be seen related to jeans


  Scenario: search an ite using Brand name
    Given I  am on the home page "https://www.next.co.uk"
    When  I search an item using product name "Nike"
    And   I click on search button
    Then  I should only be seen related to nike

