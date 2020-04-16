package com.oyorooms.service.rankingservice.ranking;

import com.oyorooms.service.rankingservice.prediction.PredictionResponse;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class SortingComparator {

    public RankingResponse sortHotels(PredictionResponse response)
    {
        Map<String, Double> map = response.getResponse();
        List<Map.Entry<String, Double> > hotelList = new LinkedList<>(map.entrySet());
        Collections.sort(hotelList, (hotel1, hotel2) -> (hotel2.getValue()).compareTo(hotel1.getValue()));
//        HashMap<String, Double> sortedMap = new LinkedHashMap<String, Double>();
//        for (Map.Entry<String, Double> hotel : hotelList)
//            sortedMap.put(hotel.getKey(), hotel.getValue());
//        return sortedMap;
        List<String> sortedHotel = new ArrayList<>();
        for (Map.Entry<String, Double> hotel : hotelList)
            sortedHotel.add(hotel.getKey());
        return new RankingResponse(sortedHotel);
    }

}
