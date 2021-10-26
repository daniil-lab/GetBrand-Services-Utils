package com.getbrand.app.utils.messaging.data.status;

import org.springframework.stereotype.Component;

@Component
public class StatusMessagingData {
    private final String directName = "StatusEntity";

    private final String queueName = "StatusService";

    public StatusMessagingData() {};

    public String getDirectName() {
        return directName;
    }

    public String getQueueName() {
        return queueName;
    }
}
