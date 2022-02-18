/*package projetIMAFA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import projetIMAFA.entity.LoanApplication;
import projetIMAFA.repo.LoanApplicationRepository;


@Service 
public class LoanApplicationServiceImpl implements LoanApplicationService {
	
	@Autowired
	LoanApplicationRepository  loanApplicationRepository ;
	
	@Override
	public List<LoanApplication> getAllLoanApplications() {
		return loanApplicationRepository.findAll();
	}

	@Override
	public LoanApplication addLoanApplication(LoanApplication ln) {
		LoanApplication loanapplication = loanApplicationRepository.save(ln);
		return loanapplication;
	}


	@Override
	public void deleteLoanApplication(LoanApplication ln) {
		loanApplicationRepository.delete(ln);

	}

	@Override
	public Optional<LoanApplication> getLoanApplicationByID(long id) {

		return loanApplicationRepository.findById(id);
	}

	@Override
	public void deleteLoanApplicationByID(long id) {

		loanApplicationRepository.deleteById(id);

	}

	@Override
	public void deleteAllLoanApplication() {
		loanApplicationRepository.deleteAll();

	}


}
*/