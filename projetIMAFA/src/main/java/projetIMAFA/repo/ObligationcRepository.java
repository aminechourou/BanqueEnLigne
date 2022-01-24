package projetIMAFA.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import projetIMAFA.entity.Obligation;
import projetIMAFA.entity.Obligationc;

@Repository
public interface ObligationcRepository extends JpaRepository<Obligationc,Integer> {
	
	@Query("SELECT a FROM Obligationc a WHERE a.compteTitre.id=?1")
	List<Obligationc> compteObligation(int id);
}
