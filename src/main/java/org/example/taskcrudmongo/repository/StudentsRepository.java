package org.example.taskcrudmongo.repository;

import org.example.taskcrudmongo.dto.Students;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentsRepository extends MongoRepository<Students, Long>{

}
