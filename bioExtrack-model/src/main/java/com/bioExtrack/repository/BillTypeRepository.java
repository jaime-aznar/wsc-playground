package com.bioExtrack.repository;

import com.bioExtrack.entity.BillType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BillTypeRepository extends MongoRepository<BillType, Integer> {
}
