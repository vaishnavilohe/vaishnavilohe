
Feature: Data Table Feature


  @tag1
  Scenario: The one where user pick different product through search functionality
    Given Chiya has registered for testme app
    When chiya search below product in search box
      |Head   |
      |Travel |
      |Laptop |
   Then product should be add in the cart if available  
