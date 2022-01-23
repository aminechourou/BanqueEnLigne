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
private String nomentreprise; 
private int maturite; //echeance
private int valeurnominal; //valeur nominale
private int quantite;
private float tauxactuariel;
private float tauxcoupon;


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

public int getObligation_ID() {
	return obligation_ID;
}
public void setObligation_ID(int obligation_ID) {
	this.obligation_ID = obligation_ID;
}


public static long getSerialversionuid() {
	return serialVersionUID;
}


public Obligation(Date date_emission, String nomentreprise, int maturite, int valeurnominal, int quantite,
		float tauxactuariel, float tauxcoupon) {
	super();
	this.date_emission = date_emission;
	this.nomentreprise = nomentreprise;
	this.maturite = maturite;
	this.valeurnominal = valeurnominal;
	this.quantite = quantite;
	this.tauxactuariel = tauxactuariel;
	this.tauxcoupon = tauxcoupon;
}
public Obligation(int obligation_ID, Date date_emission, String nomentreprise, int maturite, int valeurnominal,
		int quantite, float tauxactuariel, float tauxcoupon) {
	super();
	this.obligation_ID = obligation_ID;
	this.date_emission = date_emission;
	this.nomentreprise = nomentreprise;
	this.maturite = maturite;
	this.valeurnominal = valeurnominal;
	this.quantite = quantite;
	this.tauxactuariel = tauxactuariel;
	this.tauxcoupon = tauxcoupon;
}
@Override
public String toString() {
	return "Obligation [obligation_ID=" + obligation_ID + ", date_emission=" + date_emission + ", nomentreprise="
			+ nomentreprise + ", maturite=" + maturite + ", valeurnominal=" + valeurnominal + ", quantite=" + quantite
			+ ", tauxactuariel=" + tauxactuariel + ", tauxcoupon=" + tauxcoupon + "]";
}
public float getTauxactuariel() {
	return tauxactuariel;
}
public void setTauxactuariel(float tauxactuariel) {
	this.tauxactuariel = tauxactuariel;
}
public float getTauxcoupon() {
	return tauxcoupon;
}
public void setTauxcoupon(float tauxcoupon) {
	this.tauxcoupon = tauxcoupon;
}
public int getValeurnominal() {
	return valeurnominal;
}
public void setValeurnominal(int valeurnominal) {
	this.valeurnominal = valeurnominal;
}

public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public Obligation() {
	super();
}

}