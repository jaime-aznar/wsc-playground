package com.bioExtrack.repository;

import com.bioExtrack.entity.Bill;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BillsRepository extends MongoRepository<Bill, Integer> {
}
