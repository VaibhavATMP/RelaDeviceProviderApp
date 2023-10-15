@run
Feature: Docisn App Test Scenarios

  Background: Login DocisnPlus
    Given User click on docisn to launch the app
    Then User enter valid Username and valid Password
    Then User click on login button

  @ProviderApp_TC01
  Scenario: Provider can initiate the appointment from dashboard.
 
    Then User initiate the appointment.

  @ProviderApp_TC02
  Scenario: Provider click on HOPI and land on HOPI page
 
    Then User initiate the appointment.
    Then User click on HOPI and land on HOPI page

  @ProviderApp_TC03
  Scenario: Provider click on HOPI and add single HOPI
 
    Then User initiate the appointment.
    Then User click on HOPI and land on HOPI page
    Then User add single HOPI and save

  @ProviderApp_TC04
  Scenario: Provider can add details for particular HOPI
 
    #Then User initiate the appointment.
    Then User click on HOPI and land on HOPI page
    Then User add single HOPI and fill all details

  @ProviderApp_TC05
  Scenario: Provider can add customized HOPI
 
#    Then User initiate the appointment.
    Then User click on HOPI and land on HOPI page
    Then User can add customized HOPI

  @ProviderApp_TC06
  Scenario: Provider can edit details of added HOPI
 
    Then User initiate the appointment.
    #Then User click on HOPI and land on HOPI page
    #Then User add single HOPI and fill all details
    Then User can edit details of added HOPI

  @ProviderApp_TC07
  Scenario: Provider can delete added HOPI
 
#    Then User initiate the appointment.
    Then User click on HOPI and land on HOPI page
    Then User can delete added HOPI

  @ProviderApp_TC08
  Scenario: Provider should not able to add duplicate HOPI
 
#    Then User initiate the appointment.
    Then User click on HOPI and land on HOPI page
    Then User should not able to add duplicate HOPI

  @ProviderApp_TC09
  Scenario: Provider can click on Patient Info and land on patient info Page
 
    Then User initiate the appointment.
    Then User can click and land on patient info page

  @ProviderApp_TC010
  Scenario: Provider can click on Patient Info and verify patient info on that Page
 
    Then User initiate the appointment.
    Then User can click and land on patient info page
    Then User verify patient iformation

  @ProviderApp_TC011
  Scenario: Provider can click on Lifeline and land on lifeline Page
 
    Then User initiate the appointment.
    Then User can click and land on patient info page
    Then User can click on Lifeline and land on lifeline Page

  @ProviderApp_TC012
  Scenario: Provider can click on Lifeline and apply different filters of lifeline
 
    Then User initiate the appointment.
    Then User can click and land on patient info page
    Then User can click on Lifeline and land on lifeline Page
    Then User can apply different filters

  @ProviderApp_TC013
  Scenario: Provider can click on Reports and Records and see reports
 
    Then User initiate the appointment.
    Then User can click and land on patient info page
    Then User can click on Reports and Records to see Reports and Records

  @ProviderApp_TC014
  Scenario: Provider can click on Reports and Records and switch between different types of Reports
 
    Then User initiate the appointment.
    Then User can click and land on patient info page
    Then User can click on Reports and Records and switch between different types of Reports

  @ProviderApp_TC015
  Scenario: Provider can click and land on vitals page
 
    Then User initiate the appointment.
    Then User can click and land on vitals page

  @ProviderApp_TC016
  Scenario: Provider can add value for single vital
 
    Then User initiate the appointment.
    Then User can click and land on vitals page
    Then User can add any one vital

  @ProviderApp_TC017
  Scenario: Provider can add value for all vital
 
    Then User initiate the appointment.
    Then User can click and land on vitals page
    Then User can add all vitals

  @ProviderApp_TC018
  Scenario: Provider can edit added vitals
 
    Then User initiate the appointment.
    Then User can click and land on vitals page
    Then User can edit added vitals

  @ProviderApp_TC019
  Scenario: Provider can see error messages for all vitals for wrong value
 
    Then User initiate the appointment.
    Then User can click and land on vitals page
    Then User can see error messages for all vitals for wrong value

  @ProviderApp_TC020
  Scenario: Provider can see vitals History
 
    Then User initiate the appointment.
    Then User can click and land on vitals page
    Then User able to see vitals history on click on vitals History

  @ProviderApp_TC021
  Scenario: Provider can see on clearing Height value weight also get clear
 
    Then User initiate the appointment.
    Then User can click and land on vitals page
    Then User able to see after clearing Body height,Boday weight also clear

  @ProviderApp_TC022
  Scenario: Provider can see on clearing BP Systolic value BP Dystolic also get clear
 
    Then User initiate the appointment.
    Then User can click and land on vitals page
    Then User able to see after clearing BP systolic,BP Dystolic also clear

  @ProviderApp_TC023
  Scenario: Provider should not able to save wrong(Out of Range) vital value.
 
    #Then User initiate the appointment.
    Then User can click and land on vitals page
    Then User can add wrong(out of Range) value of vitals but should not able to save

  @ProviderApp_TC024
  Scenario: Provider can click and land on Assesment Page
 
    Then User initiate the appointment.
    Then User can click and land on Assesment page

  @ProviderApp_TC025
  Scenario: Provider can click and see Assesment Settings page
 
    Then User initiate the appointment.
    Then User can click and land on Assesment page
    Then User click on Assesment settings


  @ProviderApp_TC026
  Scenario: Provider can click and change Assesment Settings
 
    Then User initiate the appointment.
    Then User can click and land on Assesment page
    Then User click on Assesment settings and change the settings

  @ProviderApp_TC027
  Scenario: Provider can add details for Neuro Assesments
 
    #Then User initiate the appointment.
    Then User can click and land on Assesment page
    Then User can add assesments details for Neuro

  @ProviderApp_TC028
  Scenario: Provider can edit details for Neuro Assesments
 
    Then User initiate the appointment.
    Then User can click and land on Assesment page
    Then User can edit assesments details for Neuro

  @ProviderApp_TC029
  Scenario: Provider can click on Overview and navigate to overview page
 
    Then User initiate the appointment.
    Then User can click and land on Overview page

  @ProviderApp_TC030
  Scenario: Provider can click on Drug Sensitivity and land on Drug Sensitivity Page
 
    Then User initiate the appointment.
    Then User can click and land on Overview page
    Then User can click on Drug Sensitivity and land on Drug Sensitivity Page

  @ProviderApp_TC031
  Scenario: Provider can add drugs in Drug Sensitivity
 
