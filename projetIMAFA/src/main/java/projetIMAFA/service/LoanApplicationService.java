package projetIMAFA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import projetIMAFA.entity.LoanApplication;


@Service
public interface LoanApplicationService {
	public List<LoanApplication> getAllLoanApplications ();
	
	public LoanApplication addLoanApplication(LoanApplication ln);
	
	public void deleteLoanApplication(LoanApplication ln);
	
	public Optional<LoanApplication> getLoanApplicationByID(long id);
	
	public void deleteLoanApplicationByID (long id);
	
	public void deleteAllLoanApplication();
}
