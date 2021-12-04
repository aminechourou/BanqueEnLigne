package projetIMAFA.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import projetIMAFA.entity.Leave_reason;
import projetIMAFA.entity.Type_Leave;
import projetIMAFA.entity.Utilisateur;

@Entity

public class LeaveTest implements Serializable{
 

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int Leave_ID;
	@Enumerated(EnumType.STRING)
	private Type_Leave type_leave;
	@Enumerated(EnumType.STRING)
	private Leave_reason leave_reason;
	private int Leave_Duration;
	@Temporal(TemporalType.DATE)
	private Date Start_date;
	@Temporal(TemporalType.DATE)
	private Date End_date;
	
	
	public int getLeave_id() {
		return Leave_ID;
	}
	public void setLeave_id(int leave_id) {
		this.Leave_ID = leave_id;
	}
	public Type_Leave getType_leave() {
		return type_leave;
	}
	public void setType_leave(Type_Leave type_leave) {
		this.type_leave = type_leave;
	}
	public Leave_reason getLeave_reason() {
		return leave_reason;
	}
	public void setLeave_reason(Leave_reason leave_reason) {
		this.leave_reason = leave_reason;
	}
	public int getLeave_Duration() {
		return Leave_Duration;
	}
	public void setLeave_Duration(int leave_Duration) {
		Leave_Duration = leave_Duration;
	}
	public Date getStart_date() {
		return Start_date;
	}
	public void setStart_date(Date start_date) {
		Start_date = start_date;
	}
	public Date getEnd_date() {
		return End_date;
	}
	public void setEnd_date(Date end_date) {
		End_date = end_date;
	}
	public LeaveTest(int leave_id, Type_Leave type_leave, Leave_reason leave_reason, int leave_Duration,
			Date start_date, Date end_date) {
		super();
		this.Leave_ID = leave_id;
		this.type_leave = type_leave;
		this.leave_reason = leave_reason;
		Leave_Duration = leave_Duration;
		Start_date = start_date;
		End_date = end_date;
	}

	@Override
	public String toString() {
		return "LeaveTest [Leave_ID=" + Leave_ID + ", type_leave=" + type_leave + ", leave_reason=" + leave_reason
				+ ", Leave_Duration=" + Leave_Duration + ", Start_date=" + Start_date + ", End_date=" + End_date
				+ ", Utilisateur=" + Utilisateur + "]";
	}
	public LeaveTest(int leave_Duration, Date start_date) {
		super();
		Leave_Duration = leave_Duration;
		Start_date = start_date;
	}

	@ManyToOne
	Utilisateur Utilisateur;
	public LeaveTest(Type_Leave type_leave, Leave_reason leave_reason, int leave_Duration) {
		super();
		this.type_leave = type_leave;
		this.leave_reason = leave_reason;
		Leave_Duration = leave_Duration;
	}
	public Utilisateur getUtilisateur() {
		return Utilisateur;
	}
	public void setUtilisateur(Utilisateur Utilisateur) {
		this.Utilisateur = Utilisateur;
	}
	public LeaveTest(int leave_ID, Type_Leave type_leave, Leave_reason leave_reason, int leave_Duration,
			Date start_date, Date end_date, projetIMAFA.entity.Utilisateur utilisateur) {
		super();
		Leave_ID = leave_ID;
		this.type_leave = type_leave;
		this.leave_reason = leave_reason;
		Leave_Duration = leave_Duration;
		Start_date = start_date;
		End_date = end_date;
		Utilisateur = utilisateur;
	}
	public LeaveTest(Type_Leave type_leave, Leave_reason leave_reason, int leave_Duration, Date start_date,
			Date end_date, projetIMAFA.entity.Utilisateur utilisateur) {
		super();
		this.type_leave = type_leave;
		this.leave_reason = leave_reason;
		Leave_Duration = leave_Duration;
		Start_date = start_date;
		End_date = end_date;
		Utilisateur = utilisateur;
	}
	public int getLeave_ID() {
		return Leave_ID;
	}
	public void setLeave_ID(int leave_ID) {
		Leave_ID = leave_ID;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public LeaveTest() {
		super();
	}
	
	


	/*public void info(String string) {
		// TODO Auto-generated method stub
		
	}*/




	
	
}

