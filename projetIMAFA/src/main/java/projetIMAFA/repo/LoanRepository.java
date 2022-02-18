/*package projetIMAFA.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import projetIMAFA.entity.Loan;
import projetIMAFA.entity.LoanApplication;




@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

	Optional<Loan>findByuserId(long userId);
	boolean existsByuserId(long userId);
	Optional<Loan>findByloanApplication(LoanApplication ln);
}
*/