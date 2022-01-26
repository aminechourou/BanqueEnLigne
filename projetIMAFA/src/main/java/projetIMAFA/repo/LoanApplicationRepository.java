package projetIMAFA.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projetIMAFA.entity.LoanApplication;




@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long>{

}
