Feature: order place
@endtoend
Scenario:User should login to application with valid credential and place the order
Given  user should open the browser and enter the shopersstack url
When user enter all details and click on login button
When user  mouse hover to the mens tab and select tshirt option
Then verify Mens Tshirt page should be displayed
  |https://shoppersstack.com/sub-category/men-tshirt|
 When select the product and click on Add to cart button
 And click on cart icon and click on buy now button
 Then Adress page should be displayed
 And usershould  click on Add Adress button
 Then user should enter all the valid  details into Add Adrees page
 |Mallika|24thCross|Jyothi pg|2nd cross|India|Delhi|Delhi|560010|9764447865|
 And click on Add Adress button
 When user select the radio option and click on proceed button
 Then verify Payment Method Page should be displayed 
 When User select cash on delivery radio button and click on proceed
 Then Verfigy Order confimation page should be displayed
 And close the Browser
 
 
 
 
 
 
 
 
 