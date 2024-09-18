Feature: checking the carousel products 

Scenario: open the browser enter the url select the product and check same corousel 
          product is displayed on the desktop product(pdp_bt)
          
Given open the browser enter the url
When user should enter "Gifts" into search field
Then gifts product list page should be displayed
And user should select any one the product 
Then product descrition page should be displayed
And click on up arrow button and check for 5 carousel images of the product
Then close the browser