#    Then User initiate the appointment.
    Then User can click and land on Overview page
    Then User can click on Drug Sensitivity and land on Drug Sensitivity Page
    Then User can add drug in drug sensitivity

  @ProviderApp_TC032
  Scenario: Provider can edit drugs in Drug Sensitivity
 
#    Then User initiate the appointment.
    Then User can click and land on Overview page
    Then User can click on Drug Sensitivity and land on Drug Sensitivity Page
    Then User can edit drug in drug sensitivity

  @ProviderApp_TC033
  Scenario: Provider can delete drugs in Drug Sensitivity
 
#    Then User initiate the appointment.
    Then User can click and land on Overview page
    Then User can click on Drug Sensitivity and land on Drug Sensitivity Page
    Then User can delete drug in drug sensitivity

  @ProviderApp_TC034
  Scenario: Provider can click on Food Sensitivity and land on Food Sensitivity Page
 
#    Then User initiate the appointment.
    Then User can click and land on Overview page
    Then User can click on Food Sensitivity and land on Food Sensitivity Page

  @ProviderApp_TC035
  Scenario: Provider can add Food in Food Sensitivity
 
#    Then User initiate the appointment.
    Then User can click and land on Overview page
    Then User can click on Food Sensitivity and land on Food Sensitivity Page
    Then User can add Food in Food Sensitivity

  @ProviderApp_TC036
  Scenario: Provider can edit Food in Food Sensitivity
 
#    Then User initiate the appointment.
    Then User can click and land on Overview page
    Then User can click on Food Sensitivity and land on Food Sensitivity Page
    Then User can edit Food in Food Sensitivity

  @ProviderApp_TC037
  Scenario: Provider can delete Food in Food Sensitivity
 
#    Then User initiate the appointment.
    Then User can click and land on Overview page
    Then User can click on Food Sensitivity and land on Food Sensitivity Page
    Then User can delete Food in Food Sensitivity

  @ProviderApp_TC038
  Scenario: Provider can click on Environment Sensitivity and land on Environment Sensitivity Page
 
#    Then User initiate the appointment.
    Then User can click and land on Overview page
    Then User can click on Environment Sensitivity and land on Environment Sensitivity Page

  @ProviderApp_TC039
  Scenario: Provider can add Environment condition in Environment Sensitivity
 
