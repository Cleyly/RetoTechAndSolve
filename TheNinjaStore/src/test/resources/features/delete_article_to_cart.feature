Feature: Delete article of the shopping cart
	As The Ninja Store customer
	I want to delete article of the shopping cart
	To verify article deleted
	
	@Scenario1:
	Scenario: Delete article of the shopping cart and verify
	Given the customer added articles on the shopping cart
	When she delete article of the shopping cart
	Then she should see an empty shopping cart