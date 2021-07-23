Feature:
  As a traveler to the LATAM Airline
  I want to access the general information of travel
  To verify that the reservation code has six digits

  @ReservationCodeLength
    Scenario: Check the length of the verification code
    Given that the traveler wants to use the LATAM Airlines Page
    When He search the general information of travel
    Then He should see the length of the verification code are 6 digits