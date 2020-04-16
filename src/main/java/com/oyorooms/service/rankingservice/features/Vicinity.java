package com.oyorooms.service.rankingservice.features;

import com.oyorooms.service.rankingservice.hotel.Hotel;
import org.springframework.stereotype.Component;

@Component
public class Vicinity implements Features {

    @Override
    public Double calculate(Hotel hotel) {
        if(hotel.getDistance()<=5.0)
            return 1.0;
        else
            return 0.0;
    }
}
