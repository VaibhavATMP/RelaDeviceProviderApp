@run
Feature: Docisn App Test Scenarios

 Background: Login DocisnPlus
  Given User click on docisn to launch the app
  Then User enter valid Username and valid Password
  Then User click on login button

@ProviderAppTC_1
Scenario: ProviderApp Login to Docisn.
 
 @ProviderApp_TC02
Scenario: Provider Book video appointment using skip payment
#     
Then User click on BookAppointment
Then User fill all information
Then User click on skip payment and Book appointment successfully.
 @Appointments_TC3
Scenario: To check if Doctor can able to rescheudle the appointments
#     
Then User click on Menu Button
Then User clicks on appointments history
Then User reschedule the appointment.
Then click on back arrow
 @Appointments_TC4
Scenario: To check if Doctor can able to cancel the appointments
#    
Then User click on Menu Button
Then User clicks on appointments history
Then User cancel the appointment.
Then click on back arrow
 @Appointments_TC5
Scenario: To check if Doctor can able to initiate the call
Then User click on Menu Button
Then User clicks on appointments history
Then click on video icon
Then click on back arrow
