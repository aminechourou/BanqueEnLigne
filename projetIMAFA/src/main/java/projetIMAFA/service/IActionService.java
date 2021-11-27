package projetIMAFA.service;

import java.util.List;
import projetIMAFA.entity.Action;

public interface IActionService {

	 List<Action> retrieveAllActions();
	 Action addAction(Action a);
	 void deleteAction(String id);
	 Action updateAction(Action a);
	 Action retrieveAction(String id);
	 List<Action> retrieveActionsByLibelle(String libelle);
}
