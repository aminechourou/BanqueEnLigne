package projetIMAFA.service;

import java.util.List;

import projetIMAFA.entity.Client;
import projetIMAFA.entity.CompteCourant;
import projetIMAFA.entity.Operation;

public interface ICompteCourantService {

	public int ajouterOuModifierCompteCourant(CompteCourant cb);
	public void deleteCompteCourantById(int cbId);
	public CompteCourant getCompteCourantById(int cbId);
	void affecterOperationACompteCourant(int operationId, int cbId);
	List<Operation> getAllOperationsByCompteCourant(int cbId);
	List<CompteCourant> getAllCompteCourantsBytypeCompte(String typeCompte);
	List<Client> getAllClientsByCompteCourant(int cbId);
}
