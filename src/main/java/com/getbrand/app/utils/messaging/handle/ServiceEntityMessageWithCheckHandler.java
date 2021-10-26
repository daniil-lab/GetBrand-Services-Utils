package com.getbrand.app.utils.messaging.handle;

import java.util.UUID;

public interface ServiceEntityMessageWithCheckHandler {
    boolean checkMessage(UUID id);
}
