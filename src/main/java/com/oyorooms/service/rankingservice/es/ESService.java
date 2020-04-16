package com.oyorooms.service.rankingservice.es;

import com.oyorooms.service.rankingservice.hotel.Hotel;
import io.searchbox.client.JestClient;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ESService {

    @Autowired
    private ESConfiguration esConfiguration;

    public List<Hotel> getAllHotels() throws IOException {
        JestClient client = esConfiguration.getESClient();
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchAllQuery());
        searchSourceBuilder.size(10000);
        Search search = new Search.Builder(searchSourceBuilder.toString())
                .addIndex("pune1")
                .build();
        SearchResult searchResult = client.execute(search);
        List<SearchResult.Hit<Hotel, Void>> searchHits = searchResult.getHits(Hotel.class);
        List<Hotel> results = searchHits.stream()
                .map(h -> h.source)
                .collect(Collectors.toList());
//        List<Hotel> results = result.getSourceAsObjectList(Hotel.class);
        client.close();
        return results;
    }

    public List<Hotel> getHotels(List<String> hotelid) throws IOException {
        JestClient client = esConfiguration.getESClient();
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.termsQuery("hotelid", hotelid));
        searchSourceBuilder.size(10000);
        Search search = new Search.Builder(searchSourceBuilder.toString())
                .addIndex("pune1")
                .build();
        SearchResult searchResult = client.execute(search);
        List<SearchResult.Hit<Hotel, Void>> searchHits = searchResult.getHits(Hotel.class);
        List<Hotel> results = searchHits.stream()
                .map(h -> h.source)
                .collect(Collectors.toList());
        client.close();
        return results;
    }
}
