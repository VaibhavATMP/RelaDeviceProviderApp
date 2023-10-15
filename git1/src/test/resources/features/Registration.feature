@run
Feature: DocisnApp Test Scenarios

@ProviderAppRegistrationPage

  Scenario: ProviderApp registration to DocisnPlus

    Given User click on docisn to launch the app
    Then click on register here in login page screen
    Then User enters the data in fields
    Then User clicks on getotp button
    Then User enters received otp
    Then Click on submit button
    Then User enter the data in fields
    Then user click on submit button

@ProviderAppRegistrationPageNgativeScenarios-2
  Scenario: User should get warning message if email format is invalid

    Given User click on docisn to launch the app
    Then click on register here in login page screen
    Then User enter the data in field
    Then user will see the error message

@ProviderAppRegistrationPageNgativeScenarios-3
  Scenario: User should get warning message if email format is invalid.

    Given User click on docisn to launch the app
    Then click on register here in login page screen
    Then User enter the data in email field
    Then user will see the error message

@ProviderAppRegistrationPageNgativeScenarios-4
  Scenario: User should get warning message if email format is notvalid

    Given User click on docisn to launch the app
    Then click on register here in login page screen
    Then User enter the data in emailid field
    Then user will see the error message

@ProviderAppRegistrationPageNgativeScenarios-5
  Scenario: User should get warning message if email format is wrong

    Given User click on docisn to launch the app
    Then click on register here in login page screen
    Then User enter the wrong emailid
    Then user will see the error message

@ProviderAppRegistrationPageNgativeScenarios-6
  Scenario: User should get warning message if email format is incorrect

    Given User click on docisn to launch the app
    Then click on register here in login page screen
    Then User enter the data in emailid
    Then user will see the error message

@ProviderAppRegistrationPageNgativeScenarios-7
  Scenario: Mobile should not allow less than 10 digits in mobile number field
    Given User click on docisn to launch the app
    Then click on register here in login page screen
    Then User enter the data in mobile field
    Then App will through error message

@ProviderAppRegistrationPageNgativeScenarios-8
  Scenario: Check firstname start with number

    Given User click on docisn to launch the app
    Then click on register here in login page screen
    Then User enter the data in first name field
    Then user will get error message for first name field

  @ProviderAppRegistrationPageNgativeScenarios-9
  Scenario: Check Lastname start with number

    Given User click on docisn to launch the app
    Then click on register here in login page screen
    Then User enter the data in last name field
    Then user will get error message for the first name field

  @ProviderAppRegistrationPageNgativeScenarios-10
  Scenario: Check firstname should have Four characters

    Given User click on docisn to launch the app
    Then click on register here in login page screen
    Then User enter the data in the first name field
    Then user will get the error message for first name field

  @ProviderAppRegistrationPageNgativeScenarios-11
  Scenario: Check lastname should have Four characters

    Given User click on docisn to launch the app
    Then click on register here in login page screen
    Then User enter the data in lastname field
    Then user will get error message for last name field

  @ProviderAppRegistrationPageNgativeScenarios-12

  Scenario: User should get warning message if password and confirm
  password are missmatch

    Given User click on docisn to launch the app
    Then click on register here in login page screen
    Then User enters the data in fields
    Then User clicks on getotp button
    Then User enters received otp
    Then Click on submit button
    Then User enter the data in fields
    Then user should get error message

  @ProviderAppRegistrationPageNgativeScenarios-13

  Scenario:Check the password field validation

    Then click on register here in login page screen
    Then User enters the data in fields
    Then User clicks on getotp button
    Then User enters received otp
    Then Click on submit button
    Then User enters the data in password field
    Then app will through the error message