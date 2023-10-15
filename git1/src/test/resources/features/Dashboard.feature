@run
  Feature: Docisn App Test Scenarios

    Background: Login DocisnPlus
      Given User click on docisn to launch the app
      Then User enter valid Username and valid Password
      Then User click on login button

    @ProviderApp_TC01
    Scenario: Provider should able to click and navigate to Reschedule page
 
      Then User click on Reschedule and land on Reschedule page

    @ProviderApp_TC02
    Scenario: Provider can reschedule the appointment from dashboard.
 
      Then User reschedule the appointment.

    @ProviderApp_TC03
    Scenario: Provider should not able to reschedule without selecting time.
 
      Then User try to reschedule without selecting time.

    @ProviderApp_TC04
    Scenario: Provider should not able to reschedule without giving Reason.
 
      Then User try to reschedule without giving Reason.

    @ProviderApp_TC05
    Scenario: Provider should able to reschedule appointment in next week
 
      Then User try to reschedule apt in future week

    @ProviderApp_TC06
    Scenario: Provider should able to reschedule appointment on Future Dates.
 
      Then User try to reschedule on future dates.

    @ProviderApp_TC07
    Scenario: Provider should not able to reschedule appointment on past dates.
 
      Then User try to reschedule apt on past dates
    @ProviderApp_TC08
    Scenario: Provider should able to see same patient details on reschedule page
 
      Then User verify patient details on reschedule page
    @ProviderApp_TC09
    Scenario: Provider should able to see RE_SCHEDULED Tag for Rescheduled appointment
 
      #Then User reschedule the appointment.
      Then User verify for reschedule Apt tag Rescheduled should show
    @ProviderApp_TC010
    Scenario: Provider can cancel the appointment from dashboard.
      Then User cancel the appointment.

    @ProviderApp_TC011
    Scenario: Provider should navigate to cancel page on click on Cancel
 
      Then User click on cancel and navigate to cancel page

    @ProviderApp_TC012
    Scenario: Provider should not able to cancel the appointment without giving reason.
 
      Then User try to cancel the appointment without giving reason.

    @ProviderApp_TC013
    Scenario: Provider should able to Dismiss the cancelation process for the appointment.
 
      Then User click on Dismiss to stop cancellation process.

 
@ProviderApp_TC014
    Scenario: Provider can initiate the appointment from dashboard.
 
      Then User initiate the appointment.
    @ProviderApp_TC014
    Scenario: Provider can complete payment for the appointment(Booked using skip payment) from dashboard.
 
      Then User complete the payment for appointment.

    @ProviderApp_TC015
    Scenario: Provider can see the notificatios.
 
      Then User click on notification and see all notifications.

    @ProviderApp_TC016
    Scenario: Provider can click on profile and view profile.
 
      Then User click on profile and land on profile page.

#    @ProviderApp_TC017
#    Scenario: Provider can switch between clinics to see appointments
 
#      Then User click on hospital and switch between hospitals.
#
#    @ProviderApp_TC018
#    Scenario: Provider can initiate the appointment from dashboard after switch to another hospital.
 
#      Then User click on hospital and switch to another hospitals.
#      Then User initiate the appointment.