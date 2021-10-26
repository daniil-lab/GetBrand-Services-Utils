package com.getbrand.app.utils.messaging.handle;

import com.getbrand.app.utils.messaging.entity.ServiceEntityMessage;

public interface ServiceEntityMessageCreateHandler<T> {
    void handleCreate(ServiceEntityMessage<T> data);
}
