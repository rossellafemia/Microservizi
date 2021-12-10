package biblioteca.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import biblioteca.entities.Customer;
import biblioteca.repos.CustomerDAO;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO repo;
	
	@Override
	public List<Customer> trovaTutti() {
		
		return repo.findAll();
	}

	@Override
	public Customer trovaCustomer(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Customer addCustomer(Customer c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}
	
	@Override
	public Customer updateCustomer(Customer customer)
	{
		return repo.save(customer);
	}
	
	@Override
	public void deleteCustomer(int id)
	{
		repo.deleteById(id);
	}

}

