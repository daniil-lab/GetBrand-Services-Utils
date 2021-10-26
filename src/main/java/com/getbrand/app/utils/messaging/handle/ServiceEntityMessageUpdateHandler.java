package com.getbrand.app.utils.messaging.handle;

import com.getbrand.app.utils.messaging.entity.ServiceEntityMessage;

public interface ServiceEntityMessageUpdateHandler<T> {
    void handleUpdate(ServiceEntityMessage<T> data);
}
