package biblioteca.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import biblioteca.entities.Prestiti;

@Component
public interface PrestitiDAO extends MongoRepository<Prestiti, String> {
	
}
