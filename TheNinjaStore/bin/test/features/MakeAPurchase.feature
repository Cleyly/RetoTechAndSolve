Feature: Shopping Cart
	As Alkosto customer
	I want to add a product to the shopping cart
	To buy it
	
	Scenario: Add product to Shopping Cart
	Given the customer enters the app
	When she add 'TV' to the shopping cart
	Then she should see '1' 'TV' in the shopping cart 