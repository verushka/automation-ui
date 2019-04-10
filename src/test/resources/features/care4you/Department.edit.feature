Feature: Department

  Background: Departments form is displayed
    Given 'Care4You' page is loaded
    And click 'Departments' tab in 'Header menu'
    And click 'Edit an department' form information

  Scenario Outline: Edit form information
    Given Enter 'Create an department' form information
      | code    | name   | description     |
      | <scode> | <sname> | <sdescription> |


    Examples:
      |scode             | sname             | sdescription         |
      |department-edited1| Operation edited 2| My description edited|




