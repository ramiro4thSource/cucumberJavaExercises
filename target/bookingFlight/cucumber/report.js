$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bookTripFlight.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# new feature"
    },
    {
      "line": 2,
      "value": "# Tags: optional"
    }
  ],
  "line": 5,
  "name": "As registered user I want to book a round trip flight",
  "description": "",
  "id": "as-registered-user-i-want-to-book-a-round-trip-flight",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@Booking"
    }
  ]
});
formatter.before({
  "duration": 3981215735,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Book a trip successfully",
  "description": "",
  "id": "as-registered-user-i-want-to-book-a-round-trip-flight;book-a-trip-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Booking-Succesfully"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am a user on the landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I provide my credentials as follows",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 11
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "decide to sign in",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "provide flight details",
  "rows": [
    {
      "cells": [
        "type",
        "passengers",
        "departingFrom",
        "onMonth",
        "onDay",
        "arrivingIn",
        "returningOnMonth",
        "returningOnDay"
      ],
      "line": 15
    },
    {
      "cells": [
        "roundtrip",
        "4",
        "Zurich",
        "October",
        "25",
        "Acapulco",
        "November",
        "20"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "provide preferences",
  "rows": [
    {
      "cells": [
        "serviceClass",
        "airline"
      ],
      "line": 18
    },
    {
      "cells": [
        "Business",
        "Pangea Airlines"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "press continue",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "select a flight randomly",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "press continue",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "provide passengers info",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "Meal"
      ],
      "line": 24
    },
    {
      "cells": [
        "Jaimico",
        "Estrella",
        "Diabetic"
      ],
      "line": 25
    },
    {
      "cells": [
        "Rodrigo",
        "Jaleas",
        "Hindu"
      ],
      "line": 26
    },
    {
      "cells": [
        "Carlitos",
        "Morales",
        "No preference"
      ],
      "line": 27
    },
    {
      "cells": [
        "Rodrigo",
        "Jaleas",
        "Bland"
      ],
      "line": 28
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "provide credit card info",
  "rows": [
    {
      "cells": [
        "typeCC",
        "numberCC",
        "expirationMonthCC",
        "expirationYearCC",
        "firstNameHolderCC",
        "middleNameHolderCC",
        "lastNameHolderCC"
      ],
      "line": 30
    },
    {
      "cells": [
        "MasterCard",
        "787888007000912",
        "10",
        "2000",
        "Ernesto",
        "Raymundo",
        "Gonzalez"
      ],
      "line": 31
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "provide billing address",
  "rows": [
    {
      "cells": [
        "checkPropAddres",
        "address",
        "cityAddress",
        "provinceAddress",
        "zipCodeAddress",
        "countryAddress"
      ],
      "line": 33
    },
    {
      "cells": [
        "yes",
        "Calle siempre viva",
        "Bora bora",
        "Timbactu",
        "87900",
        "Yemen"
      ],
      "line": 34
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "provide delivery address",
  "rows": [
    {
      "cells": [
        "checkPropAddres",
        "address",
        "cityAddress",
        "provinceAddress",
        "zipCodeAddress",
        "countryAddress"
      ],
      "line": 36
    },
    {
      "cells": [
        "no",
        "Calle siempre viva",
        "Bora bora",
        "Timbactu",
        "87900",
        "Yemen"
      ],
      "line": 37
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "press continue",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I should get a result",
  "keyword": "Then "
});
formatter.match({
  "location": "StartingStep.setup()"
});
formatter.result({
  "duration": 3737071635,
  "status": "passed"
});
formatter.match({
  "location": "SignInStep.iProvideMyCredentialsAsFollows(UserInfo\u003e)"
});
formatter.result({
  "duration": 219692347,
  "status": "passed"
});
formatter.match({
  "location": "SignInStep.decideToSignIn()"
});
formatter.result({
  "duration": 14582724170,
  "status": "passed"
});
formatter.match({
  "location": "BookDetailSetp.provideFlightDetails(FlightInfo\u003e)"
});
formatter.result({
  "duration": 737862289,
  "status": "passed"
});
formatter.match({
  "location": "BookDetailSetp.providePreferences(FlightInfo\u003e)"
});
formatter.result({
  "duration": 242148963,
  "status": "passed"
});
formatter.match({
  "location": "FlightSelectionStep.pressContinue()"
});
formatter.result({
  "duration": 355949918,
  "status": "passed"
});
formatter.match({
  "location": "FlightSelectionStep.selectAFlightRandomly()"
});
formatter.result({
  "duration": 59131036,
  "status": "passed"
});
formatter.match({
  "location": "FlightSelectionStep.pressContinue()"
});
formatter.result({
  "duration": 443947003,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseDetailsStep.providePassengersInfo(Passenger\u003e)"
});
formatter.result({
  "duration": 1337349156,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseDetailsStep.provideCreditCardInfo(AdditionalInfo\u003e)"
});
formatter.result({
  "duration": 999188201,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseDetailsStep.provideBillingAddress(AdditionalInfo\u003e)"
});
formatter.result({
  "duration": 1070349337,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseDetailsStep.provideDeliveryAddress(AdditionalInfo\u003e)"
});
formatter.result({
  "duration": 971630847,
  "status": "passed"
});
formatter.match({
  "location": "FlightSelectionStep.pressContinue()"
});
formatter.result({
  "duration": 475852200,
  "status": "passed"
});
formatter.match({
  "location": "FlightBookedStep.iShouldGetAResult()"
});
formatter.result({
  "duration": 51550346,
  "status": "passed"
});
});