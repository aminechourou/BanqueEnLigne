package projetIMAFA.entity;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
	
	@Column(name="place")
	private Integer place;
	
	
	@ManyToOne
    private User responsablerh;
	
	@OneToMany
	private List<Formationc> formations;	

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





	public Formation(String titre, String description, Date dateDebut, Date dateFin, String domaine, Integer place,
			User responsablerh) {
		super();
		this.titre = titre;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.domaine = domaine;
		this.place = place;
		this.responsablerh = responsablerh;
	}


	public Formation(int id, String titre, String description, Date dateDebut, Date dateFin, String domaine,
			Integer place, User responsablerh) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.domaine = domaine;
		this.place = place;
		this.responsablerh = responsablerh;
	}


	public List<Formationc> getFormations() {
		return formations;
	}


	public void setFormations(List<Formationc> formations) {
		this.formations = formations;
	}


	public Integer getPlace() {
		return place;
	}


	public void setPlace(Integer place) {
		this.place = place;
	}
	
	
	

}
