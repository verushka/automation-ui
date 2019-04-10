package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.care4you.domain.Department;
import org.umssdiplo.automationv01.core.managepage.care4you.web.*;
import org.umssdiplo.automationv01.core.utils.care4you.Care4You;

import java.util.List;

public class StepsDefinitionCare4You {
    private Home home;
    private DepartmentHome departmentHome;
    private DepartmentCreate departmentCreate;
    private DepartmentEdit departmentEdit;
    private DepartmentDelete departmentDelete;

    @Given("^'Care4You' page is loaded$")
    public void care4YouPageIsLoaded() throws Throwable {
        Care4You manager = Care4You.init();
        departmentHome = manager.getDepartment();
        departmentCreate = manager.getDepartmentCreate();
        departmentEdit = manager.getDepartmentEdit();
        departmentDelete = manager.getDepartmentDelete();
        home = manager.getHome();
    }

    @And("^click 'Departments' tab in 'Header menu'$")
    public void navigateToDepartments() throws Throwable {
        home.navigateToDepartments();
    }

    @And("^click 'Departments' menu item in 'Departments menu'$")
    public void openDepartmentsList() throws Throwable {
        departmentHome.openDepartmentsList();
    }

    @And("^click 'Create an department' menu item in 'Departments menu$")
    public void openDepartmentsForm() throws Throwable {
        departmentHome.openDepartmentsForm();
    }

    @Given("^Enter 'Create an department' form information$")
    public void enterIncidentsFormInformation(List<Department> department) throws Throwable {
        departmentCreate.enterInformationDepartmentForm(department.get(0));
    }

    @Given("^click 'Edit an department' form information$")
    public void editDepartmentInformationForm() throws Throwable {
        departmentEdit.optionEditDepartmentForm();
    }

    @Given("^click 'Delete an department' form information$")
    public void deleteDepartmentInformationForm() throws Throwable {
        departmentDelete.optionDeleteDepartmentForm();
    }

}
