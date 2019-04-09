package org.umssdiplo.automationv01.core.managepage.care4you.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class CreateDepartment extends BasePage {

    @FindBy(id = "code")
    private WebElement codeInput;


    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "description")
    private WebElement descriptionInput;

    @FindBy(id = "create-department-submit")
    private WebElement submitDepartment;



    public void submitDepartmentsForm() {
        CommonEvents.clickButton(submitDepartment);
    }

}
