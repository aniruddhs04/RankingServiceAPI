package com.oyorooms.service.rankingservice.features;

import com.oyorooms.service.rankingservice.hotel.Hotel;
import org.springframework.stereotype.Component;

@Component
public class DiscountPer implements Features {

    @Override
    public Double calculate(Hotel hotel) {
        Double sprice = hotel.getSprice();
        Double fprice = hotel.getFprice();
        return 1-fprice/sprice;
    }
}
