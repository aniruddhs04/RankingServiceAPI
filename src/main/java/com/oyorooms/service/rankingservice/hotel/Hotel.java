// Separate features into diff classes

package com.oyorooms.service.rankingservice.hotel;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Test")
public class Hotel implements Serializable {
    private String objective;
    @Id private String hotelid;
    private String requestid;
    private Double fprice;
    private String realisedBooking;
    private String bookingFlag;
    private String detailsFlag;
    private Double hotelType;
    private String rank;
    private Double user_abp;
    private Double discount_per;
    private Double hotel_user_br;
    private Double hotel_user_ctr;
    private Double hotel_user_btod;
    private Double is_weekend_checkin;
    private Double recom_score;
    private String is_nearBy_search;
    private Double is_city_search;
    private String vicinity;
    private Double ratingMean;
    private Double ratingCount;
    private Double hotel_placeid_ctr;
    private Double hotel_placeid_br;
    private Double hotel_placeid_dtob;
    private Double user_cat_ctr;
    private Double user_cat_br;
    private Double user_cat_dtob;
    private String is_locality_search;
    private Double distance;
    private String csv_weight;

    public Hotel() { }

    public Hotel(String objective, String hotelid, String requestid, Double fprice, String realisedBooking, String bookingFlag, String detailsFlag, Double hotelType, String rank, Double user_abp, Double discount_per, Double hotel_user_br, Double hotel_user_ctr, Double hotel_user_btod, Double is_weekend_checkin, Double recom_score, String is_nearBy_search, Double is_city_search, String vicinity, Double ratingMean, Double ratingCount, Double hotel_placeid_ctr, Double hotel_placeid_br, Double hotel_placeid_dtob, Double user_cat_ctr, Double user_cat_br, Double user_cat_dtob, String is_locality_search, Double distance, String csv_weight) {
        this.objective = objective;
        this.hotelid = hotelid;
        this.requestid = requestid;
        this.fprice = fprice;
        this.realisedBooking = realisedBooking;
        this.bookingFlag = bookingFlag;
        this.detailsFlag = detailsFlag;
        this.hotelType = hotelType;
        this.rank = rank;
        this.user_abp = user_abp;
        this.discount_per = discount_per;
        this.hotel_user_br = hotel_user_br;
        this.hotel_user_ctr = hotel_user_ctr;
        this.hotel_user_btod = hotel_user_btod;
        this.is_weekend_checkin = is_weekend_checkin;
        this.recom_score = recom_score;
        this.is_nearBy_search = is_nearBy_search;
        this.is_city_search = is_city_search;
        this.vicinity = vicinity;
        this.ratingMean = ratingMean;
        this.ratingCount = ratingCount;
        this.hotel_placeid_ctr = hotel_placeid_ctr;
        this.hotel_placeid_br = hotel_placeid_br;
        this.hotel_placeid_dtob = hotel_placeid_dtob;
        this.user_cat_ctr = user_cat_ctr;
        this.user_cat_br = user_cat_br;
        this.user_cat_dtob = user_cat_dtob;
        this.is_locality_search = is_locality_search;
        this.distance = distance;
        this.csv_weight = csv_weight;
    }

