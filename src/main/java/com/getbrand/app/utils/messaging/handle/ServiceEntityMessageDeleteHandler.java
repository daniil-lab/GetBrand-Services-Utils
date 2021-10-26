package com.getbrand.app.utils.messaging.handle;

import com.getbrand.app.utils.messaging.entity.ServiceEntityMessage;

public interface ServiceEntityMessageDeleteHandler<T> {
    void handleDelete(ServiceEntityMessage<T> data);
}
