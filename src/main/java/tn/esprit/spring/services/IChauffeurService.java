package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.DAO.Chauffeur;
import tn.esprit.spring.DAO.Voiture;

public interface IChauffeurService {

	List<Chauffeur> listeChauffeurParParcAuto(Long idParcAuto);
}
