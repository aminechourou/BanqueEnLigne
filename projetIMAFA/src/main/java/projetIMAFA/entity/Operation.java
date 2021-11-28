/**
 * 
 */
package projetIMAFA.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author pc
 *
 */
@Entity
public class Operation implements Serializable{

	private static final long serialVersionUID = 5377539445871317492L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idOperation;
	
	@Enumerated(EnumType.STRING)
	private NomOperation nomOperation;
	
	@Temporal(TemporalType.DATE)
	private Date dateOperation;
	
	private float montant;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private CompteBancaire compteBancaire;

	public Operation() {
		super();
	}

	public Operation(int idOperation) {
		super();
		this.idOperation = idOperation;
	}

	public Operation(int idOperation, NomOperation nomOperation, Date dateOperation, float montant) {
		super();
		this.idOperation = idOperation;
		this.nomOperation = nomOperation;
		this.dateOperation = dateOperation;
		this.montant = montant;
	}

	public Operation(int idOperation, NomOperation nomOperation, Date dateOperation, float montant,
			CompteBancaire compteBancaire) {
		super();
		this.idOperation = idOperation;
		this.nomOperation = nomOperation;
		this.dateOperation = dateOperation;
		this.montant = montant;
		this.compteBancaire = compteBancaire;
	}

	public int getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(int idOperation) {
		this.idOperation = idOperation;
	}

	public NomOperation getNomOperation() {
		return nomOperation;
	}

	public void setNomOperation(NomOperation nomOperation) {
		this.nomOperation = nomOperation;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public CompteBancaire getCompteBancaire() {
		return compteBancaire;
	}

	public void setCompteBancaire(CompteBancaire compteBancaire) {
		this.compteBancaire = compteBancaire;
	}

	@Override
	public String toString() {
		return "Operation [idOperation=" + idOperation + ", nomOperation=" + nomOperation + ", dateOperation="
				+ dateOperation + ", montant=" + montant + ", compteBancaire=" + compteBancaire + "]";
	}
	
	
}
