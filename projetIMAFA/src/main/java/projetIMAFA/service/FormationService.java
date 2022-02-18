package projetIMAFA.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetIMAFA.entity.EmployeeSalary;
import projetIMAFA.entity.Formation;
import projetIMAFA.entity.User;
import projetIMAFA.repo.EmployeeSalaryRepository;
import projetIMAFA.repo.FormationRepository;

@Service
public class FormationService implements IFormationService {
	
	@Autowired
	FormationRepository formationRepository;
	private static final Logger l = LogManager.getLogger(FormationService.class);

	@Override
	public List<Formation> retrieveAllFormations() {
		
		List<Formation> formations = (List<Formation>) formationRepository.findAll();
		for(Formation salary : formations)
		{
			l.info("salary ++ :"+salary);
		}
		return formations;
	}

	@Override
	public Formation addFormation(Formation f) {
		Formation employeeSalarySaved = null;
		employeeSalarySaved=formationRepository.save(f);
		return employeeSalarySaved;
	}

	@Override
	public void deleteFormation(String id) {
		formationRepository.deleteById(Integer.parseInt(id));
		
	}

	@Override
	public Formation updateFormation(Formation f) {
		Formation employeeSalaryAdded = formationRepository.save(f);
		return employeeSalaryAdded;
	}

	@Override
	public Formation retrieveFormation(String id) {
		l.info("in retrieveUser id= "+id);
		Formation u = formationRepository.findById(Integer.parseInt(id)).orElse(null);
		l.info("user returned : "+u);
		return u;
	}

	@Override
	public List<String> Employeecin() {
		return formationRepository.Employeecin();
	}
	
	@Override
	public void place(Integer id) {
		formationRepository.place(id);
		
	}


}
