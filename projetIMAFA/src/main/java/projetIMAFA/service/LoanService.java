package projetIMAFA.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import projetIMAFA.entity.Loan;




@Service
public interface LoanService {
public List<Loan> getAllLoans();
	
    public Loan addLoan(Loan l);
	
	public void deleteLoanByID(long id);
	
	public Optional<Loan> getLoanByID(long id);
	
	public Optional<Loan> findByUserID(long id);

}
