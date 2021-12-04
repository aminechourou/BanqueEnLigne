package projetIMAFA.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import projetIMAFA.entity.CompteTitre;

@Repository
public interface CompteTitreRepository extends JpaRepository<CompteTitre, Integer> {
	/*
	@Query("SELECT c FROM CompteTitre c WHERE c.client.id =:idClient")
	List<CompteTitre> findCompteTitreByClient(@Param("idClient")int idClient);
	
	@Query("SELECT c from CompteTitre c WHERE c.status=:value")
	List<CompteTitre> getCompteTitreByStatus(@Param("value")String value);
	
	@Query("SELECT c  FROM CompteTitre c WHERE c.client.id=:idClient ")
	CompteTitre getIdCompteTitre(@Param("idClient") Integer idClient);
*/
}
