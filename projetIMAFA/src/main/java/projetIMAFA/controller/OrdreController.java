package projetIMAFA.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import projetIMAFA.repo.OrdreRepository;
import projetIMAFA.entity.Action;
import projetIMAFA.entity.Obligation;
import projetIMAFA.entity.Ordre;
import projetIMAFA.entity.Sicav;
import projetIMAFA.entity.TypeOrdre;
import projetIMAFA.entity.TypeProduitFin;
import projetIMAFA.repo.ActionRepository;
import projetIMAFA.repo.SicavRepository;
import projetIMAFA.service.IActionService;
import projetIMAFA.service.IObligationService;
import projetIMAFA.service.IOrdreService;
import projetIMAFA.service.ISicavService;
import projetIMAFA.service.OrdreService;
import projetIMAFA.repo.ObligationRepository;

@Controller
public class OrdreController {
	@Autowired
	IOrdreService ordreService ;
	/*@Autowired
	CompteTitreRepository compteTitreRepository;*/
	
	@Autowired
	IActionService actionService;

	@Autowired
	IObligationService obligationService;
	
	@Autowired
	ISicavService sicavService;
	
	@PostMapping("/add-Action")
	@ResponseBody
	public Action addAction(@RequestBody Action u) {
	Action Action = actionService.addAction(u);
	Ordre ordre = new Ordre();
	Date today = new Date();
	ordre.setDateOrdre(today);
	ordre.setIdpf(u.getAction_ID());
	if(u.getOperation()==1)
	{
	ordre.setType(TypeOrdre.Achat);
	}
	else{
	ordre.setType(TypeOrdre.Vente);	
	}
	ordre.setTypepf(TypeProduitFin.Action);
	ordreService.addOrdre(ordre);
	return Action;
	}
	
	@GetMapping("/Action")
	public List<Action> getAllActions() {
		List<Action> list = actionService.retrieveAllActions();
		return list;
	}
	
	@GetMapping("/Obligation")
	public List<Obligation> getAllObligations() {
		List<Obligation> list = obligationService.retrieveAllObligations();
		return list;
	}
	
	@GetMapping("/Sicav")
	public List<Sicav> getAllSicavs() {
		List<Sicav> list = sicavService.retrieveAllSicavs();
		return list;
	}
	
	@GetMapping("/Ordre")
	public List<Ordre> getAllOrdre() {
		List<Ordre> list = ordreService.retrieveAllOrdres();
		return list;
	}
/*	
	@PostMapping("/addOrdre")
	public Ordre ajouterOrdre(@Valid @RequestBody Ordre ordre) {
		
		Date today = new Date();
		ordre.setDateOrdre(today);
		ordeRepository.save(ordre);
		return ordre;
		
	}
//	
//	/*@GetMapping("/test/{idClient}")
//	public CompteTitre getIdCompteTitre(@PathVariable(value = "idClient")Integer idClient) {
//		
//		return compteTitreRepository.getIdCompteTitre(idClient);
//		
//	}
//	
//	@PostMapping("/add/{idAction}/{tOrdre}/{idClient}")
//	public Ordre ajouterOrdreAction(@PathVariable(value = "idAction") int idAction ,@PathVariable(value ="tOrdre") TypeOrdre tOrdre,
//			@PathVariable(value = "idClient")int idClient) {
//		
//		Ordre ordre = new Ordre();
//		Date today = new Date();
//		ordre.setDateOrdre(today);
//		ordre.setCompteTitre(compteTitreRepository.getIdCompteTitre(idClient));
//		ordre.setIdpf(idAction);
//		ordre.setType(tOrdre);
//		ordre.setTypepf(TypeProduitFin.Action);
//		ordeRepository.save(ordre);
//		return ordre;
//		
//	}
//	@PostMapping("/add/{idObligation}/{tOrdre}/{idClient}")
//	public Ordre ajouterOrdreObligation(@PathVariable(value = "idObligation") int idObligation ,@PathVariable(value ="tOrdre") TypeOrdre tOrdre,
//			@PathVariable(value = "idClient")int idClient) {
//		
//		Ordre ordre = new Ordre();
//		Date today = new Date();
//		ordre.setDateOrdre(today);
//		ordre.setCompteTitre(compteTitreRepository.getIdCompteTitre(idClient));
//		ordre.setIdpf(idObligation);
//		ordre.setType(tOrdre);
//		ordre.setTypepf(TypeProduitFin.Obligation);
//		ordeRepository.save(ordre);
//		return ordre;
//		
//	}
//	
//	@PostMapping("/add/{idSicav}/{tOrdre}/{idClient}")
//	public Ordre ajouterOrdreSicav(@PathVariable(value = "idSicav") int idSicav ,@PathVariable(value ="tOrdre") TypeOrdre tOrdre,
//			@PathVariable(value = "idClient")int idClient) {
//		Ordre ordre = new Ordre();
//		Date today = new Date();
//		ordre.setDateOrdre(today);
//		ordre.setCompteTitre(compteTitreRepository.getIdCompteTitre(idClient));
//		ordre.setIdpf(idSicav);
//		ordre.setType(tOrdre);
//		ordre.setTypepf(TypeProduitFin.Sicav);
//		ordeRepository.save(ordre);
//		return ordre;
//		
//	}*/
//
}
