/*package projetIMAFA.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.joda.money.Money;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import projetIMAFA.entity.Loan;
import projetIMAFA.service.LoanServiceImpl;



@Scope(value = "session")
@Controller(value = "loancontroller")
@ELBeanName(value = "loancontroller")
public class LoanController {
	
	@Autowired
	LoanServiceImpl loanServiceImpl;

	/*private long id;
	private long userId;
	private Money amount;
	private double interest;
	private LocalDateTime applicationDate;
	private LocalDateTime loanend;
	private boolean extended;

	private List<Loan> loans;

	public long getId() {
		return id;
	}
	public List<Loan> getLoans() {
		
			loans = loanServiceImpl.getAllLoans();
		
		return loans;
	}
	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserid() {
		return userId;
	}
	public void setUserid(long userid) {
		this.userId = userid;
	}
	public Money getAmount() {
		return amount;
	}
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
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

	/*public void onDateTimeSelect(SelectEvent<LocalDateTime> event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", event.getObject().format(formatter)));
    }*/
	
/*
public void onRowEdit(RowEditEvent<Loan> event) {
		Loan l = (Loan)event.getObject();
		loanServiceImpl.addLoan(l);
		
		FacesMessage msg = new FacesMessage("Loan Edited", String.valueOf(event.getObject().getId()));
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onRowCancel(RowEditEvent<Loan> event) {
		FacesMessage msg = new FacesMessage("Edit Cancelled", String.valueOf(event.getObject().getId()));
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onCellEdit(CellEditEvent<Loan> event) {
		Object oldValue = event.getOldValue();
		Object newValue = event.getNewValue();

		if (newValue != null && !newValue.equals(oldValue)) {


			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
			FacesContext.getCurrentInstance().addMessage(null, msg);

		}

	}

}*/
