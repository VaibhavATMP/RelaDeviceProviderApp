@run
  Feature: Docisn App Test Scenarios
    Background: Login DocisnPlus
      Given User click on docisn to launch the app
      Then User enter valid Username and valid Password
      Then User click on login button
    @ProviderApp_TC0
    Scenario: Provider can click on schedule and land on default schedule page.
 
      Then User click on Menu Button
      Then User click on Settings option in menu
      Then User click on schedule
      Then User can see default schedule page.

    @ProviderApp_TC00
    Scenario: Provider can set default schedule for Monday
 
    Then User click on Menu Button
    Then User click on Settings option in menu
      Then User click on schedule
      Then User can set default schedule for Monday.

    @ProviderApp_TC00
    Scenario: Provider can set default schedule for Tuesday
 
    Then User click on Menu Button
    Then User click on Settings option in menu
      Then User click on schedule
      Then User can set default schedule for Tuesday.

    @ProviderApp_TC034
    Scenario: Provider should get error message when time duration is overlapping for that day.
 
    Then User click on Menu Button
    Then User click on Settings option in menu
      Then User click on schedule
      Then User try to make shcedule for which timing is overlapping.

    @ProviderApp_TC035
    Scenario: Provider should not able to add schedule without selecting cinic Name
 
    Then User click on Menu Button
    Then User click on Settings option in menu
      Then User click on schedule
      Then User try to add shcedule without clinicName.

    @ProviderApp_TC036
    Scenario: Provider should have atleast one schedule and not able to delete that one.
 
    Then User click on Menu Button
    Then User click on Settings option in menu
      Then User click on schedule
      Then User try to delete that minimum/atleast one schedule for day.

    @ProviderApp_TC037
    Scenario: Provider can edit the existing schedule
 
    Then User click on Menu Button
    Then User click on Settings option in menu
      Then User click on schedule
      Then User edit the existing schedule

    @ProviderApp_TC038
    Scenario: Provider can delete the existing schedule for any day if it is more than one.
 
    Then User click on Menu Button
    Then User click on Settings option in menu
      Then User click on schedule
      Then User delete the existing schedule
