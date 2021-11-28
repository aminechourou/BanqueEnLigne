package projetIMAFA.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projetIMAFA.entity.NouveauChamp;


@Repository
public interface INouveauChampRepository extends CrudRepository<NouveauChamp, Integer>{

}
