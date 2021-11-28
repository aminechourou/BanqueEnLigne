package projetIMAFA.service;

import java.util.List;

import projetIMAFA.entity.Agence;
import projetIMAFA.entity.CompteBancaire;
import projetIMAFA.entity.Operation;

public interface ICompteBancaireService {

	public int ajouterOuModifierCompteBancaire(CompteBancaire cb);
	public void deleteCompteBancaireById(int cbId);
	public CompteBancaire getCompteBancaireById(int cbId);
	//void affecterOperationACompteBancaire(int operationId, int cbId);
	//public List<Operation> getAllOperationsByCompteBancaire(int cbId);
	//public List<CompteBancaire> getAllCompteBancairesBytypeCompte(String typeCompte);
	//public List<Client> getAllClientsByCompteBancaire(int cbId);
}
