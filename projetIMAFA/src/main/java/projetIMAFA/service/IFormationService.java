package projetIMAFA.service;

import java.util.List;

import projetIMAFA.entity.Formation;


public interface IFormationService {

	List<Formation> retrieveAllFormations();
	Formation addFormation(Formation f) ;
	void deleteFormation(String id);
	Formation updateFormation(Formation f);
	Formation retrieveFormation(String id) ;
	List<String> Employeecin();
}
