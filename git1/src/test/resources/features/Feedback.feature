@run
  Feature: Docisn App Test Scenarios
    Background: Login DocisnPlus
      Given User click on docisn to launch the app
      Then User enter valid Username and valid Password
      Then User click on login button
    @ProviderApp_TC022
    Scenario: Provider can click on Feedback and see Total Ratings and Reviews.
     
      Then User click on Menu Button
      Then User click on feedback and see Total Ratings and Reviews.

    @ProviderApp_TC023
    Scenario: Provider can click on Feedback and see patient Details who had given feedback.
     
      Then User click on Menu Button
      Then User click on feedback and see patients who had given feedback.

    @ProviderApp_TC024
    Scenario: Provider can apply filter Latest One First and FourFive Star Rating.
     
      Then User click on Menu Button
      Then User can apply filter Newest One First and Four Five Star.

    @ProviderApp_TC025
    Scenario: Provider can apply filter Latest  One First and Three Star Rating.
     
      Then User click on Menu Button
      Then User can apply filter Latest One First and Three Star Rating.

    @ProviderApp_TC026
    Scenario: Provider can apply filter Latest One First and Zero-Two Star Rating.
     
      Then User click on Menu Button
      Then User can apply filter Latest One First and Zero-Two Star Rating.

    @ProviderApp_TC027
    Scenario: Provider can apply filter Oldest One First and All.
     
      Then User click on Menu Button
      Then User can apply filter Oldest One First and All.

    @ProviderApp_TC028
    Scenario: Provider can apply filter Oldest One First and Four-Five Star Rating.
     
      Then User click on Menu Button
      Then User can apply filter Oldest One First and Four-Five Star Rating.

    @ProviderApp_TC029
    Scenario: Provider can apply filter Oldest One First and Three Star Rating.
     
      Then User click on Menu Button
      Then User can apply filter Oldest One First and Three Star Rating.

    @ProviderApp_TC030
    Scenario: Provider can apply filter Oldest One First and Zero-Two Star Rating.
     
      Then User click on Menu Button
      Then User can apply filter Oldest One First and Zero-Two Star Rating.
