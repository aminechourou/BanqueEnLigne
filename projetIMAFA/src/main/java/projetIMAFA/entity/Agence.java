/**
 * 
 */
package projetIMAFA.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author pc
 *
 */
@Entity
public class Agence implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAgence;
	
	private int codePostal;
	
	private String horaires;
	
	private String adresse;
	
	private String ville;
	
	private String quartier;
	
	private String telephone;
	@Column(unique=true)
    //@Pattern(regex=".+\@.+\..+")
	private String email;
	
	@OneToMany(mappedBy="agence", 
			cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, 
			fetch=FetchType.EAGER)
	private List<CompteBancaire> compteBancaires = new ArrayList<>();

	public Agence() {
		super();
	}

	public Agence(int idAgence) {
		super();
		this.idAgence = idAgence;
	}

	public Agence(int idAgence, int codePostal, String horaires, String adresse, String ville, String quartier,
			String telephone, String email) {
		super();
		this.idAgence = idAgence;
		this.codePostal = codePostal;
		this.horaires = horaires;
		this.adresse = adresse;
		this.ville = ville;
		this.quartier = quartier;
		this.telephone = telephone;
		this.email = email;
	}

	public int getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(int idAgence) {
		this.idAgence = idAgence;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getHoraires() {
		return horaires;
	}

	public void setHoraires(String horaires) {
		this.horaires = horaires;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getQuartier() {
		return quartier;
	}

	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<CompteBancaire> getCompteBancaires() {
		return compteBancaires;
	}

	public void setCompteBancaires(List<CompteBancaire> compteBancaires) {
		this.compteBancaires = compteBancaires;
	}

	@Override
	public String toString() {
		return "Agence [idAgence=" + idAgence + ", codePostal=" + codePostal + ", horaires=" + horaires + ", adresse="
				+ adresse + ", ville=" + ville + ", quartier=" + quartier + ", telephone=" + telephone + ", email="
				+ email + "]";
	}
	
	
}
