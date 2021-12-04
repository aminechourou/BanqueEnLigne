package projetIMAFA.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetIMAFA.Exception.ResourceNotFoundException;
import projetIMAFA.entity.Formation;

import projetIMAFA.repo.FormationRepository;


@Controller
@RequestMapping("/formation")
public class FormationController {

	@Autowired
	FormationRepository formationRepository;
	

	@GetMapping("/all")
	public List<Formation> getAllFormation() {
		return formationRepository.findAll();
	}
	
	@PostMapping("/add")
	public Formation createFormation(@Valid @RequestBody Formation formation) {
		return formationRepository.save(formation);
	}
	
	@DeleteMapping("/delete/{id}")
	public Map<String, Boolean> deleteFormation(@PathVariable(value = "id") Integer FormationId)
			throws ResourceNotFoundException {
		Formation formation = formationRepository.findById(FormationId)
				.orElseThrow(() -> new ResourceNotFoundException("Formation not found for this id :: " + FormationId));

		formationRepository.delete(formation);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Formation deleted : ", Boolean.TRUE);
		return response;
	}
	
	@GetMapping("/formation/{id}")
	public ResponseEntity<Formation> getFormationById(@PathVariable(value = "id") Integer FormationId)
			throws ResourceNotFoundException {
		Formation formation = formationRepository.findById(FormationId)
				.orElseThrow(() -> new ResourceNotFoundException("Formation not found for this id :: " + FormationId));
		return ResponseEntity.ok().body(formation);
	}
	
	@PutMapping("/formation/{id}")
	public ResponseEntity<Formation> updateFormation(@PathVariable(value = "id") Integer FormationId,
			@Valid @RequestBody Formation formationDetails) throws ResourceNotFoundException {
		Formation formation = formationRepository.findById(FormationId)
				.orElseThrow(() -> new ResourceNotFoundException("Formation not found for this id :: " + FormationId));

		formation.setTitre(formationDetails.getTitre());
		formation.setEtat(formationDetails.getEtat());
		formation.setDomaine(formationDetails.getDomaine());
		formation.setDescription(formationDetails.getDescription());
		final Formation updatedFormation = formationRepository.save(formation);
		return ResponseEntity.ok(updatedFormation);
	}
	
	
	
	
	
}
