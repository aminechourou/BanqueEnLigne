package projetIMAFA.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projetIMAFA.entity.Agence;



@Repository
public interface IAgenceRepository extends CrudRepository<Agence, Integer>{

}
