$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resource/featureFiles/marat.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@marat"
    }
  ]
});
formatter.step({
  "name": "user able to login in website",
  "keyword": "Given "
});
formatter.match({
  "location": "marat.user_able_to_login_in_website()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user passes Username and Password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "fjgg",
        "gjkfkm"
      ]
    },
    {
      "cells": [
        "gkrjw",
        "fmwklfj"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "marat.user_passes_Username_and_Password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user logins multiple time",
  "keyword": "Then "
});
formatter.match({
  "location": "marat.user_logins_multiple_time()"
});
formatter.result({
  "status": "skipped"
});
});