#Courses link functionality test

Feature: Courses Link Functionality
  User visit Transfotech Web page and able to view multiple courses in Courses link dropdown
  
  Scenario: Courses link functionality test by patrtial dropdown
    Given user loads application
    And get titel of the page
    When user move curser to courses link
    And user goes to QA Engineering
    Then user select QA Engineering link
    And user will land on Full Stack QA Engineering Course page
 


  