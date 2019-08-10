$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/featureFiles/GoRest.feature");
formatter.feature({
  "name": "Create User",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "New user should be able to be created",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "the following headers are set",
  "rows": [
    {
      "cells": [
        "accept",
        "contentType"
      ]
    },
    {
      "cells": [
        "JSON1",
        "JSON2"
      ]
    },
    {
      "cells": [
        "XML1",
        "XML2"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "CreateUserSteps.the_following_headers_are_set(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the following user info is set in body",
  "rows": [
    {
      "cells": [
        "first_name",
        "last_name",
        "email",
        "status",
        "gender"
      ]
    },
    {
      "cells": [
        "Alan",
        "McMillan",
        "Alan.Mc@kcc.com",
        "active",
        "male"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CreateUserSteps.the_following_user_info_is_set_in_body(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the post request is sent to create the user",
  "keyword": "When "
});
formatter.match({
  "location": "CreateUserSteps.the_post_request_is_sent_to_create_the_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response status is \"201\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateUserSteps.theResponseStatusIs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the following is the response",
  "rows": [
    {
      "cells": [
        "id",
        "first_name",
        "last_name",
        "gender",
        "email"
      ]
    },
    {
      "cells": [
        "1",
        "Alan",
        "McMillan",
        "male",
        "Alan.Mc@kcc.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CreateUserSteps.the_following_is_the_response(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
});