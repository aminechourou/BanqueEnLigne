package projetIMAFA.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetIMAFA.entity.Ordre;
import projetIMAFA.repo.OrdreRepository;

@Service
public class OrdreService implements IOrdreService {
	@Autowired
	OrdreRepository OrdreRepository;
	private static final Logger l = LogManager.getLogger(OrdreService.class);

	public List<Ordre> retrieveAllOrdres() {
		List<Ordre> Ordres = (List<Ordre>) OrdreRepository.findAll();
		for(Ordre Ordre : Ordres)
		{
			l.info("Ordre aaaaaaa++ :"+Ordre);
		}
		return Ordres;
		
	}

	public Ordre addOrdre(Ordre u) {
		Ordre OrdreSaved = null;
		OrdreSaved=OrdreRepository.save(u);
		return OrdreSaved;
		
	}
	public Ordre retrieveOrdre(String id) {
	
		l.info("in retrieveOrdre id= "+id);
		Ordre u = OrdreRepository.findById(Integer.parseInt(id)).orElse(null);
		l.info("Ordre returned : "+u);
		return u;
		
	}
	

	@Override
	public void deleteOrdre(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ordre updateOrdre(Ordre a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ordre> retrieveOrdresByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return null;
	}
}
