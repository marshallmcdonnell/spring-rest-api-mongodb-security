package gov.ornl.ae.spring_rest_api_mongodb_security.endpoints;

import gov.ornl.ae.spring_rest_api_mongodb_security.models.Rappers;
import gov.ornl.ae.spring_rest_api_mongodb_security.repositories.RappersRepository;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/rappers")
public class RappersController {
  @Autowired
  private RappersRepository repository;

  // GET
  @RequestMapping(value = "", method = RequestMethod.GET)
  public List<Rappers> getAllRappers() {
    return repository.findAll();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Rappers getRappersById(@PathVariable("id") ObjectId id) {
    return repository.findBy_id(id);
  }

  // PUT
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public void modifyPetById(@PathVariable("id") ObjectId id, @Valid @RequestBody Rappers rappers) {
    rappers.set_id(id);
    repository.save(rappers);
  }

  // POST
  @RequestMapping(value = "", method = RequestMethod.POST)
  public Rappers createUser(@Valid @RequestBody Rappers rappers) {
    rappers.set_id(ObjectId.get());
    repository.save(rappers);
    return rappers;
  }

  // DELETE
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteUser(@PathVariable ObjectId id) {
    repository.delete(repository.findBy_id(id));
  }
}
