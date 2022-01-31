package projetIMAFA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Formationc {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column(name="Id")
	private int id;
	
	@ManyToOne
    private User client;
	
	@ManyToOne
    private Formation formation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	public Formationc(int id, User client, Formation formation) {
		super();
		this.id = id;
		this.client = client;
		this.formation = formation;
	}

	public Formationc(User client, Formation formation) {
		super();
		this.client = client;
		this.formation = formation;
	}
	
	public Formationc() {
		super();
	}
	
}
