#Author: your.email@your.domain.com  ______________________________
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template sample text# this page
@tag1
Feature: Login test for internet.herokuapp

  Background: 
    Given I am in internet.herokuapp login page "https://the-internet.herokuapp.com/login"

  @systest @inteTest
  Scenario Outline: Login test with different credentials
    When I type user name="<userName>" and password="<password>"
    And I click Login button
    Then "<url>" should open

    # Transfering data with keywords 
    Examples: 
      | userName  | password             | url     |
      | tomsmith  | SuperSecretPassword! | /secure |
      |           | SuperSecretPassword! | /login  |
      | tomsmith  |                      | /login  |
      | tomsmith  | SuperSecretPassword  | /login  |
      | tomsmith1 | SuperSecretPassword! | /login  |
      | tomsmith1 | SuperSecretPassword  | /login  |
      |           |                      | /login  |
