package projetIMAFA.service;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.Part;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import projetIMAFA.entity.Action;
import projetIMAFA.repo.ActionRepository;

@Service
public class ActionService implements IActionService {
	@Autowired
	ActionRepository actionRepository;
	private static final Logger l = LogManager.getLogger(ActionService.class);

	public List<Action> retrieveAllActions() {
		List<Action> Actions = (List<Action>) actionRepository.findAll();
		for(Action Action : Actions)
		{
			l.info("Action aaaaaaa++ :"+Action);
		}
		return Actions;
		
	}

	public Action addAction(Action u) {
		Action ActionSaved = null;
		ActionSaved=actionRepository.save(u);
		return ActionSaved;
		
	}

	public void deleteAction(String id) {
		actionRepository.deleteById(Integer.parseInt(id));
		
	}

	public Action updateAction(Action u) {
		Action ActionAdded = actionRepository.save(u);
		return ActionAdded;
	}

	public Action retrieveAction(String id) {
	
		l.info("in retrieveAction id= "+id);
		Action u = actionRepository.findById(Integer.parseInt(id)).orElse(null);
		l.info("Action returned : "+u);
		return u;
		
	}
	/*
	public List<Action> retrieveActionsByLibelle(String role)
	{
		List<Action> Actions = (List<Action>) actionRepository.retrieveActionsByLibelle(role);
		for(Action Action : Actions)
		{
			l.info("Action ++ :"+Action);
		}
		return Actions;	
	}
	
	*/
	/*
	public List<Action> retrieveActionsByDate(String d1,String d2) throws ParseException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d11 = dateFormat.parse(d1);
		Date d22 = dateFormat.parse(d2);
		List<Action> Actions = (List<Action>) actionRepository.retrieveActionsByDate(d11,d22);
		for(Action Action : Actions)
		{
			l.info("Action ++ :"+Action);
		}
		return Actions;	
	}
	*/
	
/*	
	 public List<Object> getActionbydate()
	 {
		 List<Object> u =actionRepository.getActionbydate();
		 return u;
	 }

	public void upMdp(String random,String mdp)
	{
		actionRepository.upMdp(Integer.parseInt(random), mdp);

	}
*/
	

	public void del(int id){
		actionRepository.deleteById(id);
	}

	@Override
	public List<Action> retrieveActionsByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Action> retrieveActionsByCompte(Integer id) {
     return actionRepository.retrieveActionsByCompte(id);
	}

	@Override
	public float retrieveActionsWall(Integer id) {
     return actionRepository.retrieveActionsWall(id);
	}

}
