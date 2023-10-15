@run
Feature: Docisn App Test Scenarios
  Background: Login DocisnPlus
    Given User click on docisn to launch the app
    Then User enter valid Username and valid Password
    Then User click on login button
  @ProviderApp_TC01
  Scenario: Provider can able to click on Template feature.
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page

  @ProviderApp_TC02
  Scenario: Provider can able to see bydefault show template radio button selected.
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User can see bydefault show template radio button selected.

  @ProviderApp_TC03
  Scenario: Provider can see allready created template list on click on Disease field.
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User can see allready created template list on click on Disease field.

  @ProviderApp_TC04
  Scenario: Provider can see and edit template by filling all mandatory fields with valid data
#    Given User click on docisn to launch the app
#    Then User enter valid Username and valid Password
#    Then User click on login button
#    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User can see and edit template by filling all mandatory fields with valid data

  @ProviderApp_TC05
  Scenario: Provider should not able to  see OR editTemplate without filling all mandatory fields.
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User not able to see OR editTemplate without filling all mandatory fields.

  @ProviderApp_TC06
  Scenario: Provider should able to edit template with valid Gender and Age group combination.
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User able to edit template by entering valid Gender and Age group combination.

  @ProviderApp_TC07
  Scenario: Provider can see by default No Templates message on landing on template page
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User can see by default No Templates message on landing on template page

  @ProviderApp_TC08
  Scenario: Provider user can click on create template and land on create template page.
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User can click on create template and land on create template page.

  @ProviderApp_TC09
  Scenario: Provider should not able to create empty template
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User can click on create template and land on create template page.
    Then User not able to create empty template

  @ProviderApp_TC010
  Scenario: Provider  can create template by adding only medicines
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User can click on create template and land on create template page.
    Then User create template by adding only medicines

  @ProviderApp_TC011
  Scenario: Provider should able to see Lab orders only by enabling toggle button.
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User can click on create template and land on create template page.
    Then User can able to see Lab orders only by enabling toggle button.

  @ProviderApp_TC012
  Scenario: Provider should able to create template by adding only any single Lab Order.
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User can click on create template and land on create template page.
    Then User can create template by adding only any single Lab Order.

  @ProviderApp_TC013
  Scenario: Provider should able to create template by adding all Lab Orders.
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User can click on create template and land on create template page.
    Then User can create template by adding all Lab Orders.

  @ProviderApp_TC014
  Scenario: Provider should able to create template by adding medicine and Lab Orders.
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User can click on create template and land on create template page.
    Then User can create template by adding medicine and Lab Orders.

  @ProviderApp_TC015
  Scenario: Provider should able to list of Template on click on Disease Fiel in ShowTemplate
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User can see listOf Template on click on DiseaseField in showTemplate

  @ProviderApp_TC016
  Scenario: Provider should able to delete template before entering Line Of Line of Treatment.
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User click on Disease field and delete Template

  @ProviderApp_TC017
  Scenario: Provider should able to delete template entering LOT Gender and Age Group.
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User fill valid data and able to see template and delete template.

  @ProviderApp_TC018
  Scenario: Provider should able to edit Template or Disease Name
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User can edit template or Disease Name

  @ProviderApp_TC019
  Scenario: Provider should able to edit Line of Treatment in Template
 
    Then User click on Menu Button
    Then User click on Template option and land on Template page
    Then User can edit Line of Treatment























