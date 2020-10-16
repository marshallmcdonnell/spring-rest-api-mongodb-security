package gov.ornl.ae.spring_rest_api_mongodb_security.repositories;

import gov.ornl.ae.spring_rest_api_mongodb_security.models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, String> {
  Users findByUsername(String username);
}