#    Then User initiate the appointment.
    Then User can click and land on Overview page
    Then User can click on Environment Sensitivity and land on Environment Sensitivity Page
    Then User can add Environment condition in Environment Sensitivity

  @ProviderApp_TC040
  Scenario: Provider can edit Environment condition in Environment Sensitivity
 
#    Then User initiate the appointment.
    Then User can click and land on Overview page
    Then User can click on Environment Sensitivity and land on Environment Sensitivity Page
    Then User can edit Environment condition in Environment Sensitivity

  @ProviderApp_TC041
  Scenario: Provider can delete Environment condition in Environment Sensitivity
 
#    Then User initiate the appointment.
    Then User can click and land on Overview page
    Then User can click on Environment Sensitivity and land on Environment Sensitivity Page
    Then User can delete Environment condition in Environment Sensitivity

  @ProviderApp_TC042
  Scenario: Provider can click on Medication History and land on Medication History Page
 
#    Then User initiate the appointment.
    Then User can click and land on Overview page
    Then User can click on Medication History and land on Medication History Page

  @ProviderApp_TC042
  Scenario: Provider can add Medication in Medication History
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User can click on Medication History and land on Medication History Page
    Then User can add medication in Medication History

  @ProviderApp_TC043
  Scenario: Provider can edit Medication in Medication History
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User can click on Medication History and land on Medication History Page
    Then User can edit medication in Medication History

  @ProviderApp_TC044
  Scenario: Provider can delete Medication in Medication History
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User can click on Medication History and land on Medication History Page
    Then User can delete medication in Medication History

  @ProviderApp_TC045
  Scenario: Provider can click and navigate to Past Medical Condition
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User click and navigate to Past Medical Condition

  @ProviderApp_TC046
  Scenario: Provider can add Medical Condition in Past Medical Condition
 
#    Then User initiate the appointment.
    Then User can click and land on Overview page
    Then User click and navigate to Past Medical Condition
    Then User add medical condition in Past Medical Condtion

  @ProviderApp_TC047
  Scenario: Provider can edit Medical Condition in Past Medical Condition
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User click and navigate to Past Medical Condition
    Then User edit medical condition in Past Medical Condtion

  @ProviderApp_TC048
  Scenario: Provider can delete Medical Condition in Past Medical Condition
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User click and navigate to Past Medical Condition
    Then User delete medical condition in Past Medical Condtion

  @ProviderApp_TC049
  Scenario: Provider can click and navigate to Family History
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User click and navigate to Family History

  @ProviderApp_TC049
  Scenario: Provider can add family member in Family History
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User click and navigate to Family History
    Then User add family member in Family History

  @ProviderApp_TC050
  Scenario: Provider can delete family member in Family History
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User click and navigate to Family History
    Then User delete family member in Family History

  @ProviderApp_TC051
  Scenario: Provider can click and navigate to Past Surgical History
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User click and navigate to Past Surgical History

  @ProviderApp_TC052
  Scenario: Provider can add Past Surgical History
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User click and navigate to Past Surgical History
    Then User add Past Surgical History

  @ProviderApp_TC053
  Scenario: Provider can edit Past Surgical History
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User click and navigate to Past Surgical History
    Then User edit Past Surgical History

  @ProviderApp_TC054
  Scenario: Provider can delete Past Surgical History
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User click and navigate to Past Surgical History
    Then User delete Past Surgical History

  @ProviderApp_TC055
  Scenario: Provider can click and navigate to Problem List
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User click and navigate to Problem List

  @ProviderApp_TC056
  Scenario: Provider can add problems in Problem List
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User click and navigate to Problem List
    Then User add problems in Problem List

  @ProviderApp_TC057
  Scenario: Provider can edit problems in Problem List
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User click and navigate to Problem List
    Then User edit problems in Problem List

  @ProviderApp_TC058
  Scenario: Provider can delete problems in Problem List
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User click and navigate to Problem List
    Then User delete problems in Problem List

  @ProviderApp_TC059
  Scenario: Provider can click and navigate to Social History page
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User click on social History and navigate to Social History Page

  @ProviderApp_TC060
  Scenario: Provider can edit Social History
 
#    Then User initiate the appointment.
    #Then User can click and land on Overview page
    Then User click on social History and navigate to Social History Page
    Then User edit Social History

  @ProviderApp_TC061
  Scenario: Provider can click and navigate to Prescribe
 
    Then User initiate the appointment.
    Then User click on Prescribe

  @ProviderApp_TC062
  Scenario: Provider can change prescription settings.
 
    Then User initiate the appointment.
    Then User click on Prescribe
    Then User change prescription settings and save

  @ProviderApp_TC063
  Scenario: Provider can able to add medicine in Prescription
 
