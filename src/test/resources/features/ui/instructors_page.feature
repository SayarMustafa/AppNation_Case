Feature: Instructors Feature

  Scenario: Instructor Page Verification with Count Check
    When user clicks the Instructors tab
    Then user should be on the instructors page
    Then the number of instructors should be greater than 0
    Then the number of instructors should be equal to 8
