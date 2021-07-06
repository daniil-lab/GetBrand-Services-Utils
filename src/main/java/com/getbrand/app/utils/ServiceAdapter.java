package com.getbrand.app.utils;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

public class ServiceAdapter {
    private DiscoveryClient discoveryClient;

    public ServiceAdapter(DiscoveryClient client) {
        this.discoveryClient = client;
    }

    public DiscoveryClient getDiscoveryClient() {
        return discoveryClient;
    }

    public ServiceInstance getPosterService() {
        try {
            return discoveryClient.getInstances("posterservice").get(0);
        } catch (Exception e) {
            return null;
        }
    }

    public ServiceInstance getMenuService() {
        try {
            return discoveryClient.getInstances("menuservice").get(0);
        } catch (Exception e) {
            return null;
        }
    }

    public ServiceInstance getPromoService() {
        try {
            return discoveryClient.getInstances("promoservice").get(0);
        } catch (Exception e) {
            return null;
        }
    }

    public ServiceInstance getCompanyService() {
        try {
            return discoveryClient.getInstances("companyservice").get(0);
        } catch (Exception e) {
            return null;
        }
    }
}
