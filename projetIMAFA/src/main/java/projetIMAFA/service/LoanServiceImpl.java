package projetIMAFA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetIMAFA.entity.Loan;
import projetIMAFA.repo.LoanRepository;



@Service 
public class LoanServiceImpl implements LoanService {
	@Autowired
	LoanRepository loanRepository;
	
	@Override
	public List<Loan> getAllLoans() {
		return loanRepository.findAll();
	}

	@Override
	public Loan addLoan(Loan l) {
		
		Loan loan = loanRepository.save(l);
		return loan;
	}

	@Override
	public void deleteLoanByID(long id) {
		
		loanRepository.deleteById(id);;
		
	}

	@Override
	public Optional<Loan> getLoanByID(long id) {
		
		return loanRepository.findById(id);
	}

	@Override
	public Optional<Loan> findByUserID(long id) {
		
		return loanRepository.findByuserId(id);
	}

}
