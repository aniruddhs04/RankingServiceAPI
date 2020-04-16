package com.oyorooms.service.rankingservice.hotel;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Test")
public class Hotel implements Serializable {
//    private String objective;
    @Id private String hotelid;
    private Double fprice;
    private Double hotelType;
    private Double user_abp;
    private Double is_weekend_checkin;
    private Double recom_score;
    private Double is_city_search;
    private Double ratingMean;
    private Double ratingCount;
    private Double distance;
//    private Double discount_per;
//    private Double hotel_user_br;
//    private Double hotel_user_ctr;
//    private Double hotel_user_btod;
//    private String vicinity;
//    private Double hotel_placeid_ctr;
//    private Double hotel_placeid_br;
//    private Double hotel_placeid_dtob;
//    private Double user_cat_ctr;
//    private Double user_cat_br;
//    private Double user_cat_dtob;
    //HARDCODED
    private Double sprice = 2000.0;
    private Double bookingCount = 40.0;
    private Double detailCount = 5000.0;
    private Double impressionCount = 10000.0;

    public String getHotelid() {
        return hotelid;
    }

    public Double getFprice() {
        return fprice;
    }

    public Double getDistance() {
        return distance;
    }

    public Double getHotelType() {
        return hotelType;
    }

    public Double getUser_abp() {
        return user_abp;
    }

    public Double getIs_weekend_checkin() {
        return is_weekend_checkin;
    }

    public Double getRecom_score() {
        return recom_score;
    }

    public Double getIs_city_search() {
        return is_city_search;
    }

    public Double getRatingMean() {
        return ratingMean;
    }

    public Double getRatingCount() {
        return ratingCount;
    }

    public Double getSprice() {
        return sprice;
    }

    public Double getBookingCount() {
        return bookingCount;
    }

    public Double getDetailCount() {
        return detailCount;
    }

    public Double getImpressionCount() {
        return impressionCount;
    }
}
