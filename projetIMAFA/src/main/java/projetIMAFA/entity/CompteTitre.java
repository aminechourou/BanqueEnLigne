/**
 * 
 */
package projetIMAFA.entity;

import javax.persistence.Entity;

/**
 * @author pc
 *
 */
@Entity
public class CompteTitre extends CompteBancaire{

    private static final long serialVersionUID = -3046278688391172322L;
	
	private String libelle;
	
	private float fraisTenu;
	
	private float fraisCourtage;
	
	private float fraisOPCVM;

	public CompteTitre() {
		super();
	}

	public CompteTitre(String libelle, float fraisTenu, float fraisCourtage, float fraisOPCVM) {
		super();
		this.libelle = libelle;
		this.fraisTenu = fraisTenu;
		this.fraisCourtage = fraisCourtage;
		this.fraisOPCVM = fraisOPCVM;
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

	public float getFraisCourtage() {
		return fraisCourtage;
	}

	public void setFraisCourtage(float fraisCourtage) {
		this.fraisCourtage = fraisCourtage;
	}

	public float getFraisOPCVM() {
		return fraisOPCVM;
	}

	public void setFraisOPCVM(float fraisOPCVM) {
		this.fraisOPCVM = fraisOPCVM;
	}

	@Override
	public String toString() {
		return "CompteTitre [libelle=" + libelle + ", fraisTenu=" + fraisTenu + ", fraisCourtage=" + fraisCourtage
				+ ", fraisOPCVM=" + fraisOPCVM + "]";
	}
	
	
}
