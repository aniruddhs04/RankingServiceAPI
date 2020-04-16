package com.oyorooms.service.rankingservice.features.utils;

import com.oyorooms.service.rankingservice.features.*;
import com.oyorooms.service.rankingservice.hotel.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class FeatureMapper {

    @Autowired private BookingCount bookingCount;
    @Autowired private DetailCount detailCount;
    @Autowired private DiscountPer discountPer;
    @Autowired private Distance distance;
    @Autowired private FPrice fPrice;
    @Autowired private HotelPlaceidBr hotelPlaceidBr;
    @Autowired private HotelPlaceidCtr hotelPlaceidCtr;
    @Autowired private HotelPlaceidDtob hotelPlaceidDtob;
    @Autowired private HotelType hotelType;
    @Autowired private HotelUserBr hotelUserBr;
    @Autowired private HotelUserBtod hotelUserBtod;
    @Autowired private HotelUserCtr hotelUserCtr;
    @Autowired private ImpressionCount impressionCount;
    @Autowired private IsCitySearch isCitySearch;
    @Autowired private IsWeekendCheckin isWeekendCheckin;
    @Autowired private RatingCount ratingCount;
    @Autowired private RatingMean ratingMean;
    @Autowired private RecomScore recomScore;
    @Autowired private SPrice sPrice;
    @Autowired private UserAbp userAbp;
    @Autowired private UserCatBr userCatBr;
    @Autowired private UserCatCtr userCatCtr;
    @Autowired private UserCatDtob userCatDtob;
    @Autowired private Vicinity vicinity;


    public List<Double> getFeatureValues(Hotel hotel, List<String> features) {
        Map<String, Double> featureMap = getFeatureMap(hotel);
        List<Double> featureValues = new ArrayList<>();
        for(String f : features)
            featureValues.add(featureMap.get(f));
        return featureValues;
    }

    public Map<String, Double> getFeatureMap(Hotel hotel) {
        Map<String, Double> featureMap= new HashMap<String, Double>();
        featureMap.put("bookingcount", bookingCount.calculate(hotel));
        featureMap.put("detailcount", detailCount.calculate(hotel));
        featureMap.put("discount_per", discountPer.calculate(hotel));
        featureMap.put("distance", distance.calculate(hotel));
        featureMap.put("fprice", fPrice.calculate(hotel));
        featureMap.put("hotel_placeid_br", hotelPlaceidBr.calculate(hotel));
        featureMap.put("hotel_placeid_ctr", hotelPlaceidCtr.calculate(hotel));
        featureMap.put("hotel_placeid_dtob", hotelPlaceidDtob.calculate(hotel));
        featureMap.put("hotelType", hotelType.calculate(hotel));
        featureMap.put("hotel_user_br", hotelUserBr.calculate(hotel));
        featureMap.put("hotel_user_btod", hotelUserBtod.calculate(hotel));
        featureMap.put("hotel_user_ctr", hotelUserCtr.calculate(hotel));
        featureMap.put("impressioncount", impressionCount.calculate(hotel));
        featureMap.put("is_city_search", isCitySearch.calculate(hotel));
        featureMap.put("is_weekend_checkin", isWeekendCheckin.calculate(hotel));
        featureMap.put("ratingCount", ratingCount.calculate(hotel));
        featureMap.put("ratingMean", ratingMean.calculate(hotel));
        featureMap.put("recom_score", recomScore.calculate(hotel));
        featureMap.put("sprice", sPrice.calculate(hotel));
        featureMap.put("user_abp", userAbp.calculate(hotel));
        featureMap.put("user_cat_br", userCatBr.calculate(hotel));
        featureMap.put("user_cat_ctr", userCatCtr.calculate(hotel));
        featureMap.put("user_cat_dtob", userCatDtob.calculate(hotel));
        featureMap.put("vicinity", vicinity.calculate(hotel));
        return featureMap;
    }

}
