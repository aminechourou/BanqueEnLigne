package projetIMAFA.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetIMAFA.entity.Formation;
import projetIMAFA.entity.Formationc;
import projetIMAFA.entity.User;
import projetIMAFA.repo.FormationcRepository;

@Service
public class FormationcService implements IFormationcService {

	@Autowired
	FormationcRepository formationRepository;
	private static final Logger l = LogManager.getLogger(FormationService.class);

	@Override
	public List<Formationc> retrieveAllFormationcs() {
		
		List<Formationc> formations = (List<Formationc>) formationRepository.findAll();
		for(Formationc salary : formations)
		{
			l.info("salary ++ :"+salary);
		}
		return formations;
	}

	@Override
	public Formationc addFormationc(Formationc f) {
		Formationc employeeSalarySaved = null;
		employeeSalarySaved=formationRepository.save(f);
		return employeeSalarySaved;
	}

	@Override
	public void deleteFormationc(String id) {
		formationRepository.deleteById(Integer.parseInt(id));
		
	}

	@Override
	public Formationc updateFormationc(Formationc f) {
		Formationc employeeSalaryAdded = formationRepository.save(f);
		return employeeSalaryAdded;
	}

	@Override
	public Formationc retrieveFormationc(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int forclie(User idc, Formation idf) {
		if(formationRepository.forclie( idc, idf).equals(null))
		{
			return 1;
		}
       return 0;
	}

}
