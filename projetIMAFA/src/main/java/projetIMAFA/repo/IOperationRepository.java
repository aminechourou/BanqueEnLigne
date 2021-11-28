package projetIMAFA.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projetIMAFA.entity.NomOperation;
import projetIMAFA.entity.Operation;


@Repository
public interface IOperationRepository extends CrudRepository<Operation, Integer> {

	@Query("SELECT a FROM Operation a WHERE a.nomOperation= ?1")
	List<Operation> getOperationByNomOperation(NomOperation nomOperation);
	
}
