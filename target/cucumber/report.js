$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BackGroundChange.feature");
formatter.feature({
  "line": 3,
  "name": "Background color change validation in Techfios Page",
  "description": "",
  "id": "background-color-change-validation-in-techfios-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@BackgroundChangeFeature"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User should be on Techfios Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "BackGroundColourStepDefination.user_should_be_on_Techfios_Login_Page()"
});
formatter.result({
  "duration": 7975689900,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User should be able to change SkyBlue BackGround",
  "description": "",
  "id": "background-color-change-validation-in-techfios-page;user-should-be-able-to-change-skyblue-background",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Set SkyWhite Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I click in the SkyWhite button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "BackGroundColourStepDefination.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 76378400,
  "status": "passed"
});
formatter.match({
  "location": "BackGroundColourStepDefination.i_click_on_the_button()"
});
formatter.result({
  "duration": 54088000,
  "status": "passed"
});
formatter.match({
  "location": "BackGroundColourStepDefination.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 41971200,
  "status": "passed"
});
formatter.match({
  "location": "BackGroundColourStepDefination.set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "duration": 2061357600,
  "status": "passed"
});
formatter.match({
  "location": "BackGroundColourStepDefination.i_click_in_the_SkyWhite_button()"
});
formatter.result({
  "duration": 59351000,
  "status": "passed"
});
formatter.match({
  "location": "BackGroundColourStepDefination.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 37786000,
  "status": "passed"
});
});