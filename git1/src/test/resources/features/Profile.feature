@run
Feature: Docisn App
  Background: Login DocisnPlus
    Given User click on docisn to launch the app
    Then User enter valid Username and valid Password
    Then User click on login button

@ProviderProfile

  Scenario: After login with a Member/Provider to update details in the Profile page.

 
    Then User click on profile icon
    Then user enter personal information data in fields
    Then user enter education details data
    Then user enter registration details data
    Then user enter the data in clinic fields
    Then user enter data in bank fields
    Then user add signature

#  Negative Scenarios
  @ProviderProfileTC1

  Scenario: Check user can able to add personal information without enter mandatory fields

 
    Then User click on profile icon
    Then User click on personal information link
    Then User try to save personal information data without filling mandatory fields

  @ProviderProfileTC2

  Scenario: Check user can able to add education details without enter mandatory fields

 
    Then User click on profile icon
    Then User click on personal information link
    Then click on save and continue button
    Then user will get the error message

  @ProviderProfileTC3

  Scenario: Check user can able to add medical registration details without enter mandatory fields

 
    Then User click on profile icon
    Then User click on personal information link
    Then click on save and continue button
    Then user will get the error message

  @ProviderProfileTC4

  Scenario: Check user can able to add hospital/clinic details without enter mandatory fields

 
    Then User click on profile icon
    Then User click on personal information link
    Then click on save and continue button
    Then user will get the error message

  @ProviderProfileTC5

  Scenario: Check user can able to add bank details without enter mandatory fields

 
    Then User click on profile icon
    Then User click on personal information link
    Then click on save and continue button
    Then user will get the error message

  @ProviderProfileTC6

  Scenario: Check user can able to save personal data without signature

 
    Then User click on profile icon
    Then User click on personal information link
    Then click on save and continue button
    Then user will get the error message

  @ProviderProfileTC7

  Scenario: Check user can able to edit the existing data in personal information

 
    Then User click on profile icon
    Then User click on personal information link
    Then click on save and continue button
    Then user will get the error message

  @ProviderProfileTC8

  Scenario: Check user can able to add more than one education

 
    Then User click on profile icon
    Then User click on personal information link
    Then click on save and continue button
    Then user will get the error message

  @ProviderProfileTC9

  Scenario: Check user can able to add more than one medical registration

 
    Then User click on profile icon
    Then User click on personal information link
    Then click on save and continue button
    Then user will get the error message

@ProviderProfileTC10

  Scenario: Check user can able to remove the education data

 
    Then User click on profile icon
    Then User click on personal information link
    Then click on save and continue button
    Then user will get the error message

