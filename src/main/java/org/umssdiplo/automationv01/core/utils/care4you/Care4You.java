package org.umssdiplo.automationv01.core.utils.care4you;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.care4you.web.*;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;
import org.umssdiplo.automationv01.core.utils.WebUrls;

public final class Care4You {
    private Home home;
    private DepartmentHome departmentHome;
    private DepartmentCreate departmentCreate;
    private DepartmentEdit departmentEdit;
    private DepartmentDelete departmentDelete;

    private Care4You() {
        home = new Home();
        departmentHome = new DepartmentHome();
        departmentCreate = new DepartmentCreate();
        departmentEdit = new DepartmentEdit();
        departmentDelete = new DepartmentDelete();
    }

    public static Care4You init() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl(WebUrls.CARE4YOU));
        return new Care4You();
    }

    public Home getHome() {
        return home;
    }

    public DepartmentHome getDepartment() { return departmentHome; }

    public DepartmentCreate getDepartmentCreate() {
        return departmentCreate;
    }

    public DepartmentEdit getDepartmentEdit() {
        return departmentEdit;
    }
    public DepartmentDelete getDepartmentDelete() {
        return departmentDelete;
    }
}
