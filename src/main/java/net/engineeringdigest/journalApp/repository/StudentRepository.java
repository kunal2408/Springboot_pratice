package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalApp.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
