$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SignUpNewUser.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "As new user I want to have my account on the website",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Signup"
    }
  ]
});
formatter.before({
  "duration": 3373661380,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "I want to create a new account",
  "description": "",
  "id": ";i-want-to-create-a-new-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Signup-simple"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am a user on the landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I decide to create an account",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I provide my info correctly as follows",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "country",
        "email",
        "password",
        "adress",
        "phone",
        "city",
        "province",
        "zipCode",
        "userName"
      ],
      "line": 10
    },
    {
      "cells": [
        "Fernando",
        "Montreal",
        "YEMEN",
        "fer@fake.com",
        "holaMundo",
        "calle siempre viva",
        "9995-09-09",
        "Bororo",
        "shing",
        "98000",
        "pedrito"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I submit the form",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should get at http://newtours.demoaut.com/create_account_success.php",
  "keyword": "Then "
});
formatter.match({
  "location": "StartingStep.setup()"
});
formatter.result({
  "duration": 2782184820,
  "status": "passed"
});
formatter.match({
  "location": "LandingPageStep.she_chooses_to_sign_up()"
});
formatter.result({
  "duration": 180345547,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"REGISTER\"}\n  (Session info: chrome\u003d70.0.3538.77)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027MIDL002095\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600210 (68dcf5eebde371..., userDataDir: C:\\Users\\RAMIRO~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:49436}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 70.0.3538.77, webStorageEnabled: true}\nSession ID: 572f534efaa340e4c61b91707d2c5a79\n*** Element info: {Using\u003dlink text, value\u003dREGISTER}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:376)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat pages.LandingPage.I_decide_to_create_an_account(LandingPage.java:33)\r\n\tat steps.LandingPageStep.she_chooses_to_sign_up(LandingPageStep.java:14)\r\n\tat ✽.When I decide to create an account(SignUpNewUser.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "RegisterPageStep.I_provide_my_info_correctly_as_follows(UserInfo\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegisterPageStep.I_submit_the_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "http://newtours.demoaut.com/create_account_success.php",
      "offset": 16
    }
  ],
  "location": "SuccesPageStep.setup(String)"
});
formatter.result({
  "status": "skipped"
});
});