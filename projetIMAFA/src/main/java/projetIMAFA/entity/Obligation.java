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
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Obligation implements Serializable {
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)

private int obligation_ID;
@Temporal(TemporalType.DATE)
private Date date_emission;
private int operation;	
private String codetitre;
private String nomentreprise;
private int maturite;
private int quantite;
private float taux;
@JsonIgnore
@ManyToOne
CompteTitre compteTitre;

public Date getDate_emission() {
	return date_emission;
}
public void setDate_emission(Date date_emission) {
	this.date_emission = date_emission;
}
public String getNomentreprise() {
	return nomentreprise;
}
public void setNomentreprise(String nomentreprise) {
	this.nomentreprise = nomentreprise;
}
public int getMaturite() {
	return maturite;
}
public void setMaturite(int maturite) {
	this.maturite = maturite;
}
public float getTaux() {
	return taux;
}
public void setTaux(float taux) {
	this.taux = taux;
}
public int getObligation_ID() {
	return obligation_ID;
}
public void setObligation_ID(int obligation_ID) {
	this.obligation_ID = obligation_ID;
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
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}


public CompteTitre getCompteTitre() {
	return compteTitre;
}
public void setCompteTitre(CompteTitre compteTitre) {
	this.compteTitre = compteTitre;
}
@Override
public String toString() {
	return "Obligation [obligation_ID=" + obligation_ID + ", date_emission=" + date_emission + ", operation="
			+ operation + ", codetitre=" + codetitre + ", nomentreprise=" + nomentreprise + ", maturite=" + maturite
			+ ", quantite=" + quantite + ", taux=" + taux + ", compteTitre=" + compteTitre + "]";
}

public Obligation(int obligation_ID, Date date_emission, int operation, String codetitre, String nomentreprise,
		int maturite, int quantite, float taux, CompteTitre compteTitre) {
	super();
	this.obligation_ID = obligation_ID;
	this.date_emission = date_emission;
	this.operation = operation;
	this.codetitre = codetitre;
	this.nomentreprise = nomentreprise;
	this.maturite = maturite;
	this.quantite = quantite;
	this.taux = taux;
	this.compteTitre = compteTitre;
}

public Obligation(Date date_emission, int operation, String codetitre, String nomentreprise,
		int maturite, int quantite, float taux, CompteTitre compteTitre) {
	super();
	this.date_emission = date_emission;
	this.operation = operation;
	this.codetitre = codetitre;
	this.nomentreprise = nomentreprise;
	this.maturite = maturite;
	this.quantite = quantite;
	this.taux = taux;
	this.compteTitre = compteTitre;
}

public Obligation() {
	super();
}

}