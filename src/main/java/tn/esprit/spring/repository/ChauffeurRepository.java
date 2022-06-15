package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.DAO.Chauffeur;
import tn.esprit.spring.DAO.Voiture;


public interface ChauffeurRepository extends CrudRepository<Chauffeur, Long>{

	@Query("SELECT p.voitures FROM  ParcAuto p WHERE p.idParcAuto= :idParcAuto ")
	List<Voiture> retrieveVoitureByParc(@Param("idParcAuto") Long idParcAuto);

	
}
