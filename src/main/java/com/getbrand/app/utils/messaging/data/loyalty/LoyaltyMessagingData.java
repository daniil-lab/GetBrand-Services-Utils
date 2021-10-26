package com.getbrand.app.utils.messaging.data.loyalty;

import org.springframework.stereotype.Component;

@Component
public class LoyaltyMessagingData {

    private final String loyaltyDirectName = "LoyaltyEntity";

    private final String companyLoyaltyDirectName = "CompanyLoyaltyEntity";

    private final String userLoyaltyDirectName = "UserLoyaltyEntity";

    private final String companyGradeDirectName = "CompanyGradeEntity";

    private final String queueName = "LoyaltyService";

    private final String companyEntityUpdateQueueName = "LoyaltyService_CompanyEntity_Update";

    private final String companyEntityDeleteQueueName = "LoyaltyService_CompanyEntity_Delete";

    private final String userEntityUpdateQueueName = "LoyaltyService_UserEntity_Update";

    private final String userEntityDeleteQueueName = "LoyaltyService_UserEntity_Delete";

    public LoyaltyMessagingData() {};

    public String getLoyaltyDirectName() {
        return loyaltyDirectName;
    }

    public String getCompanyLoyaltyDirectName() {
        return companyLoyaltyDirectName;
    }

    public String getUserLoyaltyDirectName() {
        return userLoyaltyDirectName;
    }

    public String getCompanyGradeDirectName() {
        return companyGradeDirectName;
    }

    public String getQueueName() {
        return queueName;
    }

    public String getCompanyEntityUpdateQueueName() {
        return companyEntityUpdateQueueName;
    }

    public String getCompanyEntityDeleteQueueName() {
        return companyEntityDeleteQueueName;
    }

    public String getUserEntityUpdateQueueName() {
        return userEntityUpdateQueueName;
    }

    public String getUserEntityDeleteQueueName() {
        return userEntityDeleteQueueName;
    }
}
