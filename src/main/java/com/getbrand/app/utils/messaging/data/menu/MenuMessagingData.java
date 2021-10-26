package com.getbrand.app.utils.messaging.data.menu;

import org.springframework.stereotype.Component;

@Component
public class MenuMessagingData {
    private final String productDirectName = "MenuProductEntity";

    private final String categoryDirectName = "MenuCategoryEntity";

    private final String queueName = "MenuService";

    private final String companyEntityUpdateQueueName = "MenuService_CompanyEntity_Update";

    private final String companyEntityDeleteQueueName = "MenuService_CompanyEntity_Delete";

    private final String userEntityUpdateQueueName = "MenuService_UserEntity_Update";

    private final String userEntityDeleteQueueName = "MenuService_UserEntity_Delete";

    public MenuMessagingData() {};

    public String getProductDirectName() {
        return productDirectName;
    }

    public String getCategoryDirectName() {
        return categoryDirectName;
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
