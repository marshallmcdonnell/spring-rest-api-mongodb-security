package gov.ornl.ae.spring_rest_api_mongodb_security.repositories;

import gov.ornl.ae.spring_rest_api_mongodb_security.models.Rappers;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RappersRepository extends MongoRepository<Rappers, String> {
  Rappers findBy_id(ObjectId _id);
}
