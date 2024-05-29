Feature: Catalog management
Scenario: Tries to add an empty tag and fails
	Given ther user is on the login page of the administration panel (/administrator)
	When the user enters "admin@prestashop.com" in the "Email address" field
		And enters "password" in the "Password" field
		And clicks the "Login" button
		And hovers on "Catalog"
		And clicks on "Tags"
		And clicks the "Add new tag" button
		And clicks on the "Save" button
	Then an error message is displayed
	
	Given the previous assertion passed
	Then the user clicks on the user icon in the top right corner of the page
	And clicks the "Sign out" link