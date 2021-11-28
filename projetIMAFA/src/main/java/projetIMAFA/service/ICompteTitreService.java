package projetIMAFA.service;

import java.util.List;

import projetIMAFA.entity.Client;
import projetIMAFA.entity.CompteTitre;
import projetIMAFA.entity.Operation;

public interface ICompteTitreService {

	public int ajouterOuModifierCompteTitre(CompteTitre cb);
	public void deleteCompteTitreById(int cbId);
	public CompteTitre getCompteTitreById(int cbId);
	void affecterOperationACompteTitre(int operationId, int cbId);
	List<Operation> getAllOperationsByCompteTitre(int cbId);
	List<CompteTitre> getAllCompteTitresBytypeCompte(String typeCompte);
	List<Client> getAllClientsByCompteTitre(int cbId);
}
