package org.umssdiplo.automationv01.core.managepage.care4you.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class DepartmentDelete extends BasePage {

    @FindBy(id = "department-delete-2")
    private WebElement deleteDepartment1;

    @FindBy(id = "department-delete-ok")
    private WebElement deleteDepartmentOk;

    public void optionDeleteDepartmentForm() {
        CommonEvents.clickButton(deleteDepartment1);
    }

    public void deleteDepartmentOkForm() {
        CommonEvents.clickButton(deleteDepartmentOk);
    }

    public void optionDeleteLasItemCreated() {
        WebElement table = webDriver.findElement(By.id("table-departments-list"));
        int numOfRow = table.findElements(By.tagName("tr")).size() - 1;
        String itemForDelete = "department-delete-" + numOfRow;
        webDriver.findElement(By.id(itemForDelete)).click();
    }

}
