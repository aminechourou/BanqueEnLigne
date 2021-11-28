package projetIMAFA.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import projetIMAFA.entity.Agence;
import projetIMAFA.entity.CompteBancaire;
import projetIMAFA.repo.IAgenceRepository;
import projetIMAFA.repo.ICompteBancaireRepository;

@Service
public class AgenceServiceImpl implements IAgenceService{

	@Autowired
	IAgenceRepository agenceRepository;
	@Autowired
	ICompteBancaireRepository compteBancaireRepository;

	@Override
	public int ajouterOuModifierAgence(Agence agence) {
		agenceRepository.save(agence);
		return agence.getIdAgence();
	}

	public void mettreAjourHoraireAgenceId(String h, int agenceId) {
		Agence agence = agenceRepository.findById(agenceId).get();
		agence.setEmail(h);
		agenceRepository.save(agence);

	}

	public void deleteAgencetById(int agenceId)
	{
		Agence agence = agenceRepository.findById(agenceId).get();

		agenceRepository.delete(agence);
	}
	
	@Override
	public Agence getAgenceById(int agenceId) {
		return agenceRepository.findById(agenceId).get();
	}
	
	public void affecterCompteBancaireAAgence(int compteId, int agenceId) {
		//Le bout Master de cette relation N:1 est departement  
				//donc il faut rajouter l'entreprise a departement 
				// ==> c'est l'objet departement(le master) qui va mettre a jour l'association
				//Rappel : la classe qui contient mappedBy represente le bout Slave
				//Rappel : Dans une relation oneToMany le mappedBy doit etre du cote one.
		Agence agManagedEntity = agenceRepository.findById(agenceId).get();
		CompteBancaire cbloyeManagedEntity = compteBancaireRepository.findById(compteId).get();
		cbloyeManagedEntity.setAgence(agManagedEntity);
		compteBancaireRepository.save(cbloyeManagedEntity);
		
	}
	
	public List<CompteBancaire> getAllCompteBancairesNamesByAgence(int agenceId) {
		Agence agManagedEntity = this.getAgenceById(agenceId);
		//Agence agManagedEntity = agenceRepository.findById(agenceId).get();
		List<CompteBancaire> cbs = new ArrayList<>();
		for(CompteBancaire cb : agManagedEntity.getCompteBancaires()){
			cbs.add(cb);
		}
		
		return cbs;
	}

	

}
