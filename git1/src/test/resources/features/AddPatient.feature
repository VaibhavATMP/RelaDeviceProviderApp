@run
Feature: Docisn App Test Scenarios

  Background: Login DocisnPlus
    Given User click on docisn to launch the app
    Then User enter valid Username and valid Password
    Then User click on login button

@ProviderAddPatientPage
Scenario: ProviderApp Addpatient in Docisn
    Then click on menu section
    Then click on mypatients
    Then click on add patient button
    Then enter the patient details
    Then click on the add button

@ProviderAddPatientNegativeScenarios-1
Scenario: Addpatient without enter mobile number
    Then click on menu section
    Then click on mypatients
    Then click on add patient button
    Then enter the details
    Then click on the add button
    Then user will get the warning mesage
@ProviderAddPatientNegativeScenarios-2
Scenario:Addpatient without name
    Then click on menu section
    Then click on mypatients
    Then click on add patient button
    Then enter patient details
    Then click on the add button
    Then user will see the warning message

@ProviderAddPatientNegativeScenarios-3
Scenario:Add patient without email
    Then click on menu section
    Then click on mypatients
    Then click on add patient button
    Then enter the email field details
    Then click on the add button
    Then user should get the error message
@ProviderAddPatientNegativeScenarios-4

  Scenario: Addpatient with invalid email
    Then click on menu section
    Then click on mypatients
    Then click on add patient button
    Then enter the email details
    Then click on the add button
    Then app will through a error message.

@ProviderAddPatientNegativeScenarios-5

  Scenario: Check mobile number validation
  Then click on menu section
    Then click on mypatients
    Then click on add patient button
    Then enter the mobile number details
    Then click on the add button
    Then user will get the error message.
@ProviderAddPatientNegativeScenarios-6

  Scenario: Check the name field validation
  Then click on menu section
    Then click on mypatients
    Then click on add patient button
    Then enter the name details
    Then click on the add button
    Then user will get the error message for name field.

@ProviderAddPatientNegativeScenarios-7

  Scenario: Check the mobile number field validation
    Then click on menu section
    Then click on mypatients
    Then click on add patient button
    Then enter the mobile details
    Then click on the add button
    Then application should through a error message

@ProviderAddPatientNegativeScenarios-8

  Scenario: Check app is allowing to add patient without enter mandatory fields
    Then click on menu section
    Then click on mypatients
    Then click on add patient button
    Then check the error message

@ProviderAddPatientNegativeScenarios-9

  Scenario: Check app is allowing to add already existing patient
    Then click on menu section
    Then click on mypatients
    Then click on add patient button
    Then enter the patient details
    Then click on the add button
    Then user will get the patient already exist message

@ProviderAddPatientNegativeScenarios-10

Scenario: User can able to see the basic info details
    Then click on menu section
    Then click on mypatients
    Then click on patient in recent consultations
    Then check the basic info details
    Then check the patient basic info details

@ProviderAddPatientNegativeScenarios-11

Scenario: User can able to see the patient basic info details
    Then click on menu section
    Then click on mypatients
    Then click on patient in recent consultations
    Then check the appointment details

@ProviderAddPatientNegativeScenarios-12

  Scenario: User can able to see the appointment related details
    Then click on menu section
    Then click on mypatients
    Then click on patient in recent consultations
    Then click on appointment details
    Then check the user appointment details

@ProviderAddPatientNegativeScenarios-13

  Scenario: Check page is redirecting to appointment details screen on click of view more
    Then click on menu section
    Then click on mypatients
    Then click on patient in recent consultations
    Then click on appointment details
    Then click on view more

  @ProviderAddPatientNegativeScenarios-14

  Scenario: Check user can able to see the reports and records
    Then click on menu section
    Then click on mypatients
    Then click on patient in recent consultations
    Then click on reports and records

  @ProviderAddPatientNegativeScenarios-15

  Scenario: Check user can able to see the deseases on click of overview
    Then click on menu section
    Then click on mypatients
    Then click on patient in recent consultations
    Then click on overview