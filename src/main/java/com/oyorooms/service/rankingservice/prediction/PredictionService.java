// RestTemplate needs to be Autowired

package com.oyorooms.service.rankingservice.prediction;

import com.oyorooms.service.rankingservice.ranking.RankingRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RestController
public class PredictionService {

    private static final String uri = "http://localhost:5000/";

    @Autowired
    private PredictionHandler predictionHandler;

    public PredictionResponse getPrediction(RankingRequest rankingRequest) throws IOException {
        PredictionRequest predictionRequest = predictionHandler.requestObject(rankingRequest);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(uri, predictionRequest, PredictionResponse.class);
    }
}
