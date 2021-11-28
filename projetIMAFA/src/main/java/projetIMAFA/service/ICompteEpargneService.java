package projetIMAFA.service;

import java.util.List;

import projetIMAFA.entity.Client;
import projetIMAFA.entity.CompteEpargne;
import projetIMAFA.entity.Operation;

public interface ICompteEpargneService {

	public int ajouterOuModifierCompteCourant(CompteEpargne cb);
	public void deleteCompteEpargneById(int cbId);
	public CompteEpargne getCompteCourantById(int cbId);
	void affecterOperationACompteEpargne(int operationId, int cbId);
	List<Operation> getAllOperationsByCompteEpargne(int cbId);
	List<CompteEpargne> getAllCompteEpargnesBytypeCompte(String typeCompte);
	List<Client> getAllClientsByCompteEpargne(int cbId);
}
