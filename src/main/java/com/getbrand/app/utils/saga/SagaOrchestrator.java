package com.getbrand.app.utils.saga;

import java.util.ArrayList;
import java.util.List;

public abstract class SagaOrchestrator {
    protected List<SagaAction> actionList = new ArrayList<>();

    public void startSaga() {
        for(int i = 0; i < actionList.size(); i++) {
            try {
                actionList.get(i).start();
            } catch (Exception e) {
                e.printStackTrace();

                try {
                    compensate(i);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    private void compensate(int idx) {
        for(int i = 0; i < idx; i++) {
            actionList.get(i).compensation();
        }
    }

    public SagaOrchestrator addStep(SagaAction action) {
        this.actionList.add(action);
        return this;
    }
}
