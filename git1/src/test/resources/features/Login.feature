@run
Feature: Docisn App Test Scenarios

@ProviderAppTC_1
  Scenario: ProviderApp Login to Docisn.
    Given User click on docisn to launch the app
    Then User enter data in the fields
    Then User click on login button
    Then User click on Menu Button
    Then User click on Settings option in menu
    Then User click on Logout and logout successfully

@ProviderAppTC_2
  Scenario: To check if user is able to Login with valid credentials
    #Given User click on docisn to launch the app
    Then User enter data in the fields
    Then User click on login button
  Then User click on Menu Button
  Then User click on Settings option in menu
  Then User click on Logout and logout successfully

#@ProviderAppTC_3
#  Scenario: To check if user is able to Login with valid email and wrong password.
#    Given User click on docisn to launch the app
   Then User enters valid email and wrong password and clicks on login


#@ProviderAppTC_4
#  Scenario: To check if user is able to Login with invalid email and right password
#    Given User click on docisn to launch the app
#    Then User enters invalid email and right password and clicks on login
#
#@ProviderAppTC_5
#  Scenario: To check if user is able to Login by entering only email or only password.
#    Given User click on docisn to launch the app
#    Then User enters only email or only password and tries to click on login
#
#@ProviderAppTC_6
#  Scenario: To check if user is able to Login by unregistered user
#    Given User click on docisn to launch the app
#    Then User enters unregistered user credentials
#    Then User click on login button

#@ProviderApp_TC01
   Scenario: Provider Login and logout to Docisn
    Given User click on docisn to launch the app
    Then User enter valid Username and valid Password
    Then User click on login button
    Then User click on Menu Button
    Then User click on Settings option in menu
    Then User click on Logout and logout successfully

  #Test.




