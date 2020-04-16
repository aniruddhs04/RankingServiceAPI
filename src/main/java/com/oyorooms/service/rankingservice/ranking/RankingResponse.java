package com.oyorooms.service.rankingservice.ranking;

import java.util.List;

public class RankingResponse {
    private List<String> hotelid;

    public RankingResponse() {
    }

    public RankingResponse(List<String> hotelid) {
        this.hotelid = hotelid;
    }

    public List<String> getResponse() {
        return hotelid;
    }

    public void setResponse(List<String> hotelid) {
        this.hotelid = hotelid;
    }
}
