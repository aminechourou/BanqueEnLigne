package projetIMAFA.service;

import projetIMAFA.entity.NouveauTypeCompte;

public interface INouveauTypeCompteService {

	public int ajouterOuModifierNouveauTypeCompte(NouveauTypeCompte nc);
	public void deleteNouveauTypeCompteById(int champId);
	public NouveauTypeCompte getNouveauTypeCompteById(int champId);
}
