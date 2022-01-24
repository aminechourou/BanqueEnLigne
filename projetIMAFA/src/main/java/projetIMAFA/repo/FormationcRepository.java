package projetIMAFA.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projetIMAFA.entity.Formationc;

@Repository
public interface FormationcRepository extends JpaRepository<Formationc,Integer> {

}
