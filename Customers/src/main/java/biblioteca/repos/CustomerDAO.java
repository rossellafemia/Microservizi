package biblioteca.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.entities.Customer;

public interface CustomerDAO extends JpaRepository<Customer, Integer> {
	
	

}
