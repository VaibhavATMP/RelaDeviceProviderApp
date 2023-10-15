@run
Feature: Docisn App Test Scenarios

  Background: Login DocisnPlus
    Given User click on docisn to launch the app
    Then User enter valid Username and valid Password
    Then User click on login button

  @ProviderApp_TC01
  Scenario: Provider Login and logout to Docisn plus


#  @ProviderApp_TC02
#  Scenario: Provider can set the password successfully.
#    Given User click on docisn to launch the app
#    Then User click on ForgotPassword and land on forgot password page.
#    Then User enter valid mobNo,OTP and click on submit.
#    Then user entered same password in new password and confirm password fields.

  @ProviderApp_TC03
  Scenario: Provider Book walkin appointment using Skip payment option
    Then User click on BookAppointment
    Then User fill all information
    Then User click on walkin type of appointment
    Then User click on skip payment and Book appointment successfully.


  @ProviderApp_TC05
  Scenario: Provider can reschedule the appointment from dashboard.
     Then User reschedule the appointment.

  @ProviderApp_TC06
  Scenario: Provider can cancel the appointment from dashboard.
     Then User cancel the appointment.

  @ProviderApp_TC07
  Scenario: Provider should able to create template by adding medicine and Lab Orders.
     Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User can click on create template and land on create template page.
    Then User can create template by adding medicine and Lab Orders.
    Then clicks on back arrow

  @ProviderApp_TC08
  Scenario: User can able to click on Patients and view details of patient
    Then User click on Menu Button
    Then click on mypatients
    Then click on patient and see patient Basic Info
    Then click on appointment details
    Then click on overview
    Then click on reports and records
    Then clicks on back arrow
    Then clicks on back arrow

  @ProviderApp_TC09
  Scenario: User can able to see appointments and Today's Appointment
    Then User click on Menu Button
    Then User clicks on appointments history
    Then User clicks on today's appointment
    Then clicks on back arrow

  @ProviderApp_TC010
  Scenario: Provider can create package
    Then User click on Menu Button
    Then select packages
    Then click on add icon
    Then Select end date
    Then enter all the mandatory fields
    Then select package type
    Then select the clinic
    Then select num of consultation
    Then select num of office visits
    Then select consultation Frequency
    Then select the duration
    Then enter chronic
    Then enter package description
    Then enter package price details
    Then Click on the submit button
    Then clicks on back arrow

  @ProviderApp_TC011
  Scenario: Check user can able to chat with the patient
    Then User click on Menu Button
    Then click on chat
    Then select any one chat in the list
    Then clicks on back arrow
    Then clicks on back arrow

  @ProviderApp_TC012
  Scenario: Verify User can see payments on Payments Screen.
    Then User click on Menu Button
    Then User click on Payments
    Then User can see transactions
    Then clicks on back arrow

  @ProviderApp_TC013
  Scenario: Provider can raise complaint using customer support.
    Then User click on Menu Button
    Then user click on customerSupport and raise the complaint

  @ProviderApp_TC014
  Scenario: Provider navigate to particular page on click(Account,Clinical,Examination).
    Then User click on Menu Button
    Then User click on Settings option in menu
    Then User clicks on accounts
    Then clicks on back arrow
    Then User clicks on clinical
    Then clicks on back arrow
    Then User clicks on examination
    Then clicks on back arrow
    Then User click on schedule
    Then clicks on back arrow
    Then clicks on back arrow

  @ProviderApp_TC04
  Scenario: Provider can initiate and complete patient screening.
    Then User initiate the appointment.
    Then User can click and land on patient info page
    Then User click outside
    Then User click on HOPI and land on HOPI page
    Then User add single HOPI and save
    Then User can click and land on vitals page
    Then User can add all vitals
    Then User click on Diagnosis
    Then User click on AddDiagnosis
    Then User add Diagnosis
    Then User click on Prescribe
    Then User select and add medicine in prescription
    Then User click on end encounter and send pdf also


  #  @ProviderApp_TC04
#  Scenario: Provider can initiate and complete patient screening.
#    Given User click on docisn to launch the app
#    Then User enter valid Username and valid Password
#    Then User click on login button
#    Then User initiate the appointment.
#    Then User can click and land on patient info page
#    Then User click outside
#    Then User click on HOPI and land on HOPI page
#    Then User add single HOPI and save
#    Then User can click and land on vitals page
#    Then User can add all vitals
#    Then User can click and land on Assesment page
#    Then User can add assesments details for Neuro
#    Then User can click and land on Overview page
#    Then User can click on Drug Sensitivity and land on Drug Sensitivity Page
#    Then User can add drug in drug sensitivity
#    Then User click on Diagnosis
#    Then User click on AddDiagnosis
#    Then User add Diagnosis
#    Then User click on Prescribe
#    Then User select and add medicine in prescription
#    Then User click on Patient Instruction
#    Then User add Patient Instructions
#    Then User click on Investigation
#    Then User add Investigation Lab Order
#    Then User click on followUp
#    Then User add followUp
#    Then User click on refer Doctor
#    Then User refer another Doctor
#    Then User click on preview
#    Then User click on end encounter and send pdf also
##    Then User click on Menu Button
##    Then User click on Settings option in menu
##    Then User click on Logout and logout successfully