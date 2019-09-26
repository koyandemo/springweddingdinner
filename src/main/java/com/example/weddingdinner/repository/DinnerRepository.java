package com.example.weddingdinner.repository;

import com.example.weddingdinner.model.Dinner;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DinnerRepository extends MongoRepository<Dinner,String> {


}
