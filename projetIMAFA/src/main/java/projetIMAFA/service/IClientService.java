package projetIMAFA.service;

import java.util.List;

import projetIMAFA.entity.Client;
import projetIMAFA.entity.CompteBancaire;

public interface IClientService {

	public int ajouterOuModifierClient(Client cb);
	public void deleteClientById(int clientId);
	public Client getClientById(int clientId);
	void affecterCompteBancaireAClient(int cbId, int clientId);
	List<CompteBancaire> getAllCompteBancairesByClient(int clientId);
}
