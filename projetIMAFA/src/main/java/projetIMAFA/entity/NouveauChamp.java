/**
 * 
 */
package projetIMAFA.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author pc
 *
 */
@Entity
public class NouveauChamp implements Serializable{

	private static final long serialVersionUID = 5377539445871317492L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idChamp;
	
	private String nom;
	
	private String type;
	
	private String valeur;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private NouveauTypeCompte nouveauTypeCompte;

	public NouveauChamp() {
		super();
	}

	public NouveauChamp(int idChamp) {
		super();
		this.idChamp = idChamp;
	}

	public NouveauChamp(int idChamp, String nom, String type, String valeur) {
		super();
		this.idChamp = idChamp;
		this.nom = nom;
		this.type = type;
		this.valeur = valeur;
	}

	public int getIdChamp() {
		return idChamp;
	}

	public void setIdChamp(int idChamp) {
		this.idChamp = idChamp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	public NouveauTypeCompte getNouveauTypeCompte() {
		return nouveauTypeCompte;
	}

	public void setNouveauTypeCompte(NouveauTypeCompte nouveauTypeCompte) {
		this.nouveauTypeCompte = nouveauTypeCompte;
	}

	@Override
	public String toString() {
		return "NouveauChamp [idChamp=" + idChamp + ", nom=" + nom + ", type=" + type + ", valeur=" + valeur + "]";
	}
	
	
}
