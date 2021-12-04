package projetIMAFA.service;

import java.util.List;

import projetIMAFA.entity.Data_action;;

public interface IDataService {
	 List<Data_action> retrieveAllData_actions();
	 Data_action addData_action(Data_action a);
	 void deleteData_action(String id);
	 Data_action updateData_action(Data_action a);
	 Data_action retrieveData_action(String id);
	 List<String> afflib();
	 List<Data_action> retrieveData_actionsByLibelle(String libelle);
}
