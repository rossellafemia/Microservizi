package biblioteca.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import biblioteca.entities.Prestiti;

public interface PrestitiDAO extends MongoRepository<Prestiti, String> {
	
}
