Feature: Test Login Functionality

  Background:

    Given go to the homedepot home page;

    @tag
    Scenario Outline:

      When you click sign in button;
      Then enter username and password;
      And click enter button to log in;

      Examples:
      |username|password|
      |Semetei |bishkek312|