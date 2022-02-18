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
	private Date dated;
	
	@Column(name="opend")
	private float opend;

	@Column(name="highd")
	private float highd;

	@Column(name="lowd")
	private float lowd;

	@Column(name="closed")
	private float closed;
	
	@Column(name="adjclosed")
	private float adjclosed;
	
	@Column(name="volumed")
	private long volumed;

	@Column(name="libelled")
	private String libelled;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDated() {
		return dated;
	}

	public void setDated(Date dated) {
		this.dated = dated;
	}

	public float getOpend() {
		return opend;
	}

	public void setOpend(float opend) {
		this.opend = opend;
	}

	public float getHighd() {
		return highd;
	}

	public void setHighd(float highd) {
		this.highd = highd;
	}

	public float getLowd() {
		return lowd;
	}

	public void setLowd(float lowd) {
		this.lowd = lowd;
	}

	public float getClosed() {
		return closed;
	}

	public void setClosed(float closed) {
		this.closed = closed;
	}

	public float getAdjclosed() {
		return adjclosed;
	}

	public void setAdjclosed(float adjclosed) {
		this.adjclosed = adjclosed;
	}

	public long getVolumed() {
		return volumed;
	}

	public void setVolumed(long volumed) {
		this.volumed = volumed;
	}

	public String getLibelled() {
		return libelled;
	}

	public void setLibelled(String libelled) {
		this.libelled = libelled;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
