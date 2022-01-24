package projetIMAFA.repo;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import projetIMAFA.entity.Formation;
import projetIMAFA.repo.FormationRepository;

@Repository
public interface FormationRepository extends JpaRepository < Formation ,Integer>{

	@Query("SELECT u.First_name FROM User u WHERE u.Role_User = 'ROLE_RESPONSABLERH'  ")  
	public List<String> Employeecin();

	@Modifying
	@Transactional
	@Query("update Formation u set u.place=u.place-1 where u.id = ?1")
	void place(Integer id);
	
}
