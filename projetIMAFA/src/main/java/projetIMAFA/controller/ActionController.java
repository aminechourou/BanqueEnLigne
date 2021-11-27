package projetIMAFA.controller;
import java.text.ParseException;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import projetIMAFA.entity.Action;
import projetIMAFA.service.ActionService;
import projetIMAFA.service.IActionService;

@Controller
public class ActionController {
	
	@Autowired
	IActionService actionService;
	


	
	
	@GetMapping("/actions")
	@ResponseBody
	public List<Action> retrieveAllActions() {
	List<Action> list = actionService.retrieveAllActions();
	return list;
	}
	
	@GetMapping("/register/retrieve-Action/{Action-id}")
	@ResponseBody
	public Action retrieveAction(@PathVariable("Action-id") String Id) {
	return actionService.retrieveAction(Id);
	}
		
	@PostMapping("/add-Action")
	@ResponseBody
	public Action addAction(@RequestBody Action u) {
	Action Action = actionService.addAction(u);
	return Action;
	}
	
	@DeleteMapping("/register/remove-Action/{Action-id}")
	@ResponseBody
	public void removeAction(@PathVariable("Action-id") String ActionId) {
	actionService.deleteAction(ActionId);
	}
	
	@PutMapping("/register/modify-Action")
	@ResponseBody
	public Action modifyAction(@RequestBody Action Action) {
	return actionService.updateAction(Action);
	}
	
	@GetMapping("/register/retrieve-ActionR/{role}")
	@ResponseBody
	public List<Action> retrieveActionByLibelle(@PathVariable("role") String role) {
	return actionService.retrieveActionsByLibelle(role);
	}
	
}
