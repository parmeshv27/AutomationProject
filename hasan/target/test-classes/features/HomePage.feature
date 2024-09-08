@HomePage @Release112023
Feature: Verify Home Page functionalities.
  I want to verify home page funcationalities

  @HomePage_001
  Scenario: Validate home page headers
    Given Launch the home page
    Then I Verify "Home" link on the headers
    
    @HomePage_002
    Scenario: I want to validate product name on the home page
    Given Launch the home page
    Then Verify "Tomato-1 Kg" product name is displayed
    
    @HomePage_003
    Scenario: I want to add the product to the cart
    Given Launch the home page
    When Add the product to the cart
    And Open the cart page
    Then Verify product is added to the cart
    
     @HomePage_004
    Scenario: I want to validate product name on the home page
    Given Launch the home page
    Then Verify "Beans-1 Kg" product name is available
    
      @HomePage_005
    Scenario: I want to add the product to the cart
    Given Launch the home page
    When Add the beans product to the cart
    And Open the cart page

    
    
  