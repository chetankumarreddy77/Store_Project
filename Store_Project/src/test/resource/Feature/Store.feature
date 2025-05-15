Feature: I am Automating the DemoBlaze Mobile Ecommerce 

Background: Common Points

Given user Launch the chrome browser
When user enter the url "https://www.demoblaze.com/index.html"

Scenario: Store- Purchasing the product

When user click the Login Button
Then user enter the login Credentials after enter the details click Login button
		|Username  | Password |
		|Username77| Password |
And user choose the phone and add to the cart and click the cart button
When user click place the order and give the user details and you can click the purchase button
		|Name | Country | City      | CreditCard | Month | Year | 
		|John | India   | Hyderabad | 9876543210 | 08    | 2026 |
		|Vicky| India   | Vizag     | 9234567802 | 04    | 2028 |
		
And user can place the order successfully
Then user exit from browser