Feature: This is a outline 

Scenario: eat 5 out of 7
  Given there are 7 tables
  When I have 5 tables
  Then I should have 2 tables

Scenario: eat 5 out of 15
  Given there are 15 apples
  When I eat 5 apples
  Then I should have 10 apples