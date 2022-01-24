package projetIMAFA.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Obligationc {
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int obligationc_ID;	

private float montant_investi ;
private float montant_rembourse ;

@Temporal(TemporalType.DATE)
private Date date_emission;

@JsonIgnore
@ManyToOne
CompteTitre compteTitre;

@JsonIgnore
@ManyToOne
Obligation obligation;

public float getMontant_investi() {
	return montant_investi;
}

public void setMontant_investi(float montant_investi) {
	this.montant_investi = montant_investi;
}

public Date getDate_emission() {
	return date_emission;
}

public void setDate_emission(Date date_emission) {
	this.date_emission = date_emission;
}

public CompteTitre getCompteTitre() {
	return compteTitre;
}

public void setCompteTitre(CompteTitre compteTitre) {
	this.compteTitre = compteTitre;
}

public Obligation getObligation() {
	return obligation;
}

public void setObligation(Obligation obligation) {
	this.obligation = obligation;
}

public int getObligationc_ID() {
	return obligationc_ID;
}

public void setObligationc_ID(int obligationc_ID) {
	this.obligationc_ID = obligationc_ID;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

public float getMontant_rembourse() {
	return montant_rembourse;
}

public void setMontant_rembourse(float montant_rembourse) {
	this.montant_rembourse = montant_rembourse;
}



public Obligationc(float montant_investi, float montant_rembourse, Date date_emission, CompteTitre compteTitre,
		Obligation obligation) {
	super();
	this.montant_investi = montant_investi;
	this.montant_rembourse = montant_rembourse;
	this.date_emission = date_emission;
	this.compteTitre = compteTitre;
	this.obligation = obligation;
}

public Obligationc(int obligationc_ID, float montant_investi, float montant_rembourse, Date date_emission,
		CompteTitre compteTitre, Obligation obligation) {
	super();
	this.obligationc_ID = obligationc_ID;
	this.montant_investi = montant_investi;
	this.montant_rembourse = montant_rembourse;
	this.date_emission = date_emission;
	this.compteTitre = compteTitre;
	this.obligation = obligation;
}

public Obligationc() {
	super();
}


}
