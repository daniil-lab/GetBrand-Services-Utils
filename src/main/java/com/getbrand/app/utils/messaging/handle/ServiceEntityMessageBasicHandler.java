package com.getbrand.app.utils.messaging.handle;

import com.getbrand.app.utils.messaging.entity.ServiceEntityMessage;

public interface ServiceEntityMessageBasicHandler<T> {
    void receive(ServiceEntityMessage<T> data);

    void endProcessing(ServiceEntityMessage<T> data);
}
