package com.oyorooms.service.rankingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RankingserviceApplication {

    public static void main(String[] args){
        SpringApplication.run(RankingserviceApplication.class, args);
        //Static Class
    }
}
