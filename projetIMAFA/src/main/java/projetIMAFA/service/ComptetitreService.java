package projetIMAFA.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetIMAFA.entity.CompteTitre;
import projetIMAFA.repo.CompteTitreRepository;

@Service
public class ComptetitreService implements IComptetitreService  {
	@Autowired
	CompteTitreRepository ComptetitreRepository;
	private static final Logger l = LogManager.getLogger(ComptetitreService.class);
	
	@Override
	public List<CompteTitre> retrieveAllComptetitres() {
		List<CompteTitre> Comptetitres = (List<CompteTitre>) ComptetitreRepository.findAll();
		for(CompteTitre Comptetitre : Comptetitres)
		{
			l.info("Comptetitre aaaaaaa++ :"+Comptetitre);
		}
		return Comptetitres;
	}

	@Override
	public CompteTitre addComptetitre(CompteTitre a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteComptetitre(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CompteTitre updateComptetitre(CompteTitre a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompteTitre retrieveComptetitre(int i) {
		l.info("in retrieveAction id= "+i);
		CompteTitre u = ComptetitreRepository.findById(i).orElse(null);
		l.info("Action returned : "+u);
		return u;
	}

	@Override
	public List<CompteTitre> retrieveComptetitresByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return null;
	}

}
