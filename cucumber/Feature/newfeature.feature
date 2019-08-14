Feature: Testing the Feature files

  @tag4
  Scenario: Login with valid Credentials
    Given Navigate to Home Page
    When User enter username and password
    Then user logged in Successfully


@data_driver 
  Scenario: select product and place order
    Given chiya selected product
    When chiya increased product count
    And proceed to chckout
    And change the shipping address to address "pune"
    Then The product should be delivered

 