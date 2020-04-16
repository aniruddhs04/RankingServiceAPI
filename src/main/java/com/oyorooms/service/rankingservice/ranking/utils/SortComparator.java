package com.oyorooms.service.rankingservice.ranking.utils;

import com.oyorooms.service.rankingservice.prediction.PredictionResponse;
import com.oyorooms.service.rankingservice.ranking.RankingResponse;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class SortComparator {

    public RankingResponse sortHotels(PredictionResponse response)
    {
        Map<String, Double> map = response.getResponse();
        List<Map.Entry<String, Double> > hotelList = new LinkedList<>(map.entrySet());
        Collections.sort(hotelList, (hotel1, hotel2) -> (hotel2.getValue()).compareTo(hotel1.getValue()));
        List<String> sortedHotel = new ArrayList<>();
        for (Map.Entry<String, Double> hotel : hotelList)
            sortedHotel.add(hotel.getKey());
        return new RankingResponse(sortedHotel);
    }

}
