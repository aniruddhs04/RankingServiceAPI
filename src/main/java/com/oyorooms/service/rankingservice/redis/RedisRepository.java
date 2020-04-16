package com.oyorooms.service.rankingservice.redis;

import com.oyorooms.service.rankingservice.hotel.Hotel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedisRepository extends CrudRepository<Hotel, String> {
}
