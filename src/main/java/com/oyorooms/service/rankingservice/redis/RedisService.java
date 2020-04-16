package com.oyorooms.service.rankingservice.redis;

import com.oyorooms.service.rankingservice.hotel.Hotel;
import com.oyorooms.service.rankingservice.hotel.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisService {

    @Autowired
    private HotelRepository hotelRepository;

    @RequestMapping("/save")
    public void save() {
        Hotel hotel1 = new Hotel("43486", 865.0, 1.0, 0.0, 0.444801026957638, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.2, 1071.0, 0.0704279715189888, 0.00148739554987637, 0.0208870664271615, 0.0, 0.0, 0.0, 11.7133766369086);
        Hotel hotel2 = new Hotel("653528", 195.0, 1.0, 0.0, 0.3344801026957638, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.7, 301.0, 0.0704279715189888, 0.00148739554987637, 0.0208870664271615, 0.0, 0.0, 0.0, 19.7133766369086);

        hotelRepository.save(hotel1);
        hotelRepository.save(hotel2);
    }

    @RequestMapping("/get/{id}")
    public boolean get(@PathVariable("id") String id) {
        return hotelRepository.existsById(id);
    }

    @RequestMapping("/print")
    public void print() {
        System.out.println(hotelRepository.findAll());
    }
}
