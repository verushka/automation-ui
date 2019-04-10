Feature: Department

  Background: Departments form is displayed
    Given 'Care4You' page is loaded
    And click 'Departments' tab in 'Header menu'
    And click 'Create an department' menu item in 'Departments menu

  Scenario Outline: : Departments form is filled
    Given Enter 'Create an department' form information
      | code    | name   | description     |
      | <scode> | <sname> | <sdescription> |


    Examples:
      |scode        | sname       | sdescription   |
      |department-02| Operation   | My description 2|

