package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.care4you.home.Department;
import org.umssdiplo.automationv01.core.managepage.care4you.home.Home;
import org.umssdiplo.automationv01.core.utils.care4you.Care4You;

public class StepsDefinitionCare4You {
    private Home home;
    private Department department;

    @Given("^'Care4You' page is loaded$")
    public void care4YouPageIsLoaded() throws Throwable {
        Care4You manager = Care4You.init();
        department = manager.getDepartment();
        home = manager.getHome();
    }

    @And("^click 'Departments' tab in 'Header menu'$")
    public void navigateToDepartments() throws Throwable {
        home.navigateToDepartments();
    }

    @And("^click 'Departments' menu item in 'Departments menu'$")
    public void openDepartmentsList() throws Throwable {
        department.openDepartmentsList();
    }

    @And("^click 'Create an department' menu item in 'Departments menu$")
    public void openDepartmentsForm() throws Throwable {
        department.openDepartmentsForm();
    }

}
