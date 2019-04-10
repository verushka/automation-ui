package org.umssdiplo.automationv01.core.managepage.care4you.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class DepartmentHome extends BasePage {

    @FindBy(id = "list-departments-menu")
    private WebElement listDepartmentsOption;


    @FindBy(id = "create-departments-menu")
    private WebElement createDepartmentOption;


    public void openDepartmentsList() {
        CommonEvents.clickButton(listDepartmentsOption);
    }

    public void openDepartmentsForm() {
        CommonEvents.clickButton(createDepartmentOption);
    }

}
