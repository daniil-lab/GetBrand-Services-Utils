package com.getbrand.app.utils;

import com.getbrand.app.utils.poster.models.PosterIntegration;
import com.getbrand.app.utils.poster.models.PosterIntegrationApiData;
import com.getbrand.app.utils.poster.request.CreatePosterIntegrationRequest;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuples;

public class IntegrationFactory {
    public Tuple2<PosterIntegrationApiData, PosterIntegration> createIntegration(CreatePosterIntegrationRequest request) {
        PosterIntegrationApiData apiData = new PosterIntegrationApiData(request.getApiKey());
        return Tuples.of(apiData, new PosterIntegration(request.getCompanyId(), apiData));
    }
}
