package projetIMAFA.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Sicav implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)

	private int sicav_ID;
	@Temporal(TemporalType.DATE)
	private Date date;
	

	private int operation;
	
	private String codetitre;
	private String libelle;
	private int cours;
	private int quantite;
	@ManyToMany(cascade = CascadeType.ALL)
	List<CompteTitre> comptestitre;
	
	public int getSicav_ID() {
		return sicav_ID;
	}
	public void setSicav_ID(int sicav_ID) {
		this.sicav_ID = sicav_ID;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getOperation() {
		return operation;
	}
	public void setOperation(int operation) {
		this.operation = operation;
	}
	public String getCodetitre() {
		return codetitre;
	}
	public void setCodetitre(String codetitre) {
		this.codetitre = codetitre;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getCours() {
		return cours;
	}
	public void setCours(int cours) {
		this.cours = cours;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<CompteTitre> getComptestitre() {
		return comptestitre;
	}
	public void setComptestitre(List<CompteTitre> comptestitre) {
		this.comptestitre = comptestitre;
	}
	public Sicav(int sicav_ID, Date date, int operation, String codetitre, String libelle, int cours, int quantite,
			List<CompteTitre> comptestitre) {
		super();
		this.sicav_ID = sicav_ID;
		this.date = date;
		this.operation = operation;
		this.codetitre = codetitre;
		this.libelle = libelle;
		this.cours = cours;
		this.quantite = quantite;
		this.comptestitre = comptestitre;
	}
	public Sicav(Date date, int operation, String codetitre, String libelle, int cours, int quantite,
			List<CompteTitre> comptestitre) {
		super();
		this.date = date;
		this.operation = operation;
		this.codetitre = codetitre;
		this.libelle = libelle;
		this.cours = cours;
		this.quantite = quantite;
		this.comptestitre = comptestitre;
	}
	public Sicav() {
		super();
	}
	
	
}
