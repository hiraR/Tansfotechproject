#Author: your.email@your.domain.com
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
#Sample Feature Definition Template
@tag
Feature: Get Contact Us Information 
 Cheaking to see user can get contact info. in homepage and other Transfotech webpage.

  @tag1
  Scenario: Get contact Information from any Transfotech webpage 
    Given user launch Transfotech website
    And user lands onto webpage
    When user scroll to bottom of the page
    And user will see Get in touch information
    Then to verify user will click on the “Tuition & Financing” link   
    And user will scroll to bottom of the page
    And user will see Get in touch information is provided here too
