package com.getbrand.app.utils.saga;

public interface SagaAction {
    void start() throws Exception;

    void compensation();
}
