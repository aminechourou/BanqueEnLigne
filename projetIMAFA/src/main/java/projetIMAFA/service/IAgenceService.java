package projetIMAFA.service;

import java.util.List;
import projetIMAFA.entity.Agence;
import projetIMAFA.entity.CompteBancaire;


public interface IAgenceService {

	public int ajouterOuModifierAgence(Agence agence);
	public void affecterCompteBancaireAAgence(int compteId, int agenceId);
	public List<CompteBancaire> getAllCompteBancairesNamesByAgence(int agenceId);
	public void deleteAgencetById(int agenceId);
	public Agence getAgenceById(int agenceId);
	public void mettreAjourHoraireAgenceId(String h, int agenceId);
}
