package com.oyorooms.service.rankingservice.prediction;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class PredictionRequest implements Serializable {
    private String cityid;
    private Map<String, List<Double>> features;

    public PredictionRequest(String cityid, Map<String, List<Double>> features) {
        this.cityid = cityid;
        this.features = features;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public Map<String, List<Double>> getFeatures() {
        return features;
    }

    public void setFeatures(Map<String, List<Double>> features) {
        this.features = features;
    }
}
