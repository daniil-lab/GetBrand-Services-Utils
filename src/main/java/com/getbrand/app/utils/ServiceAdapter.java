package com.getbrand.app.utils;

import com.getbrand.app.utils.exception.InternalErrorException;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import java.util.ArrayList;
import java.util.List;

public class ServiceAdapter {
    private DiscoveryClient discoveryClient;

    public ServiceAdapter(DiscoveryClient client) {
        this.discoveryClient = client;
    }

    public DiscoveryClient getDiscoveryClient() {
        return discoveryClient;
    }

    public ServiceInstance getOrderService() {
        try {
            return discoveryClient.getInstances("orderservice").get(0);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            List<ServiceSubError> subErrors = new ArrayList<>();

            subErrors.add(new ServiceSubError("Service error", "Poster service not available"));

            throw new InternalErrorException(subErrors);
        }
    }

    public ServiceInstance getPosterService() {
        try {
            return discoveryClient.getInstances("posterservice").get(0);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            List<ServiceSubError> subErrors = new ArrayList<>();

            subErrors.add(new ServiceSubError("Service error", "Poster service not available"));

            throw new InternalErrorException(subErrors);
        }
    }

    public ServiceInstance getLoyaltyService() {
        try {
            return discoveryClient.getInstances("loyaltyservice").get(0);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            List<ServiceSubError> subErrors = new ArrayList<>();

            subErrors.add(new ServiceSubError("Service error", "Poster service not available"));

            throw new InternalErrorException(subErrors);
        }
    }

    public ServiceInstance getFileService() {
        try {
            return discoveryClient.getInstances("fileservice").get(0);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            List<ServiceSubError> subErrors = new ArrayList<>();

            subErrors.add(new ServiceSubError("Service error", "Poster service not available"));

            throw new InternalErrorException(subErrors);
        }
    }


    public ServiceInstance getMenuService() {
        try {
            return discoveryClient.getInstances("menuservice").get(0);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            List<ServiceSubError> subErrors = new ArrayList<>();

            subErrors.add(new ServiceSubError("Service error", "Menu service not available"));

            throw new InternalErrorException(subErrors);
        }
    }

    public ServiceInstance getPromoService() {
        try {
            return discoveryClient.getInstances("promoservice").get(0);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            List<ServiceSubError> subErrors = new ArrayList<>();

            subErrors.add(new ServiceSubError("Service error", "Promo service not available"));

            throw new InternalErrorException(subErrors);
        }
    }

    public ServiceInstance getCompanyService() {
        try {
            return discoveryClient.getInstances("companyservice").get(0);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            List<ServiceSubError> subErrors = new ArrayList<>();

            subErrors.add(new ServiceSubError("Service error", "Company service not available"));

            throw new InternalErrorException(subErrors);
        }
    }

    public ServiceInstance getUserService() {
        try {
            return discoveryClient.getInstances("userservice").get(0);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            List<ServiceSubError> subErrors = new ArrayList<>();

            subErrors.add(new ServiceSubError("Service error", "Company service not available"));

            throw new InternalErrorException(subErrors);
        }
    }
}
