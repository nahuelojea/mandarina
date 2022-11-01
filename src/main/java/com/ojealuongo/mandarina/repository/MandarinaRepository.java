package com.ojealuongo.mandarina.repository;

import com.ojealuongo.mandarina.entity.Mandarina;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MandarinaRepository extends MongoRepository<Mandarina, UUID> {
}
