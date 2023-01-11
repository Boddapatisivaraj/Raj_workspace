Feature: This is a outline 

Scenario: eat 5 out of 7
  Given there are 7 tables1
  When I have 5 tables1
  Then I should have 2 tables1

Scenario: eat 5 out of 15
  Given there are 15 apples2
  When I eat 5 apples2
  Then I should have 10 apples2