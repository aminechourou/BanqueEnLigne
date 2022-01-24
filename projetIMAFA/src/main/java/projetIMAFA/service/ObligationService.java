package projetIMAFA.service;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.Part;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import projetIMAFA.entity.Obligation;
import projetIMAFA.repo.ObligationRepository;

@Service
public class ObligationService implements IObligationService {
	
	@Autowired
	ObligationRepository ObligationRepository;
	private static final Logger l = LogManager.getLogger(ObligationService.class);

	public List<Obligation> retrieveAllObligations() {
		List<Obligation> Obligations = (List<Obligation>) ObligationRepository.findAll();
		for(Obligation Obligation : Obligations)
		{
			l.info("Obligation ++ :"+Obligation);
		}
		return Obligations;
		
	}

	public Obligation addObligation(Obligation u) {
		Obligation ObligationSaved = null;
		ObligationSaved=ObligationRepository.save(u);
		return ObligationSaved;
		
	}

	public void deleteObligation(String id) {
		ObligationRepository.deleteById(Integer.parseInt(id));
		
	}

	public Obligation updateObligation(Obligation u) {
		Obligation ObligationAdded = ObligationRepository.save(u);
		return ObligationAdded;
	}

	public Obligation retrieveObligation(int id) {
	
		l.info("in retrieveObligation id= "+id);
		Obligation u = ObligationRepository.findById(id).orElse(null);
		l.info("Obligation returned : "+u);
		return u;
		
	}
	
	public List<Obligation> retrieveObligationsByNomentreprise(String role)
	{
		List<Obligation> Obligations = (List<Obligation>) ObligationRepository.retrieveObligationsByNomentreprise(role);
		for(Obligation Obligation : Obligations)
		{
			l.info("Obligation ++ :"+Obligation);
		}
		return Obligations;	
	}
	
	
	/*
	public List<Obligation> retrieveObligationsByDate(String d1,String d2) throws ParseException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d11 = dateFormat.parse(d1);
		Date d22 = dateFormat.parse(d2);
		List<Obligation> Obligations = (List<Obligation>) ObligationRepository.retrieveObligationsByDate(d11,d22);
		for(Obligation Obligation : Obligations)
		{
			l.info("Obligation ++ :"+Obligation);
		}
		return Obligations;	
	}
	*/
	
/*	
	 public List<Object> getObligationbydate()
	 {
		 List<Object> u =ObligationRepository.getObligationbydate();
		 return u;
	 }

	public void upMdp(String random,String mdp)
	{
		ObligationRepository.upMdp(Integer.parseInt(random), mdp);

	}
*/
	

	public void del(int id){
		ObligationRepository.deleteById(id);
	}

	@Override
	public void verifiequantite(Integer q, Integer id) {
		ObligationRepository.verifiequantite(q, id);
		
	}

	@Override
	public List<Obligation> retrieveObligationsByQ() {
        return ObligationRepository.retrieveObligationsByQ();
        
	}

}
