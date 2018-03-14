$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Feature/ClickView.feature");
formatter.feature({
  "line": 1,
  "name": "Validate click Feature",
  "description": "",
  "id": "validate-click-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14680527685,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validate  View Option",
  "description": "",
  "id": "validate-click-feature;validate--view-option",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@appium"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I use the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Expandable Lists",
  "keyword": "When "
});
formatter.match({
  "location": "ViewFeature.i_open_the_application()"
});
formatter.result({
  "duration": 346060335,
  "status": "passed"
});
formatter.match({
  "location": "ViewFeature.i_tap_on_Expandable_Lists()"
});
formatter.result({
  "duration": 851075782,
  "status": "passed"
});
formatter.after({
  "duration": 3925870056,
  "status": "passed"
});
formatter.uri("src/test/java/Feature/Gesture.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Gesture Feature",
  "description": "",
  "id": "validate-gesture-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13550798166,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validate  View Option",
  "description": "",
  "id": "validate-gesture-feature;validate--view-option",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@appium"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I tap on Expandable Lists",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click Custom Adapter",
  "keyword": "Then "
});
formatter.match({
  "location": "App2.i_open_the_application()"
});
formatter.result({
  "duration": 86005728,
  "status": "passed"
});
formatter.match({
  "location": "App2.i_tap_on_Expandable_Lists()"
});
formatter.result({
  "duration": 880332405,
  "status": "passed"
});
formatter.match({
  "location": "App2.i_click_Custom_Adapter()"
});
formatter.result({
  "duration": 1656619201,
  "status": "passed"
});
formatter.after({
  "duration": 3044185718,
  "status": "passed"
});
});