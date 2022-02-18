package projetIMAFA.service;

import java.util.List;

import projetIMAFA.entity.Ordre;



public interface IOrdreService {
	 List<Ordre> retrieveAllOrdres();
	 Ordre addOrdre(Ordre a);
	 void deleteOrdre(String id);
	 Ordre updateOrdre(Ordre a);
	 Ordre retrieveOrdre(String id);
	 List<Ordre> retrieveOrdresByLibelle(String libelle);
}
