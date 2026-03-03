Feature: Naukri Webapplication testing
  Scenario: login functionality
    Given user must be launch the browser
    When user must be click the login button
    And user must be click the gotit button
    And user must be enter the username in the " " username field
    And user must be enter the password in the " " password field
    And user must be click the signin button
    Then user should be navigate to the homepage " "

  Scenario: Progile Update Functionality
    When user must click the profile button
    And user must be click the view & update profile label
    Then user should be navigate to the profilepage

  Scenario: Resume headline Functionality
    When user must be click the Resume headline label
    And user must click the edit icon button
    And user must enter the summary in the Resume headline field
    And user must be click the save button
    Then Display that the Resume headline has been Successfully saved

  Scenario: Key skills Functionality
    When user must be click the Key skills label
    And user must be click the icon symbol
    And user enter the skill in the add skills field
    And user should be click the save button
    Then Display that the Keyskills has been Successfully saved

  Scenario: Education Functionality
    When user must be click the Education label
    And user must click the Add education label
    And user must click the education in the Select education field
    And user must select the education into the Select education field
    And user must enter the University in the University/Institute field
    And user must click the select course field
    And user must select the course into the select course field
    And user must select the course type field
    And user must click the Starting year field
    And user must select the year into the Starting year field
    And user must click the Ending year field
    And user must select the year into the Ending year field
    And user must click the Select grading system field
    And user select the grade into the Select grading system field
    And user must click the save buttons
    Then Display that the Education Details has been Successfully saved
