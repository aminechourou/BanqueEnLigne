/**
 * 
 */
package projetIMAFA.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * @author pc
 *
 */
@Entity
public class CompteCourant extends CompteBancaire{

    private static final long serialVersionUID = -3046278688391172322L;
	
	private String libelle;
	
	private float fraisTenu;
	
	private float maxDecouvert;
	
	private int dureeDecouvertmois;

	public CompteCourant() {
		super();
	}

	public CompteCourant(String libelle, float fraisTenu, float maxDecouvert, int dureeDecouvertmois) {
		super();
		this.libelle = libelle;
		this.fraisTenu = fraisTenu;
		this.maxDecouvert = maxDecouvert;
		this.dureeDecouvertmois = dureeDecouvertmois;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public float getFraisTenu() {
		return fraisTenu;
	}

	public void setFraisTenu(float fraisTenu) {
		this.fraisTenu = fraisTenu;
	}

	public float getMaxDecouvert() {
		return maxDecouvert;
	}

	public void setMaxDecouvert(float maxDecouvert) {
		this.maxDecouvert = maxDecouvert;
	}

	public int getDureeDecouvertmois() {
		return dureeDecouvertmois;
	}

	public void setDureeDecouvertmois(int dureeDecouvertmois) {
		this.dureeDecouvertmois = dureeDecouvertmois;
	}

	@Override
	public String toString() {
		return "CompteCourant [libelle=" + libelle + ", fraisTenu=" + fraisTenu + ", maxDecouvert=" + maxDecouvert
				+ ", dureeDecouvertmois=" + dureeDecouvertmois + "]";
	}
	
	
}
