package com.oyorooms.service.rankingservice.es;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.config.HttpClientConfig;
import org.springframework.stereotype.Component;

@Component
public class ESConfiguration {

    private static final String uri = "http://localhost:9200";

    public JestClient getESClient() {
        JestClientFactory factory = new JestClientFactory();
        factory.setHttpClientConfig(
                new HttpClientConfig.Builder(uri)
                .multiThreaded(true)
                .defaultMaxTotalConnectionPerRoute(2)
                .maxTotalConnection(10)
                .build()
        );
        return factory.getObject();
    }
}
