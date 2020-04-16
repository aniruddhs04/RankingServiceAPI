package com.oyorooms.service.rankingservice.features;

import com.oyorooms.service.rankingservice.hotel.Hotel;
import org.springframework.stereotype.Component;

@Component
public interface Features {

    public Double calculate(Hotel hotel);
}
