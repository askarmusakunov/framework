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
        "JSON",
        "JSON"
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
        "Alan.Maked@kcc.com",
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
  "name": "the response status should be \"302\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateUserSteps.theResponseStatusIs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the following should be the response",
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
formatter.scenario({
  "name": "noToken get request should return no info",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the following headers are set",
  "rows": [
    {
      "cells": [
        "accept"
      ]
    },
    {
      "cells": [
        "JSON"
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
  "name": "the all users are requested",
  "keyword": "When "
});
formatter.match({
  "location": "CreateUserSteps.theAllUsersAreRequested()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response status should be \"200\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateUserSteps.theResponseStatusIs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the following should be the response of get",
  "rows": [
    {
      "cells": [
        "metaMessage",
        "success"
      ]
    },
    {
      "cells": [
        "Authentication failed.",
        "false"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreateUserSteps.theFollowingShouldBeTheResponseOfGet(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user should be able to get info with specific ID",
  "description": "",
  "keyword": "Scenario"
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
        "JSON",
        "JSON"
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
  "name": "the user with id \"24\" is requested",
  "keyword": "When "
});
formatter.match({
  "location": "CreateUserSteps.theUserWithIdIsRequested(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the response status should be \"200\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateUserSteps.theResponseStatusIs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the following users should be in the response",
  "rows": [
    {
      "cells": [
        "id",
        "first_name",
        "last_name",
        "gender"
      ]
    },
    {
      "cells": [
        "18",
        "Alyson",
        "Goldner",
        "female"
      ]
    },
    {
      "cells": [
        "19",
        "Stephen",
        "Prohaska",
        "male"
      ]
    },
    {
      "cells": [
        "20",
        "Urban",
        "O\u0027Hara",
        "male"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CreateUserSteps.theFollowingUsersShouldBeInTheResponse(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
});