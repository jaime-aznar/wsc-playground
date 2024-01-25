package com.playground.repository;

import com.playground.entity.Weight;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeightsRepository extends MongoRepository<Weight, Integer> {
}
