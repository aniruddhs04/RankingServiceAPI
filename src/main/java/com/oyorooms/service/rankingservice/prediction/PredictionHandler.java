package com.oyorooms.service.rankingservice.prediction;

import com.oyorooms.service.rankingservice.hotel.Hotel;
import com.oyorooms.service.rankingservice.hotel.HotelService;
import com.oyorooms.service.rankingservice.features.FeatureMapper;
import com.oyorooms.service.rankingservice.features.FeatureSelector;
import com.oyorooms.service.rankingservice.ranking.RankingRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PredictionHandler {

    @Autowired
    private HotelService hotelService;

    @Autowired
    private FeatureSelector featureSelector;

    @Autowired
    private FeatureMapper featureMapper;

    public PredictionRequest requestObject(RankingRequest rankingRequest) throws IOException {
        String cityid = rankingRequest.getCityid();
        List<String> hotelids = rankingRequest.getHotelid();
        List<Hotel> hotelList = hotelService.getHotelData(hotelids);
        Map<String, List<Double>> features = new HashMap<>();
        List<String> featureNames= featureSelector.getFeatureNames(cityid);
        for(Hotel hotel : hotelList) {
            List<Double> featureValues = featureMapper.getFeatureValues(hotel,featureNames);
            features.put(hotel.getHotelid(),featureValues);
        }
        return new PredictionRequest(cityid, features);
    }
}
