@run
  Feature: Docisn App Test Scenarios

    Background: Login DocisnPlus
      Given User click on docisn to launch the app
      Then User enter valid Username and valid Password
      Then User click on login button

@ProviderApp_TC02
    Scenario: Provider Book video appointment using skip payment
      
      Then User click on BookAppointment
      Then User fill all information
      Then User click on skip payment and Book appointment successfully.

@ProviderApp_TC03
    Scenario: Provider Book video appointment using Proceed To Pay option
      
      Then User click on BookAppointment
      Then User fill all information
      Then User click on proceed to pay and Book appointment Successfully.

@ProviderApp_TC04
    Scenario: Provider Book walkin appointment using Proceed To Pay option
      
      Then User click on BookAppointment
      Then User fill all information
      Then User click on walkin type of appointment
      Then User click on proceed to pay and Book appointment Successfully.

@ProviderApp_TC05
    Scenario: Provider Book walkin appointment using Skip payment option
      
      Then User click on BookAppointment
      Then User fill all information
      Then User click on walkin type of appointment
      Then User click on skip payment and Book appointment successfully.

@ProviderApp_TC06
    Scenario: Provider Book video appointment for family member using skip payment
      
      Then User click on BookAppointment
      Then User fill all information of family member
      Then User click on skip payment and Book appointment successfully.

@ProviderApp_TC07
    Scenario: Provider Book walkin appointment for family member using Skip payment option
      
      Then User click on BookAppointment
      Then User fill all information of family member
      Then User click on walkin type of appointment
      Then User click on skip payment and Book appointment successfully.

@ProviderApp_TC08
    Scenario: Provider Book video appointment for different clinics using skip payment
      
      Then User click on BookAppointment
      Then User fill information of patient and select different clinic
      Then User click on skip payment and Book appointment successfully.

@ProviderApp_TC09
    Scenario: Provider Book walkin appointment for different clinics using skip payment
      
      Then User click on BookAppointment
      Then User fill information of patient and select different clinic
      Then User click on walkin type of appointment
      Then User click on skip payment and Book appointment successfully.

@ProviderApp_TC10
    Scenario: Provider Book video appointment for other patients using skip payment
      
      Then User click on BookAppointment
      Then User fill all information for patient Others
      Then User click on skip payment and Book appointment successfully.

    @ProviderApp_TC11
    Scenario: Provider Book video appointment for unregistered member in docisn platform
      
      Then User click on BookAppointment
      Then User fill all information of unregistered member
      Then User click on skip payment and observe

    @ProviderApp_TC012
    Scenario: Provider can see information auto populating on selecting registered patient.
#      Given User click on docisn to launch the app
#      Then User enter valid Username and valid Password
#      Then User click on login button
      Then User click on BookAppointment
      Then User select registered patient and see all information

    @ProviderApp_TC013
    Scenario: Provider can add symptomps while booking appointment
#      Given User click on docisn to launch the app
#      Then User enter valid Username and valid Password
#      Then User click on login button
      Then User click on BookAppointment
      Then User fill all information
      Then User add symptomps while booking appointment
      Then User click on skip payment and Book appointment successfully.

    @ProviderApp_TC014
    Scenario: Provider can not add duplicate symptomps while booking appointment
      Then User click on BookAppointment
      Then User fill all information
      Then User try to add duplicate symptomps while booking appointment

    @ProviderApp_TC015
    Scenario: Provider can cancel book appointment process
      Then User click on BookAppointment
      Then User fill all information
      Then User click on cancel and that appointmet should not get booked

    @ProviderApp_TC016
    Scenario: Provider can see the same patient details on Bill Reciept while booking Apt
      Then User click on BookAppointment
      Then User fill all information
      Then User click on proceed to pay and see billRecieptDetails.

    @ProviderApp_TC017
    Scenario: Provider can not able to book appointment without filling mandatory fields.
      Then User click on BookAppointment
      Then User try to book appointment without filling mandatory fields




