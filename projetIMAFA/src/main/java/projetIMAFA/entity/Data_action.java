package projetIMAFA.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Data_action implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Column(name="open")
	private float open;

	@Column(name="high")
	private float high;

	@Column(name="low")
	private float low;

	@Column(name="close")
	private float close;
	
	@Column(name="adjclose")
	private float adjclose;
	
	@Column(name="volume")
	private long volume;

	@Column(name="libelle")
	private String libelle;
}
