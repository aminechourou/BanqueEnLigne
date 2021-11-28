package projetIMAFA.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;



@Entity
public class Ordre implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column(name="Id")
	private int id;
	
	@Enumerated(EnumType.STRING)
	private TypeOrdre type;
	
	@Enumerated(EnumType.STRING)
	@Column(name="type_produit_financier")
	private TypeProduitFin typepf;
	
	@Column(name="id_produit_financier")
	private int idpf;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateOrdre", nullable = true, updatable = false)
	@CreatedDate
	private Date dateOrdre;
	
	
	public Date getDateOrdre() {
		return dateOrdre;
	}

	public void setDateOrdre(Date dateOrdre) {
		this.dateOrdre = dateOrdre;
	}

	public TypeProduitFin getTypepf() {
		return typepf;
	}

	public void setTypepf(TypeProduitFin typepf) {
		this.typepf = typepf;
	}

	public int getIdpf() {
		return idpf;
	}

	public void setIdpf(int idpf) {
		this.idpf = idpf;
	}

	/*@ManyToOne
	CompteTitre compteTitre;

	public CompteTitre getCompteTitre() {
		return compteTitre;
	}

	public void setCompteTitre(CompteTitre compteTitre) {
		this.compteTitre = compteTitre;
	}
*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TypeOrdre getType() {
		return type;
	}

	public void setType(TypeOrdre type) {
		this.type = type;
	}

	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Ordre() {
		super();
	}

	@Override
	public String toString() {
		return "Ordre [id=" + id + ", type=" + type + ", typepf=" + typepf + ", idpf=" + idpf + ", dateOrdre="
				+ dateOrdre + "]";
	}

	public Ordre(int id, TypeOrdre type, TypeProduitFin typepf, int idpf, Date dateOrdre) {
		super();
		this.id = id;
		this.type = type;
		this.typepf = typepf;
		this.idpf = idpf;
		this.dateOrdre = dateOrdre;
	}

	public Ordre(TypeOrdre type, TypeProduitFin typepf, int idpf, Date dateOrdre) {
		super();
		this.type = type;
		this.typepf = typepf;
		this.idpf = idpf;
		this.dateOrdre = dateOrdre;
	}
	
	
}

