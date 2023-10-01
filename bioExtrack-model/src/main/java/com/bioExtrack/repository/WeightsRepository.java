package com.bioExtrack.repository;

import com.bioExtrack.entity.Weight;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeightsRepository extends MongoRepository<Weight, Integer> {
}
