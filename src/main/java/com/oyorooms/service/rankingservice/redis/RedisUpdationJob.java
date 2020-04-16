package com.oyorooms.service.rankingservice.redis;

import com.oyorooms.service.rankingservice.es.ESService;
import com.oyorooms.service.rankingservice.hotel.Hotel;
import com.oyorooms.service.rankingservice.hotel.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class RedisUpdationJob {

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private ESService esService;

    @Scheduled(fixedRate = 600000)
    public void redisJob() throws IOException {
        System.out.println("-----Redis Job Started-----");
        List<Hotel> hotelList = esService.getAllHotels();
        for (Hotel hotel : hotelList)
            hotelRepository.save(hotel);
        System.out.println("-----Redis Job Finished-----");
    }
}
