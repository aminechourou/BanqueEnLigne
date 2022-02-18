package projetIMAFA.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetIMAFA.entity.Obligation;
import projetIMAFA.entity.Obligationc;
import projetIMAFA.repo.ObligationcRepository;

@Service
public class ObligationcService implements IObligationcService {
	@Autowired
	ObligationcRepository ObligationRepository;
	private static final Logger l = LogManager.getLogger(ObligationService.class);

	public List<Obligationc> retrieveAllObligationcs() {
		List<Obligationc> Obligations = (List<Obligationc>) ObligationRepository.findAll();
		for(Obligationc Obligation : Obligations)
		{
			l.info("Obligation ++ :"+Obligation);
		}
		return Obligations;
		
	}

	public Obligationc addObligationc(Obligationc u) {
		Obligationc ObligationSaved = null;
		ObligationSaved=ObligationRepository.save(u);
		return ObligationSaved;
		
	}

	public void deleteObligationc(String id) {
		ObligationRepository.deleteById(Integer.parseInt(id));
		
	}

	public Obligationc updateObligation(Obligationc u) {
		Obligationc ObligationAdded = ObligationRepository.save(u);
		return ObligationAdded;
	}

	public Obligationc retrieveObligationc(String id) {
	
		l.info("in retrieveObligation id= "+id);
		Obligationc u = ObligationRepository.findById(Integer.parseInt(id)).orElse(null);
		l.info("Obligation returned : "+u);
		return u;
		
	}

	@Override
	public List<Obligationc> retrieveObligationcsByNomentreprise(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Obligationc updateObligationc(Obligationc a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Obligationc> compteObligation(int id) {
    return ObligationRepository.compteObligation(id);
	}
}
