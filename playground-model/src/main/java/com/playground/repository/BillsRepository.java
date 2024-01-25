package com.playground.repository;

import com.playground.entity.Bill;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BillsRepository extends MongoRepository<Bill, Integer> {
}
