package com.getbrand.app.utils.messaging.handle;

import com.getbrand.app.utils.messaging.entity.ServiceCheckMessage;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public class BasicRepositoryMessageChecker implements ServiceEntityMessageWithCheckHandler {

    private final CrudRepository repository;

    public BasicRepositoryMessageChecker(CrudRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean checkMessage(UUID id) {
        Optional<Object> message = repository.findById(id);

        return message.isEmpty();
    }
}
