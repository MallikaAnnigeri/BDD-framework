Feature:Login to OrangeHrm with multiple user credential
    

  @tag2
  Scenario Outline:When should be able to login with these credentials
    Given user should open the browser and enter the url  and login page should be displayed
    When I user enters valid username "<name>" 
    And user enters valid Password "<password>"  click on login button home page should be displayed
    Then user should click on logout button

    Examples: 
      | name      | password   |
      | Admin     | admin123   |
      | Admin@123 |admin@123    |

      