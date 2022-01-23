package projetIMAFA.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetIMAFA.entity.Obligationc;

@Repository
public interface ObligationcRepository extends JpaRepository<Obligationc,Integer> {

}
