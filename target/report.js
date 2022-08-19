$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/automationsite.feature");
formatter.feature({
  "name": "Practice the cucumber section",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@automation"
    }
  ]
});
formatter.scenario({
  "name": "To enter the valid data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@automation"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the browser and launch the url",
  "keyword": "Given "
});
formatter.match({
  "location": "automationtestsite.to_launch_the_browser_and_launch_the_url()"
});
