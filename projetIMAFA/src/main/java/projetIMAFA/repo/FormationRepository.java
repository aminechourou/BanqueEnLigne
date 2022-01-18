package projetIMAFA.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import projetIMAFA.entity.Formation;
import projetIMAFA.repo.FormationRepository;

@Repository
public interface FormationRepository extends JpaRepository < Formation ,Integer>{

	@Query("SELECT u.First_name FROM User u WHERE u.Role_User <> 'ROLE_RESPONSABLERH'  ")  
	public List<String> Employeecin();
	
}
