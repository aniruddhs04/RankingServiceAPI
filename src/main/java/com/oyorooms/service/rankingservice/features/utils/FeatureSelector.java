package com.oyorooms.service.rankingservice.features.utils;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FeatureSelector {

    public List<String> getFeatureNames(String cityid){
        List<String> featureNames = new ArrayList<>();
        if(cityid.equals("11"))
        {
            featureNames.add("fprice");
            featureNames.add("hotelType");
            featureNames.add("user_abp");
            featureNames.add("discount_per");
            featureNames.add("hotel_user_br");
            featureNames.add("hotel_user_ctr");
            featureNames.add("hotel_user_btod");
            featureNames.add("is_weekend_checkin");
            featureNames.add("recom_score");
            featureNames.add("is_city_search");
            featureNames.add("ratingMean");
            featureNames.add("ratingCount");
            featureNames.add("hotel_placeid_ctr");
            featureNames.add("hotel_placeid_br");
            featureNames.add("hotel_placeid_dtob");
            featureNames.add("user_cat_ctr");
            featureNames.add("user_cat_br");
            featureNames.add("user_cat_dtob");
            featureNames.add("distance");
        }
        return featureNames;
    }
}
