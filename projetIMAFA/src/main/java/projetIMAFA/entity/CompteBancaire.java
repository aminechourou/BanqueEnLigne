/**
 * 
 */
package projetIMAFA.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author pc
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CompteBancaire implements Serializable{
	
	private static final long serialVersionUID = 5377539445871317492L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCompte;
	
	private int rib;
	
	private String iban;
	
	private String swift;
	
	private float solde;
	
	private boolean actif;
	
	//Choisir le TemporalType selon le besoin metier
	@Temporal(TemporalType.DATE)
	private Date dateOuverture;
	
	private boolean bloquer;
	
	private float plafond;
	
	@Enumerated(EnumType.STRING)
	private TypeCompteBancaire typeCompteBancaire;
	
	@OneToMany(mappedBy="compteBancaire", cascade = CascadeType.ALL)
	private List<Operation> operations = new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Agence agence;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Client> compteBancaireclients;

	public CompteBancaire() {
		super();
	}

	public CompteBancaire(int idCompte) {
		super();
		this.idCompte = idCompte;
	}

	public CompteBancaire(int rib, String iban, String swift, float solde, boolean actif, Date dateOuverture,
			boolean bloquer, float plafond, TypeCompteBancaire typeCompteBancaire) {
		super();
		this.rib = rib;
		this.iban = iban;
		this.swift = swift;
		this.solde = solde;
		this.actif = actif;
		this.dateOuverture = dateOuverture;
		this.bloquer = bloquer;
		this.plafond = plafond;
		this.typeCompteBancaire = typeCompteBancaire;
	}

	public CompteBancaire(int idCompte, int rib, String iban, String swift, float solde, boolean actif,
			Date dateOuverture, boolean bloquer, float plafond, TypeCompteBancaire typeCompteBancaire) {
		super();
		this.idCompte = idCompte;
		this.rib = rib;
		this.iban = iban;
		this.swift = swift;
		this.solde = solde;
		this.actif = actif;
		this.dateOuverture = dateOuverture;
		this.bloquer = bloquer;
		this.plafond = plafond;
		this.typeCompteBancaire = typeCompteBancaire;
	}

	public CompteBancaire(int idCompte, int rib, String iban, String swift, float solde, boolean actif,
			Date dateOuverture, boolean bloquer, float plafond, TypeCompteBancaire typeCompteBancaire,
			List<Operation> operations, Agence agence, List<Client> compteBancaireclients) {
		super();
		this.idCompte = idCompte;
		this.rib = rib;
		this.iban = iban;
		this.swift = swift;
		this.solde = solde;
		this.actif = actif;
		this.dateOuverture = dateOuverture;
		this.bloquer = bloquer;
		this.plafond = plafond;
		this.typeCompteBancaire = typeCompteBancaire;
		this.operations = operations;
		this.agence = agence;
		this.compteBancaireclients = compteBancaireclients;
	}

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public int getRib() {
		return rib;
	}

	public void setRib(int rib) {
		this.rib = rib;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getSwift() {
		return swift;
	}

	public void setSwift(String swift) {
		this.swift = swift;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public Date getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public boolean isBloquer() {
		return bloquer;
	}

	public void setBloquer(boolean bloquer) {
		this.bloquer = bloquer;
	}

	public float getPlafond() {
		return plafond;
	}

	public void setPlafond(float plafond) {
		this.plafond = plafond;
	}

	public TypeCompteBancaire getTypeCompteBancaire() {
		return typeCompteBancaire;
	}

	public void setTypeCompteBancaire(TypeCompteBancaire typeCompteBancaire) {
		this.typeCompteBancaire = typeCompteBancaire;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public List<Client> getCompteBancaireclients() {
		return compteBancaireclients;
	}

	public void setCompteBancaireclients(List<Client> compteBancaireclients) {
		this.compteBancaireclients = compteBancaireclients;
	}

	@Override
	public String toString() {
		return "CompteBancaire [idCompte=" + idCompte + ", rib=" + rib + ", iban=" + iban + ", swift=" + swift
				+ ", solde=" + solde + ", actif=" + actif + ", dateOuverture=" + dateOuverture + ", bloquer=" + bloquer
				+ ", plafond=" + plafond + ", typeCompteBancaire=" + typeCompteBancaire + ", operations=" + operations
				+ ", agence=" + agence + ", compteBancaireclients=" + compteBancaireclients + "]";
	}
	
	

}
