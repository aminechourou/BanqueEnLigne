package projetIMAFA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import projetIMAFA.entity.Ordre;



public interface OrdreRepository extends JpaRepository<Ordre, Integer> {

}
