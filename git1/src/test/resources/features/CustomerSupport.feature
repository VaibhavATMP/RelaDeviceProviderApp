@run
  Feature: Docisn App Test Scenarios

    Background: Login DocisnPlus
      Given User click on docisn to launch the app
      Then User enter valid Username and valid Password
      Then User click on login button

    @ProviderApp_TC019
    Scenario: Provider can raise complaint using customer support.
 
      Then User click on Menu Button
      Then user click on customerSupport and raise the complaint

    @ProviderApp_TC020
    Scenario: Provider should not able to submit without entering mandatory fields.
 
      Then User click on Menu Button
      Then user click on customerSupport and try to submit without entering mandatory fields.

    @ProviderApp_TC021
    Scenario: Verify contactNo. Name and email of Dr. on customer support page.
 
      Then User click on Menu Button
      Then user click on customerSupport and verify Name,No,Email.
