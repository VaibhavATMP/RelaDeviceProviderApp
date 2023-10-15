@run
Feature: DocisnApp Test Scenarios

  Background: Login DocisnPlus
    Given User click on docisn to launch the app
    Then User enter valid Username and valid Password
    Then User click on login button

@Providerchatscreen-1

  Scenario: Check Provider is able to see the chat screen in DocisnPlus
 
    Then click on menu section
    Then click on chat
    Then check chat screen is open or not

@Providerchatscreen-2

  Scenario: Check user can able to see all the chats
 
    Then click on menu section
    Then click on chat
    Then check all the chats are able to see

@Providerchatscreen-3

  Scenario: Check user can able to chat with the doctor
 
    Then click on menu section
    Then click on chat
    Then select any one chat in the list
    Then click on chat bar

@Providerchatscreen-4

  Scenario: Check doctor can able to search with particular patient
 
    Then click on menu section
    Then click on chat
    Then click on search tab and enter patient name

@Providerchatscreen-5

  Scenario: Check doctor can able to send pdf and image files
 
    Then click on menu section
    Then click on chat
    Then select any one chat in the list
    Then click on chat bar
    Then send pdf and image file
    Then click on send icon

@Providerchatscreen-6

  Scenario: Check doctor can able to add the chat settings
 
    Then click on menu section
    Then click on chat
    Then click on settings icon
    Then enable radio button
#   Then enter before and after appointment time
    Then click on the submit button



