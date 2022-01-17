package projetIMAFA.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column(name="Id")
	private int id;
	
	@Column(name="titre")
	private String titre;
	
	@Column(name="description")
	private String description;
	
	@Column(name="dateDebut")
	private Date dateDebut;
	
	@Column(name="dateFin")
	private Date dateFin;
	
	@Column(name="domaine")
	private String domaine;
	
	@Column(name="etat")
	private String etat;
	
	
	@ManyToOne
    private User responsablerh;


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


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}


	public User getResponsablerh() {
		return responsablerh;
	}


	public void setResponsablerh(User responsablerh) {
		this.responsablerh = responsablerh;
	}


	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Formation(int id, String titre, String description, Date dateDebut, Date dateFin, String domaine,
			String etat, User responsablerh) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.domaine = domaine;
		this.etat = etat;
		this.responsablerh = responsablerh;
	}


	public Formation(String titre, String description, Date dateDebut, Date dateFin, String domaine, String etat,
			User responsablerh) {
		super();
		this.titre = titre;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.domaine = domaine;
		this.etat = etat;
		this.responsablerh = responsablerh;
	}
	
	
	

}
