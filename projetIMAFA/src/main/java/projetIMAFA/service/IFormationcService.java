package projetIMAFA.service;

import java.util.List;

import projetIMAFA.entity.Formation;
import projetIMAFA.entity.Formationc;
import projetIMAFA.entity.User;

public interface IFormationcService {

	List<Formationc> retrieveAllFormationcs();
	Formationc addFormationc(Formationc f) ;
	void deleteFormationc(String id);
	Formationc updateFormationc(Formationc f);
	Formationc retrieveFormationc(String id) ;
	int forclie(User idc,Formation idf);
}
