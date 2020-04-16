package com.oyorooms.service.rankingservice.prediction;

import java.io.Serializable;
import java.util.Map;

public class PredictionResponse implements Serializable {
    private Map<String, Double> response;

    public PredictionResponse() {
    }

    public PredictionResponse(Map<String, Double> response) {
        this.response = response;
    }

    public Map<String, Double> getResponse() {
        return response;
    }

    public void setResponse(Map<String, Double> response) {
        this.response = response;
    }
}