#    Then User initiate the appointment.
    Then User click on Prescribe
    Then User select and add medicine in prescription

  @ProviderApp_TC064
  Scenario: Provider can able to add medicine through template in Prescription
 
#    Then User initiate the appointment.
    Then User click on Prescribe
    Then User add medicine through template in prescription

  @ProviderApp_TC065
  Scenario: Provider can able to add medicine through Prescription History
 
#    Then User initiate the appointment.
    Then User click on Prescribe
    Then User add medicine through Prescription History

  @ProviderApp_TC066
  Scenario: Provider can able to add medicine as a favourite medicine
 
#    Then User initiate the appointment.
    Then User click on Prescribe
    Then User add medicine as a favourite medicine

  @ProviderApp_TC067
  Scenario: Provider can able to see after successfully added prescription
 
#    Then User initiate the appointment.
    Then User click on Prescribe
    Then User add medicine and see successfull popup

  @ProviderApp_TC068
  Scenario: Provider can able to edit added prescription
 
#    Then User initiate the appointment.
    Then User click on Prescribe
    Then User edit added medicine and save

  @ProviderApp_TC069
  Scenario: Provider can able to delete added prescription
 
#    Then User initiate the appointment.
    Then User click on Prescribe
    Then User delete added medicine and save

  @ProviderApp_TC070
  Scenario: Provider can see successfull popup on deleting Prescribed medicine
 
    Then User initiate the appointment.
    Then User click on Prescribe
    Then User verify delete successfull popup msg text

  @ProviderApp_TC071
  Scenario: Provider can click and navigate to Diagnosis
 
    Then User initiate the appointment.
    Then User click on Diagnosis

  @ProviderApp_TC072
  Scenario: Provider can click and navigate to AddDiagnosis
 
    Then User initiate the appointment.
    Then User click on Diagnosis
    Then User click on AddDiagnosis

  @ProviderApp_TC073
  Scenario: Provider can able to add Diagnosis
 
    Then User initiate the appointment.
    Then User click on Diagnosis
    Then User click on AddDiagnosis
    Then User add Diagnosis

  @ProviderApp_TC074
  Scenario: Provider can able to search add Diagnosis
 
    Then User initiate the appointment.
    Then User click on Diagnosis
    Then User click on AddDiagnosis
    Then User search and add Diagnosis

  @ProviderApp_TC074
  Scenario: Provider can able to search add Diagnosis
 
   # Then User initiate the appointment.
    Then User click on Diagnosis
    Then User click on AddDiagnosis
    Then User search and add Diagnosis

  @ProviderApp_TC075
  Scenario: Provider can able to search add Diagnosis
 
   # Then User initiate the appointment.
    Then User click on Diagnosis
    Then User click on AddDiagnosis
    Then User search and delete Diagnosis

  @ProviderApp_TC076
  Scenario: Provider can click and navigate to Patient Instruction
 
   # Then User initiate the appointment.
    Then User click on Patient Instruction

  @ProviderApp_TC077
  Scenario: Provider can add Patient Instructions
 
   # Then User initiate the appointment.
    Then User click on Patient Instruction
    Then User add Patient Instructions

  @ProviderApp_TC078
  Scenario: Provider can click and navigate to Investigation
 
   # Then User initiate the appointment.
    Then User click on Investigation

  @ProviderApp_TC079
  Scenario: Provider can add Investigation
 
   # Then User initiate the appointment.
    Then User click on Investigation
    Then User add Investigation Lab Order

  @ProviderApp_TC080
  Scenario: Provider can click and navigate to FollowUp
 
   # Then User initiate the appointment.
    Then User click on followUp

  @ProviderApp_TC081
  Scenario: Provider can add Follow Up
 
    Then User initiate the appointment.
    Then User click on followUp
    Then User add followUp

  @ProviderApp_TC082
  Scenario: Provider can click and navigate to Refer Doctor
 
   # Then User initiate the appointment.
    Then User click on refer Doctor

  @ProviderApp_TC083
  Scenario: Provider can Refer another Doctor
 
   # Then User initiate the appointment.
    Then User click on refer Doctor
    Then User refer another Doctor

  @ProviderApp_TC084
  Scenario: Provider can click and preview end encounter
 
   # Then User initiate the appointment.
    Then User click on preview

  @ProviderApp_TC085
  Scenario: Provider can click and end encounter
 
   # Then User initiate the appointment.
    Then User click on end encounter and send pdf also




















