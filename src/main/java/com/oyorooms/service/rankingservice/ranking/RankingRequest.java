package com.oyorooms.service.rankingservice.ranking;

import java.util.List;

public class RankingRequest {
    private String userid;
    private String cityid;
    private List<String> hotelid;

    public RankingRequest() {
    }

    public RankingRequest(String userid, String cityid, List<String> hotelid) {
        this.userid = userid;
        this.cityid = cityid;
        this.hotelid = hotelid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public List<String> getHotelid() {
        return hotelid;
    }

    public void setHotelid(List<String> hotelid) {
        this.hotelid = hotelid;
    }
}
