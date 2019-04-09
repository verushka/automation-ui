package org.umssdiplo.automationv01.core.managepage.care4you.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Home extends BasePage {

    @FindBy(id = "root-departments-home")
    private WebElement homeOption;

    @FindBy(id = "root-departments-menu")
    private WebElement departmentsOption;

    public void navigateToDepartments() { CommonEvents.clickButton(departmentsOption);}

    public void navigateToHome() {
        CommonEvents.clickButton(homeOption);
    }
}
