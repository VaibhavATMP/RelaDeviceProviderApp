@run
Feature: Provider App Test Cases

  Background: Login DocisnPlus
    Given User click on docisn to launch the app
    Then User enter valid Username and valid Password
    Then User click on login button

@Appointments_TC1
  Scenario: To check if Doctor is directed to appointments history page on click of appointments from menu

   
  Then User click on Menu Button
  Then User clicks on appointments history

@Appointments_TC2
  Scenario: To check if Doctor can search for particular patient
 
    Then User click on Menu Button
    Then User clicks on appointments history
    Then User clicks on Patient Name in appointments

@Appointments_TC3
  Scenario: To check if Doctor has any appointment for today
 
    Then User click on Menu Button
    Then User clicks on appointments history
    Then User clicks on today's appointment

@Appointments_TC4
  Scenario: To check if Doctor is shown default message if no appointment for today
 
    Then User click on Menu Button
    Then User clicks on appointments history
    Then User clicks on today's appointment
    Then User is shown default message

@Appointments_TC5
  Scenario: To check if Doctor can able to click on filter
 
  Then User click on Menu Button
    Then User clicks on appointments history
    Then click on filter icon

@Appointments_TC6
  Scenario: To check if Doctor can able to rescheudle the appointments
 
    Then User click on Menu Button
    Then User clicks on appointments history
     Then User reschedule the appointment.

@Appointments_TC7
  Scenario: To check if Doctor can able to cancel the appointments
 
    Then User click on Menu Button
    Then User clicks on appointments history
    Then User cancel the appointment.

@Appointments_TC8
  Scenario: To check if Doctor can able to initiate the call
 
    Then User click on Menu Button
    Then User clicks on appointments history
    Then click on video icon

@Appointments_TC9
  Scenario: To check if Doctor can able to see the completed appointments
 
    Then User click on Menu Button
    Then User clicks on appointments history
    Then click on completed appointments

@Appointments_TC10
  Scenario: To check if Doctor can able to see the prescription for completed appointments
 
    Then User click on Menu Button
    Then User clicks on appointments history
    Then click on prescription

@Appointments_TC11
  Scenario: check if Doctor can able to click on filter option
 
    Then User click on Menu Button
    Then User clicks on appointments history
    Then click on filter icon

  @Appointments_TC12
  Scenario: check if Doctor can able to filter the appointments
 
    Then User click on Menu Button
    Then User clicks on appointments history
    Then click on filter icon
    Then select click on drop down and select the booked text
    Then click on the submit button

  @Appointments_TC18
  Scenario: check if Doctor can able to filter the video consultation appointments
 
    Then User click on Menu Button
    Then User clicks on appointments history
    Then click on filter icon
    Then click on video consultation radio button
    Then click on the submit button

  @Appointments_TC19
  Scenario: check if Doctor can able to filter the in-clinic appointments
 
    Then User click on Menu Button
    Then User clicks on appointments history
    Then click on filter icon
    Then click on in-clinic radio button
    Then click on the submit button

@Appointments_TC19
  Scenario: check if Doctor can able to filter appointments based on clinic selection
 
    Then User click on Menu Button
    Then User clicks on appointments history
    Then click on filter icon
    Then click the drop down and select the clinic
    Then click on the submit button
