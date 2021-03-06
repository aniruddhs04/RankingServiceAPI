package com.oyorooms.service.rankingservice.ranking;

import com.oyorooms.service.rankingservice.prediction.PredictionResponse;
import com.oyorooms.service.rankingservice.prediction.PredictionService;
import com.oyorooms.service.rankingservice.ranking.utils.SortComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class RankingController {

    @Autowired
    private PredictionService predictionService;

    @Autowired
    private SortComparator sortComparator;

    @RequestMapping(value = "/rank", method = RequestMethod.POST)
    public RankingResponse getRankedHotels(@RequestBody RankingRequest rankingRequest) throws IOException {
        PredictionResponse prediction = predictionService.getPrediction(rankingRequest);
        return sortComparator.sortHotels(prediction);
    }
}
