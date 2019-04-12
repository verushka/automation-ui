package org.umssdiplo.automationv01.core.managepage.care4you.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.care4you.domain.Department;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.openqa.selenium.By;

public class DepartmentCreate extends BasePage {

    @FindBy(id = "code")
    private WebElement codeInput;

    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "description")
    private WebElement descriptionInput;

    @FindBy(id = "department-submit")
    private WebElement submitDepartment;

    public void submitDepartmentsForm() {
        CommonEvents.clickButton(submitDepartment);
    }

    public void enterInformationDepartmentForm(Department department) {
        CommonEvents.setInputField(codeInput, department.getCode());
        CommonEvents.setInputField(nameInput, department.getName());
        CommonEvents.setInputField(descriptionInput, department.getDescription());
    }

    public String getLastCodeAdded() {
        WebElement table = webDriver.findElement(By.id("table-departments-list"));
        int numOfRow = table.findElements(By.tagName("tr")).size() - 1;
        String lastCode = "department-code-" + numOfRow;
        return webDriver.findElement(By.id(lastCode)).getText();
    }
}
