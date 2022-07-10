package com.example.seriesservice.repository;

import com.example.seriesservice.model.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SerieReposytory extends MongoRepository<Serie, Long> {
}
