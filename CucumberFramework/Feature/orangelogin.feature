Feature: login module

  @ValidCredential
  Scenario: login to application with valid credentials
    Given user should open the browser and enter the url
    When user enters valid use name "Admin" and password  "admin123" and click on login button
    Then homepage should be displayed
    When user click on pim and then user should click on Add Emloyee
    And user should entire all details
      | mallika | Abdul | Annigeri |

  @InvalidCredential
  Scenario: Try login with Invalid Crredential
    Given user should open the browser and enter the url
    When user enters invalid username "Mallika" and invalid password "mallika@98" and click on login Button
    Then Error message "Invalid credentials" should be displayed
