package projetIMAFA.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import projetIMAFA.Exception.ResourceNotFoundException;
import projetIMAFA.entity.EmployeeSalary;
import projetIMAFA.entity.Formation;
import projetIMAFA.entity.Formationc;
import projetIMAFA.entity.User;
import projetIMAFA.repo.FormationRepository;
import projetIMAFA.service.FormationService;
import projetIMAFA.service.FormationcService;
import projetIMAFA.service.MailService;
import projetIMAFA.service.UserService;


@Transactional
@Controller(value = "FormationController") // Name of the bean in Spring IoC
@ELBeanName(value = "FormationController") // Name of the bean used by JSF
public class FormationController {

	@Autowired
	MailService notificationService;
	
	@Autowired
	FormationRepository formationRepository;

	@Autowired
	FormationService formationService;

	@Autowired
	FormationcService formationcService;
	
	@Autowired
	UserService userService;

	private int id;
	private String titre;
	private String description;
	private Date dateDebut;
	private Date dateFin;
	private String domaine;
    private Integer place;
	private List<String> names;
	private String name;
	private Integer FormationIdToBeUpdated;
	private List<Formation> formations;
	
	public void addFormation() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
		User u=userService.getName(name);	
		if(dateDebut.compareTo(dateFin)<0)
		{
			formationService.addFormation(new Formation(titre,description,dateDebut,dateFin,domaine,place,u)) ;	
		}
		else {
		formationService.addFormation(new Formation(titre,description,dateDebut,dateFin,domaine,place,u)) ;
		}
	}

	public void addFormationc(Integer idu,Integer idf) throws ParseException, MessagingException {
	/*	if(formationcService.forclie(userService.retrieveUser(Integer.toString(idu)),formationService.retrieveFormation(Integer.toString(idf))))
		{*/
			User u=userService.retrieveUser(Integer.toString(idu));
			Formation f=formationService.retrieveFormation(Integer.toString(idf));
			formationcService.addFormationc(new Formationc(u,f)) ;
			notificationService.sendEmailFormation(u, f);
			formationService.place(idf);	

	}

	public String updateSalary()throws ParseException {
		User u=userService.getName(name);	
		formationService.updateFormation(new Formation(FormationIdToBeUpdated,titre,description,dateDebut,dateFin,domaine,place,u) );
		//return("/amine/Hana/fichedepaie.jsf?faces-redirect=true");
		return("/ordrect/afficherformation.jsf?faces-redirect=true");

	}
	
	public void deleteSalary(String salaryId)
	{
		formationService.deleteFormation(salaryId);
	}
	
	public String displaySalaries(Formation empl)
	{

		this.setTitre(empl.getTitre());
		this.setDescription(empl.getDescription());
		this.setDomaine(empl.getDomaine());
		this.setDateDebut(empl.getDateDebut());
		this.setName(empl.getResponsablerh().getFirst_name());	
		this.setDateFin(empl.getDateFin());
		this.setFormationIdToBeUpdated(empl.getId());
		return("/ordrect/updateformation.jsf?faces-redirect=true");

	}

	public FormationRepository getFormationRepository() {
		return formationRepository;
	}

	public void setFormationRepository(FormationRepository formationRepository) {
		this.formationRepository = formationRepository;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}



	public Integer getPlace() {
		return place;
	}

	public void setPlace(Integer place) {
		this.place = place;
	}

	public List<String> getNames() {
		return formationService.Employeecin();
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getFormationIdToBeUpdated() {
		return FormationIdToBeUpdated;
	}

	public void setFormationIdToBeUpdated(Integer formationIdToBeUpdated) {
		FormationIdToBeUpdated = formationIdToBeUpdated;
	}

	public List<Formation> getFormations() {
		List<Formation> list = formationService.retrieveAllFormations();
		return list;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}


	
	
	
	
	
}
