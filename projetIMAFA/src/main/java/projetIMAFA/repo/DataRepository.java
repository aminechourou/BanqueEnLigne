package projetIMAFA.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projetIMAFA.entity.Data_action;


@Repository
public interface DataRepository extends CrudRepository<Data_action, Integer>  {
	@Query("SELECT d.libelled FROM Data_action d group by d.libelled")
	List<String> afflib();
	@Query(value = "SELECT d FROM Data_action d where d.dated='2011-12-21'")
	List<Data_action> affdatas();
	@Query("SELECT d FROM Data_action d WHERE d.id= ?1")
	Data_action getData(Integer idd);
	@Query("SELECT d.dated FROM Data_action d GROUP BY d.libelled")
	 List<String> getActionsbydate();
	@Query("SELECT d.closed FROM Data_action d GROUP BY d.dated")
	 List<Float> getClosebydate();

}
