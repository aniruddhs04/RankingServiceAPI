package com.oyorooms.service.rankingservice.features;


import com.oyorooms.service.rankingservice.hotel.Hotel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class FeatureMapper {

    public List<Double> getFeatureValues(Hotel hotel, List<String> features) {
        Map<String, Double> featureMap = getFeatureMap(hotel);
        List<Double> featureValues = new ArrayList<>();
        for(String f : features)
            featureValues.add(featureMap.get(f));
        return featureValues;
    }

    public Map<String, Double> getFeatureMap(Hotel hotel) {
        Map<String, Double> featureMap= new HashMap<String, Double>();
        featureMap.put("fprice", hotel.getFprice());
        featureMap.put("hotelType", hotel.getHotelType());
        featureMap.put("user_abp", hotel.getUser_abp());
        featureMap.put("discount_per", hotel.getDiscount_per());
        featureMap.put("hotel_user_br", hotel.getHotel_user_br());
        featureMap.put("hotel_user_ctr", hotel.getHotel_user_ctr());
        featureMap.put("hotel_user_btod", hotel.getHotel_user_btod());
        featureMap.put("is_weekend_checkin", hotel.getIs_weekend_checkin());
        featureMap.put("recom_score", hotel.getRecom_score());
        featureMap.put("is_city_search", hotel.getIs_city_search());
        featureMap.put("ratingMean", hotel.getRatingMean());
        featureMap.put("ratingCount", hotel.getRatingCount());
        featureMap.put("hotel_placeid_ctr", hotel.getHotel_placeid_ctr());
        featureMap.put("hotel_placeid_br", hotel.getHotel_placeid_br());
        featureMap.put("hotel_placeid_dtob", hotel.getHotel_placeid_dtob());
        featureMap.put("user_cat_ctr", hotel.getUser_cat_ctr());
        featureMap.put("user_cat_br", hotel.getUser_cat_br());
        featureMap.put("user_cat_dtob", hotel.getUser_cat_dtob());
        featureMap.put("distance", hotel.getDistance());
        return featureMap;
    }

}
