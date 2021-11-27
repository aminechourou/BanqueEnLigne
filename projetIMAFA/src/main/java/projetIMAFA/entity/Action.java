package projetIMAFA.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Action implements Serializable {
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)

private int action_ID;
@Temporal(TemporalType.DATE)
private Date date;
private int operation;	
private String codetitre;
private String libelle;
private int cours;
private int quantite;
private int Num_compte;
public int getAction_ID() {
	return action_ID;
}
public void setAction_ID(int action_ID) {
	this.action_ID = action_ID;
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
public int getNum_compte() {
	return Num_compte;
}
public void setNum_compte(int num_compte) {
	Num_compte = num_compte;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
@Override
public String toString() {
	return "Action [action_ID=" + action_ID + ", date=" + date + ", operation=" + operation + ", codetitre=" + codetitre
			+ ", libelle=" + libelle + ", cours=" + cours + ", quantite=" + quantite + ", Num_compte=" + Num_compte
			+ "]";
}
public Action(int action_ID, Date date, int operation, String codetitre, String libelle, int cours, int quantite,
		int num_compte) {
	super();
	this.action_ID = action_ID;
	this.date = date;
	this.operation = operation;
	this.codetitre = codetitre;
	this.libelle = libelle;
	this.cours = cours;
	this.quantite = quantite;
	Num_compte = num_compte;
}
public Action(Date date, int operation, String codetitre, String libelle, int cours, int quantite, int num_compte) {
	super();
	this.date = date;
	this.operation = operation;
	this.codetitre = codetitre;
	this.libelle = libelle;
	this.cours = cours;
	this.quantite = quantite;
	Num_compte = num_compte;
}
public Action() {
	super();
}



}