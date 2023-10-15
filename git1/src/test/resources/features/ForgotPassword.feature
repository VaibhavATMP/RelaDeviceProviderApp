@run
  Feature: Docisn App Test Scenarios

    @ProviderApp_TC08
    Scenario: Provider can click on Forgot password.
      Given User click on docisn to launch the app
      Then User click on ForgotPassword and land on forgot password page.

    @ProviderApp_TC09
    Scenario: Provider can enter valid MobNo,OTP and Submit.
      Given User click on docisn to launch the app
      Then User click on ForgotPassword and land on forgot password page.
      Then User enter valid mobNo,OTP and click on submit.

    @ProviderApp_TC010
    Scenario: Provider can set the password successfully.
      Given User click on docisn to launch the app
      Then User click on ForgotPassword and land on forgot password page.
      Then User enter valid mobNo,OTP and click on submit.
      Then user entered same password in new password and confirm password fields.

    @ProviderApp_TC011
    Scenario: Provider should not able to submit when mandatory fields(MobNo and OTP) are blank.
      Given User click on docisn to launch the app
      Then User click on ForgotPassword and land on forgot password page.
      Then User click on submit without filling mandatory fields.
      Then User should get proper error messages for all mandatory fields.

    @ProviderApp_TC012
    Scenario: Provider should not able to submit when mandatory fields are empty/blank.
      Given User click on docisn to launch the app
      Then User click on ForgotPassword and land on forgot password page.
      Then User enter valid mobNo,OTP and click on submit.
      Then User click on submit without filling newPassword and ConfirmPassword fields.
      Then User should get proper error messages for mandatory fields.
