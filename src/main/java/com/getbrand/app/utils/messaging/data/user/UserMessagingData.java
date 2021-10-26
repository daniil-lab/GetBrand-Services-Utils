package com.getbrand.app.utils.messaging.data.user;

import org.springframework.stereotype.Component;

@Component
public class UserMessagingData {
    private final String queueName = "UserService";

    private final String directName = "UserEntity";

    private final String companyEntityDeleteQueueName = "UserService_CompanyEntity_Delete";

    private final String companyEntityUpdateQueueName = "UserService_CompanyEntity_Update";

    private final String statusEntityDeleteQueueName = "UserService_StatusEntity_Delete";

    private final String statusEntityUpdateQueueName = "UserService_StatusEntity_Update";

    public UserMessagingData() {};

    public String getStatusEntityDeleteQueueName() {
        return statusEntityDeleteQueueName;
    }

    public String getStatusEntityUpdateQueueName() {
        return statusEntityUpdateQueueName;
    }

    public String getQueueName() {
        return queueName;
    }

    public String getDirectName() {
        return directName;
    }

    public String getCompanyEntityDeleteQueueName() {
        return companyEntityDeleteQueueName;
    }

    public String getCompanyEntityUpdateQueueName() {
        return companyEntityUpdateQueueName;
    }
}
