package projetIMAFA.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projetIMAFA.entity.Data_action;

@Repository
public interface DataRepository extends CrudRepository<Data_action, Integer>  {
	@Query("SELECT d.libelle FROM Data_action d group by d.libelle")
	List<String> afflib();
}
