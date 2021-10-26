package com.getbrand.app.utils.messaging.data.company;

import org.springframework.stereotype.Component;

@Component
public class CompanyMessagingData {
    private final String directName = "CompanyEntity";

    private final String companyAddressDirectName = "CompanyAddressEntity";

    private final String queueName = "CompanyService";

    public CompanyMessagingData() {};

    public String getCompanyAddressDirectName() {
        return companyAddressDirectName;
    }

    public String getDirectName() {
        return directName;
    }

    public String getQueueName() {
        return queueName;
    }
}
