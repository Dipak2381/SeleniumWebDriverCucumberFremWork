Feature:

  @Testraja
Scenario: user can find nearest car dealer
        Given User already homepage
        When I click on find a dealer
        Then I See find a dealer page load sucessfully
        And I enter location or postcode
        And I enter car name
       When I click on find a dealer button
       Then I see all nearest dealer  sucessfully