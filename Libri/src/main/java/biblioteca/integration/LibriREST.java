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

import biblioteca.entities.Libro;
import biblioteca.services.LibroService;

@RestController
@RequestMapping("/api/libri")
public class LibriREST {

	@Autowired
	private LibroService ls;
	
	@GetMapping("")
	public List<Libro> getLibri(){
		
		List<Libro> trovaTutti = ls.trovaTutti();
		Collections.sort(trovaTutti);
		return trovaTutti;
	}
	
	
	@GetMapping("/autore")
	public List<Libro> getLibriSortAutore(){
		List<Libro> libri = ls.trovaTutti();
		Collections.sort(libri, (l1, l2) -> l1.getAutori().compareTo(l2.getAutori()));
		return libri;
	}
	
	@GetMapping("/{id}")
	Libro getLibro(@PathVariable int id) {
		return ls.trovaUno(id);
	}
	
	@PostMapping(path = "/addLibro", consumes = "application/json", produces = "application/xml")
	Libro addLibro(@RequestBody Libro libro)
	{
	 Libro l = ls.addLibro(libro);
	 return l;
	}
	
	@PutMapping("/{id}")
	Libro updateLibro(@PathVariable int id, @RequestBody Libro libro) {
		return ls.updateLibro(libro);
	}
	
	@DeleteMapping("/{id}")
	String delLibro(@PathVariable int id)
	{
		ls.deleteLibro(id);
		return "{}";
	}
	
}
