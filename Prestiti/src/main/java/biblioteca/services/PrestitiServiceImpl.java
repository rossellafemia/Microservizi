package biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biblioteca.entities.Prestiti;
import biblioteca.repos.PrestitiDAO;

@Service
public class PrestitiServiceImpl implements PrestitiService {

	@Autowired
	private PrestitiDAO repo;
	
	@Override
	public List<Prestiti> trovaTutti() {
		
		return repo.findAll();
	}

	@Override
	public Prestiti trovaUno(String orderId) {
		return repo.findById(orderId).get();
	}

	@Override
	public Prestiti addPrestiti(Prestiti p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}
	
	@Override
	public Prestiti updatePrestiti(Prestiti prestiti)
	{
		return repo.save(prestiti);
	}

	
	@Override
	public void deletePrestiti(String orderId)
	{
		repo.deleteById(orderId);
	}

}

