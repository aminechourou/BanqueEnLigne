package projetIMAFA.service;

import projetIMAFA.entity.NouveauChamp;

public interface INouveauChampService {

	public int ajouterOuModifierNouveauChamp(NouveauChamp nc);
	public void deleteNouveauChampById(int champId);
	public NouveauChamp getNouveauChampById(int champId);
}
