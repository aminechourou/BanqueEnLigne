package projetIMAFA.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projetIMAFA.entity.CompteBancaire;


@Repository
public interface ICompteBancaireRepository extends CrudRepository<CompteBancaire, Integer>{

}
