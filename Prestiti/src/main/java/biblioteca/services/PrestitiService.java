package biblioteca.services;

import java.util.List;

import biblioteca.entities.Prestiti;

public interface PrestitiService {
	
	List<Prestiti> trovaTutti();
	Prestiti trovaUno(String orderId);
	Prestiti addPrestiti(Prestiti p);
	Prestiti updatePrestiti(Prestiti prestiti);
	void deletePrestiti(String orderId);

}
