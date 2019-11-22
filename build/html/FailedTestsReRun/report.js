$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/tag.feature");
formatter.feature({
  "name": "Free CRM application testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "name": "browser closed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "This is a close browser test",
  "keyword": "Given "
});
formatter.match({
  "location": "TagDefinitions.this_is_a_close_browser_test()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});