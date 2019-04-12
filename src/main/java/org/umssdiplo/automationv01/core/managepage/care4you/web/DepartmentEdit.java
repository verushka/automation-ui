package org.umssdiplo.automationv01.core.managepage.care4you.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.care4you.domain.Department;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class DepartmentEdit extends BasePage {

    @FindBy(id = "code")
    private WebElement codeInput;

    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "description")
    private WebElement descriptionInput;

    @FindBy(id = "department-edit-2")
    private WebElement editDepartment1;

    @FindBy(id = "department-submit")
    private WebElement submitDepartment;

    public void submitDepartmentsForm() {
        CommonEvents.clickButton(submitDepartment);
    }

    public void optionEditDepartmentForm() {
        CommonEvents.clickButton(editDepartment1);
    }

    public void editInformationDepartmentForm(Department department) {
        CommonEvents.setInputField(codeInput, department.getCode());
        CommonEvents.setInputField(nameInput, department.getName());
        CommonEvents.setInputField(descriptionInput, department.getDescription());
    }

    public void optionLastLasDepartmentCreated() {
        WebElement table = webDriver.findElement(By.id("table-departments-list"));
        int numOfRow = table.findElements(By.tagName("tr")).size() - 1;

        String itemForEdit = "department-edit-" + numOfRow;

        webDriver.findElement(By.id(itemForEdit)).click();
    }

    public String getLastNameEdited() {
        WebElement table = webDriver.findElement(By.id("table-departments-list"));
        int numOfRow = table.findElements(By.tagName("tr")).size() -1;
        String lastCode = "department-name-" + numOfRow;
        return webDriver.findElement(By.id(lastCode)).getText();
    }

}
