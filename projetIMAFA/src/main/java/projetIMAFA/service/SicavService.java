package projetIMAFA.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetIMAFA.entity.Sicav;
import projetIMAFA.repo.SicavRepository;



@Service
public class SicavService implements ISicavService {
	@Autowired
	SicavRepository SicavRepository;
	
	private static final Logger l = LogManager.getLogger(SicavService.class);

	public List<Sicav> retrieveAllSicavs() {
		List<Sicav> Sicavs = (List<Sicav>) SicavRepository.findAll();
		for(Sicav Sicav : Sicavs)
		{
			l.info("Sicav aaaaaaa++ :"+Sicav);
		}
		return Sicavs;
		
	}

	public Sicav addSicav(Sicav u) {
		Sicav SicavSaved = null;
		SicavSaved=SicavRepository.save(u);
		return SicavSaved;
		
	}

	public void deleteSicav(String id) {
		SicavRepository.deleteById(Integer.parseInt(id));
		
	}

	public Sicav updateSicav(Sicav u) {
		Sicav SicavAdded = SicavRepository.save(u);
		return SicavAdded;
	}

	public Sicav retrieveSicav(String id) {
	
		l.info("in retrieveSicav id= "+id);
		Sicav u = SicavRepository.findById(Integer.parseInt(id)).orElse(null);
		l.info("Sicav returned : "+u);
		return u;
		
	}
	
	public List<Sicav> retrieveSicavsByLibelle(String role)
	{
		List<Sicav> Sicavs = (List<Sicav>) SicavRepository.retrieveSicavsByLibelle(role);
		for(Sicav Sicav : Sicavs)
		{
			l.info("Sicav ++ :"+Sicav);
		}
		return Sicavs;	
	}
	
}
