package projetIMAFA.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import projetIMAFA.entity.Formation;
import projetIMAFA.entity.Formationc;
import projetIMAFA.entity.User;

@Repository
public interface FormationcRepository extends JpaRepository<Formationc,Integer> {
	@Query("SELECT u.formation FROM Formationc u WHERE u.client= ?1 and u.formation= ?2  ")  
	public Formationc forclie(User idc,Formation idf);
}
