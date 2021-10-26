package com.getbrand.app.utils.company.request;

import java.util.List;

public class CreateCompanyWithStuffRequest {
    private CreateCompanyRequest companyData;

    private CreateCompanyConfigDataRequest companyConfigData;

    private List<String> roleNames;

    public CreateCompanyWithStuffRequest() {};

    public CreateCompanyWithStuffRequest(CreateCompanyRequest companyData, CreateCompanyConfigDataRequest companyConfigData, List<String> roleNames) {
        this.companyData = companyData;
        this.companyConfigData = companyConfigData;
        this.roleNames = roleNames;
    }

    public CreateCompanyRequest getCompanyData() {
        return companyData;
    }

    public void setCompanyData(CreateCompanyRequest companyData) {
        this.companyData = companyData;
    }

    public CreateCompanyConfigDataRequest getCompanyConfigData() {
        return companyConfigData;
    }

    public void setCompanyConfigData(CreateCompanyConfigDataRequest companyConfigData) {
        this.companyConfigData = companyConfigData;
    }

    public List<String> getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
    }
}
