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
Feature: Tuition and Financing Link Functionality
  

  @tag1
  Scenario: Title of your scenario
  
Given user launches Transfotech HomePage
And user lands on to homepage
When user clicks on the “Tuition & Financing” link
And user will land on “Tuition & Financing” page
And user should see payment options 
Then user will select Income share Agreement contact Now option
And user lands to Contact Us page




