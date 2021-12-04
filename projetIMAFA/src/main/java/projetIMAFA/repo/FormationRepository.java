package projetIMAFA.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import projetIMAFA.entity.Formation;
import projetIMAFA.repo.FormationRepository;

public interface FormationRepository extends JpaRepository < Formation ,Integer>{

}
