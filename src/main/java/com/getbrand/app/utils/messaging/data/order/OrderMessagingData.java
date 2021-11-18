package com.getbrand.app.utils.messaging.data.order;

import org.springframework.stereotype.Component;

@Component
public class OrderMessagingData {
    private final String queueName = "OrderService";

    private final String orderDirectName = "OrderEntity";

    private final String orderStateDirectName = "OrderStateEntity";

    private final String equipmentDirectName = "EquipmentEntity";

    private final String companyEntityUpdateQueueName = "OrderService_CompanyEntity_Update";

    private final String companyEntityDeleteQueueName = "OrderService_CompanyEntity_Delete";

    private final String userEntityUpdateQueueName = "OrderService_UserEntity_Update";

    private final String userEntityDeleteQueueName = "OrderService_UserEntity_Delete";

    private final String menuCategoryEntityUpdateQueueName = "OrderService_MenuCategoryEntity_Update";

    private final String menuCategoryEntityDeleteQueueName = "OrderService_MenuCategoryEntity_Delete";

    private final String menuProductEntityUpdateQueueName = "OrderService_MenuProductEntity_Update";

    private final String menuProductEntityDeleteQueueName = "OrderService_MenuProductEntity_Delete";

    private final String promoEntityUpdateQueueName = "OrderService_PromoEntity_Update";

    private final String promoEntityDeleteQueueName = "OrderService_PromoEntity_Delete";

    private final String loyaltyEntityDeleteQueueName = "OrderService_LoyaltyEntity_Delete";

    private final String loyaltyEntityUpdateQueueName = "OrderService_LoyaltyEntity_Update";

    private final String userLoyaltyEntityDeleteQueueName = "OrderService_UserLoyaltyEntity_Delete";

    private final String userLoyaltyEntityUpdateQueueName = "OrderService_UserLoyaltyEntity_Update";

    private final String companyLoyaltyEntityDeleteQueueName = "OrderService_CompanyLoyaltyEntity_Delete";

    private final String companyLoyaltyEntityUpdateQueueName = "OrderService_CompanyLoyaltyEntity_Update";

    private final String companyGradeEntityDeleteQueueName = "OrderService_CompanyGradeEntity_Delete";

    private final String companyGradeEntityUpdateQueueName = "OrderService_CompanyGradeEntity_Update";

    public OrderMessagingData() {};

    public String getLoyaltyEntityDeleteQueueName() {
        return loyaltyEntityDeleteQueueName;
    }

    public String getLoyaltyEntityUpdateQueueName() {
        return loyaltyEntityUpdateQueueName;
    }

    public String getUserLoyaltyEntityDeleteQueueName() {
        return userLoyaltyEntityDeleteQueueName;
    }

    public String getUserLoyaltyEntityUpdateQueueName() {
        return userLoyaltyEntityUpdateQueueName;
    }

    public String getCompanyLoyaltyEntityDeleteQueueName() {
        return companyLoyaltyEntityDeleteQueueName;
    }

    public String getCompanyLoyaltyEntityUpdateQueueName() {
        return companyLoyaltyEntityUpdateQueueName;
    }

    public String getCompanyGradeEntityDeleteQueueName() {
        return companyGradeEntityDeleteQueueName;
    }

    public String getCompanyGradeEntityUpdateQueueName() {
        return companyGradeEntityUpdateQueueName;
    }

    public String getQueueName() {
        return queueName;
    }

    public String getOrderDirectName() {
        return orderDirectName;
    }

    public String getOrderStateDirectName() {
        return orderStateDirectName;
    }

    public String getEquipmentDirectName() {
        return equipmentDirectName;
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

    public String getMenuCategoryEntityUpdateQueueName() {
        return menuCategoryEntityUpdateQueueName;
    }

    public String getMenuCategoryEntityDeleteQueueName() {
        return menuCategoryEntityDeleteQueueName;
    }

    public String getMenuProductEntityUpdateQueueName() {
        return menuProductEntityUpdateQueueName;
    }

    public String getMenuProductEntityDeleteQueueName() {
        return menuProductEntityDeleteQueueName;
    }

    public String getPromoEntityUpdateQueueName() {
        return promoEntityUpdateQueueName;
    }

    public String getPromoEntityDeleteQueueName() {
        return promoEntityDeleteQueueName;
    }
}
