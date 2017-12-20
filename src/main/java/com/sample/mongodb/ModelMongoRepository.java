package com.sample.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ModelMongoRepository extends MongoRepository<Model, String> {
}     