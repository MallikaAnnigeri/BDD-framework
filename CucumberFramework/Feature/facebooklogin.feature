Feature: login to facebook application


@invalidcredential
Scenario: login module
Given when user enter url login page should be displayed 
When user enter all the details 
|mallika| Annigeri|
And click on login button
Then Error message should be displayed
