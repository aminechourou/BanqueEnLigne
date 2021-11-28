/**
 * 
 */
package projetIMAFA.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author pc
 *
 */
@Entity
public class Client extends User{

	private static final long serialVersionUID = -5369734855993305723L;

	private int numCni;
	
	private int numPasseport;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	@Enumerated(EnumType.STRING)
	private TypeClient typeClient;

	@ManyToMany(mappedBy="compteBancaireclients", cascade = CascadeType.ALL)
	private List<CompteBancaire> compteBancaires;
	
	public Client() {
		super();
	}

	public Client(int numCni, int numPasseport, Date dateNaissance, TypeClient typeClient) {
		super();
		this.numCni = numCni;
		this.numPasseport = numPasseport;
		this.dateNaissance = dateNaissance;
		this.typeClient = typeClient;
	}

	public Client(int numCni, int numPasseport, Date dateNaissance, TypeClient typeClient,
			List<CompteBancaire> compteBancaires) {
		super();
		this.numCni = numCni;
		this.numPasseport = numPasseport;
		this.dateNaissance = dateNaissance;
		this.typeClient = typeClient;
		this.compteBancaires = compteBancaires;
	}

	public int getNumCni() {
		return numCni;
	}

	public void setNumCni(int numCni) {
		this.numCni = numCni;
	}

	public int getNumPasseport() {
		return numPasseport;
	}

	public void setNumPasseport(int numPasseport) {
		this.numPasseport = numPasseport;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public TypeClient getTypeClient() {
		return typeClient;
	}

	public void setTypeClient(TypeClient typeClient) {
		this.typeClient = typeClient;
	}

	public List<CompteBancaire> getCompteBancaires() {
		return compteBancaires;
	}

	public void setCompteBancaires(List<CompteBancaire> compteBancaires) {
		this.compteBancaires = compteBancaires;
	}

	@Override
	public String toString() {
		return "Client [numCni=" + numCni + ", numPasseport=" + numPasseport + ", dateNaissance=" + dateNaissance
				+ ", typeClient=" + typeClient + ", compteBancaires=" + compteBancaires + "]";
	}
	
	

}
