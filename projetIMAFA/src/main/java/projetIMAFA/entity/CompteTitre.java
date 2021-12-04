package projetIMAFA.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

@Entity
public class CompteTitre {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column(name="Id")
	private int id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateCreation", nullable = true, updatable = false)
	@CreatedDate
	private Date dateCreation;
	
	
	@Column(name="status")
	private String status;
	
	@Column(name="solde")
	private float solde;
	
	@Column(name="rib")
	private String rib;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Obligation> obligations;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Sicav> sicavs;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Action> actions;
	
	@ManyToOne
	Utilisateur utilisateur;
	
	@OneToMany
	List<Ordre> ordres;
	

	public List<Ordre> getOrdres() {
		return ordres;
	}

	public void setOrdres(List<Ordre> ordres) {
		this.ordres = ordres;
	}



	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<Sicav> getSicavs() {
		return sicavs;
	}

	public void setSicavs(List<Sicav> sicavs) {
		this.sicavs = sicavs;
	}
	
	

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public List<Obligation> getObligations() {
		return obligations;
	}

	public void setObligations(List<Obligation> obligations) {
		this.obligations = obligations;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public String getRib() {
		return rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	public CompteTitre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	


}
