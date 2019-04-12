Feature: Department

  Background: Departments form is displayed
    Given 'Care4You' page is loaded
    And click 'Departments' tab in 'Header menu'
    And click 'Edit last department created' form information

  Scenario Outline: Edit a department form information
    Given Enter 'Data to edit a department' form information
      | code    | name    | description    |
      | <code-value> | <name-value> | <value-description> |
    And click 'Submit a department edited' form information
    Then The "<name-value>"'Name-value' field value is edited in 'Departments

    Examples:
      | code-value        | name-value        | value-description     |
      | department-edited | Operation edited  | My description edited |




