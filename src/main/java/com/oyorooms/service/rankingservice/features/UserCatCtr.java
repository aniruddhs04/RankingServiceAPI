package com.oyorooms.service.rankingservice.features;

import com.oyorooms.service.rankingservice.hotel.Hotel;
import org.springframework.stereotype.Component;

@Component
public class UserCatCtr implements Features {

    @Override
    public Double calculate(Hotel hotel) {
        return hotel.getDetailCount()/hotel.getImpressionCount();
    }
}
