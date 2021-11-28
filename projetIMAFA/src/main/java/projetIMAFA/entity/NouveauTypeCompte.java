/**
 * 
 */
package projetIMAFA.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 * @author pc
 *
 */
@Entity
public class NouveauTypeCompte extends CompteBancaire{

	private static final long serialVersionUID = 5377539445871317492L;
	
	private String nom;
	
	@OneToMany(mappedBy="nouveauTypeCompte", cascade = CascadeType.ALL)
	private List<NouveauChamp> nouveauChamps = new ArrayList<>();

	public NouveauTypeCompte() {
		super();
	}

	public NouveauTypeCompte(String nom, List<NouveauChamp> nouveauChamps) {
		super();
		this.nom = nom;
		this.nouveauChamps = nouveauChamps;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<NouveauChamp> getNouveauChamps() {
		return nouveauChamps;
	}

	public void setNouveauChamps(List<NouveauChamp> nouveauChamps) {
		this.nouveauChamps = nouveauChamps;
	}

	@Override
	public String toString() {
		return "NouveauTypeCompte [nom=" + nom + ", nouveauChamps=" + nouveauChamps + "]";
	}
	
	
}
