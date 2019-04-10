package org.umssdiplo.automationv01.core.managepage.care4you.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.care4you.domain.Department;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class DepartmentEdit extends BasePage {

    @FindBy(id = "department-edit-1")
    private WebElement editDepartment1;


    public void optionEditDepartmentForm() {
        CommonEvents.clickButton(editDepartment1);
    }


}