    public Hotel(String hotelid, Double fprice, Double hotelType, Double user_abp, Double discount_per, Double hotel_user_br, Double hotel_user_ctr, Double hotel_user_btod, Double is_weekend_checkin, Double recom_score, Double is_city_search, Double ratingMean, Double ratingCount, Double hotel_placeid_ctr, Double hotel_placeid_br, Double hotel_placeid_dtob, Double user_cat_ctr, Double user_cat_br, Double user_cat_dtob, Double distance) {
        this.hotelid = hotelid;
        this.fprice = fprice;
        this.hotelType = hotelType;
        this.user_abp = user_abp;
        this.discount_per = discount_per;
        this.hotel_user_br = hotel_user_br;
        this.hotel_user_ctr = hotel_user_ctr;
        this.hotel_user_btod = hotel_user_btod;
        this.is_weekend_checkin = is_weekend_checkin;
        this.recom_score = recom_score;
        this.is_city_search = is_city_search;
        this.ratingMean = ratingMean;
        this.ratingCount = ratingCount;
        this.hotel_placeid_ctr = hotel_placeid_ctr;
        this.hotel_placeid_br = hotel_placeid_br;
        this.hotel_placeid_dtob = hotel_placeid_dtob;
        this.user_cat_ctr = user_cat_ctr;
        this.user_cat_br = user_cat_br;
        this.user_cat_dtob = user_cat_dtob;
        this.distance = distance;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getHotelid() {
        return hotelid;
    }

    public void setHotelid(String hotelid) {
        this.hotelid = hotelid;
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }

    public Double getFprice() {
        return fprice;
    }

    public void setFprice(Double fprice) {
        this.fprice = fprice;
    }

    public String getRealisedBooking() {
        return realisedBooking;
    }

    public void setRealisedBooking(String realisedBooking) {
        this.realisedBooking = realisedBooking;
    }

    public String getBookingFlag() {
        return bookingFlag;
    }

    public void setBookingFlag(String bookingFlag) {
        this.bookingFlag = bookingFlag;
    }

    public String getDetailsFlag() {
        return detailsFlag;
    }

    public void setDetailsFlag(String detailsFlag) {
        this.detailsFlag = detailsFlag;
    }

    public Double getHotelType() {
        return hotelType;
    }

    public void setHotelType(Double hotelType) {
        this.hotelType = hotelType;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Double getUser_abp() {
        return user_abp;
    }

    public void setUser_abp(Double user_abp) {
        this.user_abp = user_abp;
    }

    public Double getDiscount_per() {
        return discount_per;
    }

    public void setDiscount_per(Double discount_per) {
        this.discount_per = discount_per;
    }

    public Double getHotel_user_br() {
        return hotel_user_br;
    }

    public void setHotel_user_br(Double hotel_user_br) {
        this.hotel_user_br = hotel_user_br;
    }

    public Double getHotel_user_ctr() {
        return hotel_user_ctr;
    }

    public void setHotel_user_ctr(Double hotel_user_ctr) {
        this.hotel_user_ctr = hotel_user_ctr;
    }

    public Double getHotel_user_btod() {
        return hotel_user_btod;
    }

    public void setHotel_user_btod(Double hotel_user_btod) {
        this.hotel_user_btod = hotel_user_btod;
    }

    public Double getIs_weekend_checkin() {
        return is_weekend_checkin;
    }

    public void setIs_weekend_checkin(Double is_weekend_checkin) {
        this.is_weekend_checkin = is_weekend_checkin;
    }

    public Double getRecom_score() {
        return recom_score;
    }

    public void setRecom_score(Double recom_score) {
        this.recom_score = recom_score;
    }

    public String getIs_nearBy_search() {
        return is_nearBy_search;
    }

    public void setIs_nearBy_search(String is_nearBy_search) {
        this.is_nearBy_search = is_nearBy_search;
    }

    public Double getIs_city_search() {
        return is_city_search;
    }

    public void setIs_city_search(Double is_city_search) {
        this.is_city_search = is_city_search;
    }

    public String getVicinity() {
        return vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }

    public Double getRatingMean() {
        return ratingMean;
    }

    public void setRatingMean(Double ratingMean) {
        this.ratingMean = ratingMean;
    }

    public Double getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Double ratingCount) {
        this.ratingCount = ratingCount;
    }

    public Double getHotel_placeid_ctr() {
        return hotel_placeid_ctr;
    }

    public void setHotel_placeid_ctr(Double hotel_placeid_ctr) {
        this.hotel_placeid_ctr = hotel_placeid_ctr;
    }

    public Double getHotel_placeid_br() {
        return hotel_placeid_br;
    }

    public void setHotel_placeid_br(Double hotel_placeid_br) {
        this.hotel_placeid_br = hotel_placeid_br;
    }

    public Double getHotel_placeid_dtob() {
        return hotel_placeid_dtob;
    }

    public void setHotel_placeid_dtob(Double hotel_placeid_dtob) {
        this.hotel_placeid_dtob = hotel_placeid_dtob;
    }

    public Double getUser_cat_ctr() {
        return user_cat_ctr;
    }

    public void setUser_cat_ctr(Double user_cat_ctr) {
        this.user_cat_ctr = user_cat_ctr;
    }

    public Double getUser_cat_br() {
        return user_cat_br;
    }

    public void setUser_cat_br(Double user_cat_br) {
        this.user_cat_br = user_cat_br;
    }

    public Double getUser_cat_dtob() {
        return user_cat_dtob;
    }

    public void setUser_cat_dtob(Double user_cat_dtob) {
        this.user_cat_dtob = user_cat_dtob;
    }

    public String getIs_locality_search() {
        return is_locality_search;
    }

    public void setIs_locality_search(String is_locality_search) {
        this.is_locality_search = is_locality_search;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getCsv_weight() {
        return csv_weight;
    }

    public void setCsv_weight(String csv_weight) {
        this.csv_weight = csv_weight;
    }
}
