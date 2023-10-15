@run
Feature: Docisn App Test Scenarios
    Background: Login DocisnPlus
        Given User click on docisn to launch the app
        Then User enter valid Username and valid Password
        Then User click on login button

@ProviderAppSettingsTC_1
Scenario: To check if settings is clickable in menu
 
    Then User clicks on menu
    Then User clicks on settings

@ProviderAppSettingsAccountsTC_1
Scenario: To check if Accounts is clickable in settings
 
    Then User clicks on menu
    Then User clicks on settings
    Then User clicks on accounts

@ProviderAppSettingsAccountsTC_2
Scenario: To check if user can add block date fields
 
    Then User clicks on menu
    Then User clicks on settings
    Then User clicks on accounts
    Then User click on Add button

@ProviderAppSettingsAccountsTC_3
Scenario: To check if user can add multiple block date fields if the previous fileds are empty
 
    Then User clicks on menu
    Then User clicks on settings
    Then User clicks on accounts
    Then User click on Add button multiple times

@ProviderAppSettingsAccountsTC_4
Scenario: To check if user can add block dates
 
    Then User clicks on menu
    Then User clicks on settings
    Then User clicks on accounts
    Then User adds block date

@ProviderAppSettingsAccountsTC_5
Scenario: To check if user can remove added block dates
 
    Then User clicks on menu
    Then User clicks on settings
    Then User clicks on accounts
    Then User removes block date

    @ProviderAppSettingsAccountsTC_6
    Scenario: To check if user can add multiple block dates
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on accounts
        Then User adds block date
        Then User clicks on accounts
        Then User adds another block dates

    @ProviderAppSettingsAccountsTC_7
    Scenario: To check if user can add multiple time slots in the same block date
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on accounts
        Then User adds block date with multiple time slots

    @ProviderAppSettingsAccountsTC_8
    Scenario: To check if user can delete time slots in the block date
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on accounts
        Then User adds block date with multiple time slots
        Then User deletes added time slot


    @ProviderAppSettingsAccountsTC_9
    Scenario: To check if user can edit time slots in the block date
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on accounts
        Then User adds block date with multiple time slots
        Then User edits added time slot

    @ProviderAppSettingsAccountsTC_10
    Scenario: To check if user can make chat settings for before and after appointment
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on accounts
        Then User makes chat settings

    @ProviderAppSettingsAccountsTC_11
    Scenario: To check if user can set appointment duration
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on accounts
        Then User sets appointment duration

    @ProviderAppSettingsClinicalTC_1
    Scenario: To check if clinical is clickable in settings and user is directed to clinical settings page
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on clinical

    @ProviderAppSettingsClinicalTC_2
    Scenario: To check if user can make follow up settings in clinical settings page
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on clinical
        Then User sets number of follow up consultations for certain days

    @ProviderAppSettingsClinicalTC_3
    Scenario: To check if user can set video consultation fee in clinical settings page
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on clinical
        Then User sets video consultation fee

    @ProviderAppSettingsClinicalTC_4
    Scenario: To check if user can set walk in consultation fee in clinical settings page
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on clinical
        Then User sets walk in consultation fee

    @ProviderAppSettingsExaminationTC_1
    Scenario: To check if user can land on Examination page in settings
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on examination

    @ProviderAppSettingsExaminationTC_2
    Scenario: To check if user can land on Assessments settings page in Examination
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on examination
        Then User clicks on Assessments settings


    @ProviderAppSettingsExaminationTC_3
    Scenario: To check if user can enable all assessments in Assessments settings page
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on examination
        Then User clicks on Assessments settings
        Then User enables all assesments in assessment settings

    @ProviderAppSettingsExaminationTC_4
    Scenario: To check if user can disable all assessments in Assessments settings page
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on examination
        Then User clicks on Assessments settings
        Then User disables all assesments in assessment settings

    @ProviderAppSettingsExaminationTC_5
    Scenario: To check if user can enable few Assessments in Assessments
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on examination
        Then User clicks on Assessments settings
        Then User makes assessment settings

    @ProviderAppSettingsExaminationTC_6
    Scenario: To check if user is able to land on prescription settings page
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on examination
        Then User clicks on Prescription settings

    @ProviderAppSettingsExaminationTC_7
    Scenario: To check if user is able to enable all fields in prescription settings page
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on examination
        Then User clicks on Prescription settings
        Then User checks for the fields that are enabled and disabled

    @ProviderAppSettingsExaminationTC_8
    Scenario: To check if user is able to make settings for enabled fields in prescription settings page
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on examination
        Then User clicks on Prescription settings
        Then User makes changes for enabled fields

    @ProviderAppSettingsPrivacyPolicyTC_1
    Scenario: To check if user is able to view privacy policy
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on examination
        Then User clicks on Privacy policy in settings

    @ProviderAppSettingsLogOut_1
    Scenario: To check if user is able to log out of the application
         
        Then User clicks on menu
        Then User clicks on settings
        Then User clicks on examination
        #Then User logs out of the application















