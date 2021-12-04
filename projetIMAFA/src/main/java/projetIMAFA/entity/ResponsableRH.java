package projetIMAFA.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class ResponsableRH extends Utilisateur{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@OneToMany
    private List<Formation> formations;
	
	
	
	public List<Formation> getFormations() {
		return formations;
	}



	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}



	public ResponsableRH() {
		super();
		getRole();
		this.setRole(Role.ROLE_RESPONSABLERH);
	}

}
