# new feature
# Tags: optional

@Booking
Feature: As registered user I want to book a round trip flight

  @Booking-Succesfully
  Scenario: Book a trip successfully
    Given I am a user on the landing page
    When I provide my credentials as follows
      | userName | password |
      | mercury  | mercury  |
    And decide to sign in
    And provide flight details
      | type      | passengers | departingFrom | onMonth | onDay | arrivingIn | returningOnMonth | returningOnDay |
      | roundtrip | 4          | Zurich        | October | 25    | Acapulco   | November         | 20             |
    And provide preferences
      | serviceClass | airline         |
      | Business     | Pangea Airlines |
    And press continue
    And select a flight randomly
    And press continue
    And provide passengers info
      | firstName | lastName | Meal          |
      | Jaimico   | Estrella | Diabetic      |
      | Rodrigo   | Jaleas   | Hindu         |
      | Carlitos  | Morales  | No preference |
      | Rodrigo   | Jaleas   | Bland         |
    And provide credit card info
      | typeCC     | numberCC        | expirationMonthCC | expirationYearCC | firstNameHolderCC | middleNameHolderCC | lastNameHolderCC |
      | MasterCard | 787888007000912 | 10                | 2000             | Ernesto           | Raymundo           | Gonzalez         |
    And provide billing address
      | checkPropAddres | address            | cityAddress | provinceAddress | zipCodeAddress | countryAddress |
      | yes             | Calle siempre viva | Bora bora   | Timbactu        | 87900          | Yemen          |
    And provide delivery address
      | checkPropAddres | address            | cityAddress | provinceAddress | zipCodeAddress | countryAddress |
      | no              | Calle siempre viva | Bora bora   | Timbactu        | 87900          | Yemen          |
    And press continue
    Then I should get a result
