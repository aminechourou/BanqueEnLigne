package projetIMAFA.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.joda.money.Money;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ActiveLoans")
@Getter
@Setter
@AllArgsConstructor

public class Loan implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "User_ID")
	private long userId;
	
	@Column(name = "Amount")
	private Money amount;
	
	@Column(name = "Interest_Rate")
    private double interest ;
	
	@Column(name = "Application_Date")
	private LocalDateTime applicationDate;
	
	@Column(name = "Loan_End_Date")
	private LocalDateTime loanend;
	
	@Column(name = "Extended")
	private boolean extended;
	
	@OneToOne
	private LoanApplication loanApplication;
	
	
	

	public Loan() {
		
	}
	
	public long getId() {
		return id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Money getAmount() {
		return amount;
	}

	

	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getInterest() {
		return interest;
	}

	

	public LocalDateTime getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(LocalDateTime applicationDate) {
		this.applicationDate = applicationDate;
	}

	public LocalDateTime getLoanend() {
		return loanend;
	}

	public void setLoanend(LocalDateTime loanend) {
		this.loanend = loanend;
	}

	public boolean isExtended() {
		return extended;
	}

	public void setExtended(boolean extended) {
		this.extended = extended;
	}
	

}
