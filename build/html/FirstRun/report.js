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
  "name": "Login with correct username and correct password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "This is a valid login test",
  "keyword": "Given "
});
formatter.match({
  "location": "TagDefinitions.this_is_a_valid_login_test()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Create a contact",
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
  "name": "This is a contact test case",
  "keyword": "Given "
});
formatter.match({
  "location": "TagDefinitions.this_is_a_contact_test_case()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Create a deal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "This is a deal test case",
  "keyword": "Given "
});
formatter.match({
  "location": "TagDefinitions.this_is_a_deal_test_case()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Create a case",
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
  "name": "This is a case test case",
  "keyword": "Given "
});
formatter.match({
  "location": "TagDefinitions.this_is_a_case_test_case()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify left panel links",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "clicking on left panel links",
  "keyword": "Given "
});
formatter.match({
  "location": "TagDefinitions.clicking_on_left_panel_links()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search a deal",
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
  "name": "This is a search deal test",
  "keyword": "Given "
});
formatter.match({
  "location": "TagDefinitions.this_is_a_search_deal_test()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search a contact",
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
  "name": "This is a search contact test",
  "keyword": "Given "
});
formatter.match({
  "location": "TagDefinitions.this_is_a_search_contact_test()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search a case",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "This is a search case test",
  "keyword": "Given "
});
formatter.match({
  "location": "TagDefinitions.this_is_a_search_case_test()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search a task",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "This is a search task test",
  "keyword": "Given "
});
formatter.match({
  "location": "TagDefinitions.this_is_a_search_task_test()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search a call",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@End2End"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "This is a search call test",
  "keyword": "Given "
});
formatter.match({
  "location": "TagDefinitions.this_is_a_search_call_test()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search an email",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@End2End"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "This is a search email test",
  "keyword": "Given "
});
formatter.match({
  "location": "TagDefinitions.this_is_a_search_email_test()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search a docs",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@End2End"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "This is a search docs test",
  "keyword": "Given "
});
formatter.match({
  "location": "TagDefinitions.this_is_a_search_docs_test()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search a forms",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@End2End"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "This is a search forms test",
  "keyword": "Given "
});
formatter.match({
  "location": "TagDefinitions.this_is_a_search_forms_test()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[2]\u003e but was:\u003c[0]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat steps.TagDefinitions.this_is_a_close_browser_test(TagDefinitions.java:128)\n\tat ✽.This is a close browser test(src/test/resources/tag.feature:74)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});