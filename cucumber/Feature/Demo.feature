Feature: Testing in the Feature File

      @tag1
  Scenario: Test Demo
    Given Launch the Browser as ChromeBrowser
    When Launch the Application
    Then Pass the UserName and Password 
    Then Login to Application after Clciks on Login Button
    
    @tag2
  Scenario: Test Demo
    Given I entered old password
    When I entered new password and confirm password
    Then I should get a greeting message
    
    
    