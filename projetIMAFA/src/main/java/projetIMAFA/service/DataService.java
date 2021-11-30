package projetIMAFA.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetIMAFA.entity.Data_action;
import projetIMAFA.repo.DataRepository;

@Service
public class DataService implements IDataService {
	@Autowired
	DataRepository dataRepository;
	private static final Logger l = LogManager.getLogger(DataService.class);

	public List<Data_action> retrieveAllData_actions() {
		List<Data_action> Data_actions = (List<Data_action>) dataRepository.findAll();
		for(Data_action Data_action : Data_actions)
		{
			l.info("Data_action aaaaaaa++ :"+Data_action);
		}
		return Data_actions;
		
	}

	public Data_action addData_action(Data_action u) {
		Data_action Data_actionSaved = null;
		Data_actionSaved=dataRepository.save(u);
		return Data_actionSaved;
		
	}

	public void deleteData_action(String id) {
		dataRepository.deleteById(Integer.parseInt(id));
		
	}

	public Data_action updateData_action(Data_action u) {
		Data_action Data_actionAdded = dataRepository.save(u);
		return Data_actionAdded;
	}

	public Data_action retrieveData_action(String id) {
	
		l.info("in retrieveData_action id= "+id);
		Data_action u = dataRepository.findById(Integer.parseInt(id)).orElse(null);
		l.info("Data_action returned : "+u);
		return u;
		
	}

	@Override
	public List<Data_action> retrieveData_actionsByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> afflib() {
		 List<String> u =dataRepository.afflib();
		 return u;
	}
}
