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
public class CompteEpargne extends CompteBancaire{

private static final long serialVersionUID = -3046278688391172322L;
	
	
	private float tauxInteret;
	
	private float depotMin;
	
	private float imposition;
	
	@Enumerated(EnumType.STRING)
	private TypeEpargne typeEpargne;

	public CompteEpargne() {
		super();
	}

	public CompteEpargne(float tauxInteret, float depotMin, float imposition, TypeEpargne typeEpargne) {
		super();
		this.tauxInteret = tauxInteret;
		this.depotMin = depotMin;
		this.imposition = imposition;
		this.typeEpargne = typeEpargne;
	}

	public float getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(float tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

	public float getDepotMin() {
		return depotMin;
	}

	public void setDepotMin(float depotMin) {
		this.depotMin = depotMin;
	}

	public float getImposition() {
		return imposition;
	}

	public void setImposition(float imposition) {
		this.imposition = imposition;
	}

	public TypeEpargne getTypeEpargne() {
		return typeEpargne;
	}

	public void setTypeEpargne(TypeEpargne typeEpargne) {
		this.typeEpargne = typeEpargne;
	}

	@Override
	public String toString() {
		return "CompteEpargne [tauxInteret=" + tauxInteret + ", depotMin=" + depotMin + ", imposition=" + imposition
				+ ", typeEpargne=" + typeEpargne + "]";
	}
	
	
}
