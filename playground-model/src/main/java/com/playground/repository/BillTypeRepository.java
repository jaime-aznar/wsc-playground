package com.playground.repository;

import com.playground.entity.BillType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BillTypeRepository extends MongoRepository<BillType, Integer> {
}
