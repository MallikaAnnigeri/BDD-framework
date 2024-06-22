 Feature:Login to OrangeHRM
 
 
  Scenario: When user enters valid Username and Password and click on login button HomePage should be displayed
    Given user should open browser and enter Url 
    When When user Enter valid usernam    "Admin" and Password "admin123" and click on login button 
    Then Home Page should be displayed
    Then User should click on logout button

   