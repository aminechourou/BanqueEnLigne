package projetIMAFA.service;

import java.util.List;

import projetIMAFA.entity.CompteTitre;

public interface IComptetitreService {

	 List<CompteTitre> retrieveAllComptetitres();
	 CompteTitre addComptetitre(CompteTitre a);
	 void deleteComptetitre(String id);
	 CompteTitre updateComptetitre(CompteTitre a);
	 CompteTitre retrieveComptetitre(int id);
	 List<CompteTitre> retrieveComptetitresByLibelle(String libelle);
}
