@Order @Release112023
Feature: Validates the orders
  I want to validates the orders

 @OrderPage_001
    Scenario: Verify user is able to order tomoto 1-kg
    Given Launch the home page
    When Add the product to the cart
    And Open the cart page
    Then Verify total price
    When Click on Proceed to Checkout
    When Enter the "No 25 Malathi nivas KR Puram-36" address
    And Click on Cash on Delivery and Place Order
		Then Verify order is success
  