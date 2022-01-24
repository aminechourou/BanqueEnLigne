package projetIMAFA.service;

import java.util.List;

import projetIMAFA.entity.Formationc;

public interface IFormationcService {

	List<Formationc> retrieveAllFormationcs();
	Formationc addFormationc(Formationc f) ;
	void deleteFormationc(String id);
	Formationc updateFormationc(Formationc f);
	Formationc retrieveFormationc(String id) ;
}
