package com.oyorooms.service.rankingservice.hotel;

import com.oyorooms.service.rankingservice.es.ESService;
import com.oyorooms.service.rankingservice.redis.RedisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class HotelService {

    @Autowired
    private RedisRepository redisRepository;

    @Autowired
    private ESService esService;

    public List<Hotel> getHotelData(List<String> hotelids) throws IOException {
        List<Hotel> hotelList = new ArrayList<>();
        List<String> hotelInES = new ArrayList<>();
        for(String hotelid : hotelids) {
            Optional<Hotel> data = redisRepository.findById(hotelid);
            if(data.isPresent())
                    hotelList.add(data.get());
            else
                hotelInES.add(hotelid);
        }
        hotelList.addAll(esService.getHotels(hotelInES));
        return hotelList;
    }
}