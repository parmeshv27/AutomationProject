
@Login
Feature: Login feature
  I want to use this template for my feature file
  
  Background:
 Given Launch the browser 

  @Login_001 @smoke @Regression
  Scenario: Login to the application with valid credentials       
    When Enter the username and password
    And Click on Login button    
    Then I validate the login is success
    
    
      @Login_002 @Regression
  Scenario Outline:Login to the application with invalid credentials 
 When I enter Username as "<username>" and Password as "<password>"
    Then Verify login is successful

    Examples: 
      | username | password  |
      |   abc123 | abc |
      |      nandi123 | abc123    |
      |      nandi1237 |  Nandi123$   |
      |  jeevan | 1234$    |
      | bangalore | bng    |  
      
      
      