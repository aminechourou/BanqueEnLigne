package projetIMAFA.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Properties;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import projetIMAFA.entity.Action;
import projetIMAFA.entity.Obligation;
import projetIMAFA.service.IActionService;
import projetIMAFA.service.IObligationService;


@Controller
public class ObligationController {
	
	@Autowired
	IObligationService obligationService;
	
	@Autowired
	IActionService actionService;
	
	
	@GetMapping("/obligations")
	@ResponseBody
	public List<Obligation> getobligations() {
	List<Obligation> list = obligationService.retrieveAllObligations();
	return list;
	}
	
	@GetMapping("/actions")
	@ResponseBody
	public List<Action> getAllActions() {
	List<Action> list = actionService.retrieveAllActions();
	return list;
	}

	@GetMapping("/register/retrieve-obligation/{obligation-id}")
	@ResponseBody
	public Obligation retrieveObligation(@PathVariable("obligation-id") String Id) {
	return obligationService.retrieveObligation(Id);
	}
		
	@PostMapping("/add-obligation")
	@ResponseBody
	public Obligation addObligation(@RequestBody Obligation u) {
	Obligation obligation = obligationService.addObligation(u);
	return obligation;
	}
	
	//vvvvvvvvv
	
	@DeleteMapping("/remove-obligation/{obligation-id}")
	@ResponseBody
	public void removeobligation(@PathVariable("obligation-id") String obligationId) {
	obligationService.deleteObligation(obligationId);
	}
	
	@PutMapping("/modify-obligation")
	@ResponseBody
	public Obligation modifyobligation(@RequestBody Obligation obligation) {
	return obligationService.updateObligation(obligation);
	}
	
	@GetMapping("/register/retrieve-obligationR/{nom}")
	@ResponseBody
	public List<Obligation> retrieveobligationByNomentreprise(@PathVariable("nom") String nom) {
	return obligationService.retrieveObligationsByNomentreprise(nom);
	}
		
//ccccccccccccc
	
	}
