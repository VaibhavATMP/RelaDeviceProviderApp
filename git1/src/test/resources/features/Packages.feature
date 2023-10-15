@run
Feature: DocisnApp Test Scenarios
  Background: Login DocisnPlus
    Given User click on docisn to launch the app
    Then User enter valid Username and valid Password
    Then User click on login button

@ProviderAppPackagesPage-1

  Scenario: ProviderApp add package to DocisnPlus


    Then User click on Menu Button
    Then select packages
    Then click on add icon
    Then Select end date
    Then enter all the mandatory fields
    Then select package type
    Then select num of consultation
    Then select num of office visits
    Then select the duration
    Then enter chronic
    Then select the clinic
    Then enter package description
    Then enter package price details
    Then Click on the submit button

@ProviderAppPackagesPage-2

Scenario: check user able to open the existing package

 
    Then User click on Menu Button
    Then select packages
    Then click existing package

@ProviderApppackagesNgativeScenarios-3

Scenario: Check user can able to update the existing package

  Given User click on docisn to launch the app
  Then enter data in the fields
  Then click on login button
  Then click on menu section
  Then select packages
  Then click existing package
  Then update any data
  Then click on update button

  @ProviderApppackagesNgativeScenarios-4
  Scenario: Check user can able to inactive the existing package

 
    Then click on menu section
    Then select packages
    Then click existing package
    Then click on edit icon
    Then click on inactive radio button
    Then click on update button

@ProviderApppackagesNgativeScenarios-5
  Scenario: Check user can able to active the inactive package

 
    Then click on menu section
    Then select packages
    Then click existing package
    Then click on edit icon
    Then click on active radio button
    Then click on update button

  @ProviderApppackagesNgativeScenarios-6
  Scenario: Check user can able to add without package name

 
    Then click on menu section
    Then select packages
    Then enter data without package name
    Then user will get error message for package name field

  @ProviderApppackagesNgativeScenarios-7
  Scenario: Check user can able to add package without enter mandatory fields

 
    Then click on menu section
    Then select packages
    Then Click on the submit button
    Then user will get error message for all the mandatory fields

@ProviderApppackagesNgativeScenarios-8
  Scenario: Check user can able to add package without price

 
    Then click on menu section
    Then select packages
    Then enter all the data in the fields
    Then user will get error message for actual price field



