package biblioteca.services;

import java.util.List;

import biblioteca.entities.Customer;

public interface CustomerService {
	
	List<Customer> trovaTutti();
	Customer trovaCustomer(int id);
	Customer addCustomer(Customer c);
	Customer updateCustomer(Customer customer);
	void deleteCustomer(int id);

}
