package org.umssdiplo.automationv01.core.managepage.care4you.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class DepartmentDelete extends BasePage {

    @FindBy(id = "department-delete-1")
    private WebElement deleteDepartment1;

    public void optionDeleteDepartmentForm() {
        CommonEvents.clickButton(deleteDepartment1);
    }


}
