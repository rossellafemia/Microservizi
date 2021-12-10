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

import biblioteca.entities.Prestiti;
import biblioteca.services.PrestitiService;

@RestController
@RequestMapping("/api/prestiti")
public class PrestitiREST {

	@Autowired
	private PrestitiService ps;
	
	@GetMapping("")
	List<Prestiti> getPrestiti(){
		
		List<Prestiti> trovaTutti = ps.trovaTutti();
		Collections.sort(trovaTutti);
		return trovaTutti;
	}
	
	@GetMapping("/{id}")
	Prestiti getPrestiti(@PathVariable String orderId) {
		return ps.trovaUno(orderId);
	}
	
	@PostMapping(path = "/addPrestito", consumes = "application/json", produces = "application/xml")
	Prestiti addPrestiti(@RequestBody Prestiti prestiti)
	{
	 Prestiti p = ps.addPrestiti(prestiti);
	 return p;
	}
	
	@PutMapping("/{id}")
	Prestiti updatePrestiti(@PathVariable String orderId, @RequestBody Prestiti prestiti) {
		return ps.updatePrestiti(prestiti);
	}
	
	@DeleteMapping("/{id}")
	String delPrestiti(@PathVariable String orderId)
	{
		ps.deletePrestiti(orderId);
		return "{}";
	}
	
}
