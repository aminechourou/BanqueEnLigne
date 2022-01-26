package projetIMAFA.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Loan_Applications")
@RequiredArgsConstructor
@Getter
@Setter
public class LoanApplication implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "user_id")
	private long userid;
	
	
	@Column(name = "age")
	private long age ;
	
	
	@Column(name = "annual_income")
	private double annualincome;
	
	
	@Column(name = "employment_duration")
	private double emplduration ;
	
	
	@Column(name = "Loan_amount")
	//@Type(type = "org.joda.money.Money;")
	private BigDecimal loanamount ;
	
	
	@Column(name = "Interest")
	private double interest ;
	
	
	@Column(name = "home_ownership")
	@Enumerated(EnumType.STRING)
	private ownership homeownership ;
	
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "application_date")
	private LocalDateTime applicationdate;
	
	
	@Column(name = "period")
	private int period;
	
	@Column(name = "loan_status")
	@Enumerated(EnumType.STRING)
	private Loanstatus loanstatus;
	
	@Column(name = "Solvability")
	private int solvability;
	
	@OneToOne
	private Loan loan;
	

	public int getSolvability() {
		return solvability;
	}

	public void setSolvability(int solvability) {
		this.solvability = solvability;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public double getAnnualincome() {
		return annualincome;
	}

	public void setAnnualincome(double annualincome) {
		this.annualincome = annualincome;
	}

	public double getEmplduration() {
		return emplduration;
	}

	public void setEmplduration(double emplduration) {
		this.emplduration = emplduration;
	}

	public   BigDecimal getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(  BigDecimal loanamount) {
		this.loanamount = loanamount;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public ownership getHomeownership() {
		return homeownership;
	}

	public void setHomeownership(ownership homeownership) {
		this.homeownership = homeownership;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getApplicationdate() {
		return applicationdate;
	}

	public void setApplicationdate(LocalDateTime applicationdate) {
		this.applicationdate = applicationdate;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public Loanstatus getLoanstatus() {
		return loanstatus;
	}

	public void setLoanstatus(Loanstatus loanstatus) {
		this.loanstatus = loanstatus;
	}

}
