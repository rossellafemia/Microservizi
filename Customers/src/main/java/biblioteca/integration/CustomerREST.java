package biblioteca.integration;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import biblioteca.entities.Customer;
import biblioteca.services.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerREST {

	@Autowired
	private CustomerService cs;
	
	@GetMapping("")
	public List<Customer> getCustomer(){
		
		List<Customer> trovaTutti = cs.trovaTutti();
		Collections.sort(trovaTutti);
		return trovaTutti;
	}
	
	
	@GetMapping("/{id}")
	Customer getCustomer(@PathVariable int id) {
		return cs.trovaCustomer(id);
	}
	
	@PostMapping(path = "/addCustomer", consumes = "application/json", produces = "application/xml")
	Customer addCustomer(@RequestBody Customer customer)
	{
	 Customer c = cs.addCustomer(customer);
	 return c;
	}
	
	@PutMapping("/{id}")
	Customer updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
		return cs.updateCustomer(customer);
	}
	
	@DeleteMapping("/{id}")
	String delCustomer(@PathVariable int id)
	{
		cs.deleteCustomer(id);
		return "{}";
	}
	
}