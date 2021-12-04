package projetIMAFA.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import projetIMAFA.entity.CompteTitre;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="client")
public class Client extends Utilisateur {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//hello hello
	@Column(name="cin")
	private String cin;
	
	@Column(name="rue")
	private String rue;
	
	@Column(name="ville")
	private String ville;
	
	@Column(name="codePostal")
	private String codePostal;
	
	@Column(name="dateNaissance")
	private Date dateNaissance;
	
	/*@OneToMany
    private List<Reclamation> reclamations ;
	
	
	@OneToMany
    private List<CompteBancaire> comptesepargnes ;
	
	
	@OneToMany
    private List<CompteCourant> comptescourants ;*/
	
	@OneToMany
    private List<CompteTitre> comptestitres ;
	
	/*@OneToMany 
    private List<Valeur> valeurs ;
	
	@OneToMany
    private List<CreditPredefini> credit ;
	
 
	public List<Reclamation> getReclamations() {
		return reclamations;
	}

	public void setReclamations(List<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}*/

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	
	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Client() {
		super();
		getRole();
		this.setRole(Role.ROLE_CLIENT);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/*public List<CompteBancaire> getComptesepargnes() {
		return comptesepargnes;
	}

	public void setComptesepargnes(List<CompteBancaire> comptesepargnes) {
		this.comptesepargnes = comptesepargnes;
	}

	public List<CompteCourant> getComptescourants() {
		return comptescourants;
	}

	public void setComptescourants(List<CompteCourant> comptescourants) {
		this.comptescourants = comptescourants;
	}
*/
	public List<CompteTitre> getComptestitres() {
		return comptestitres;
	}

	public void setComptestitres(List<CompteTitre> comptestitres) {
		this.comptestitres = comptestitres;
	}

	/*public List<Valeur> getValeurs() {
		return valeurs;
	}

	public void setValeurs(List<Valeur> valeurs) {
		this.valeurs = valeurs;
	}

	public List<CreditPredefini> getCredit() {
		return credit;
	}

	public void setCredit(List<CreditPredefini> credit) {
		this.credit = credit;
	}

	
	*/
	

	
	
	
	
	


}
