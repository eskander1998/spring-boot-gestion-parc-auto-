package tn.esprit.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.DAO.Chauffeur;
import tn.esprit.spring.DAO.ParcAuto;
import tn.esprit.spring.DAO.Voiture;
import tn.esprit.spring.repository.ChauffeurRepository;
import tn.esprit.spring.repository.ParcAutoRepository;
import tn.esprit.spring.repository.VoitureRepository;

@Service()
public class ChauffeurServiceImpl implements IChauffeurService{
	@Autowired
	VoitureRepository voitureRepository;
	@Autowired
	ParcAutoRepository ParcAutoRepository;
	@Autowired
	ChauffeurRepository ChauffeurRepository;
	
	
	@Override
	public List<Chauffeur> listeChauffeurParParcAuto(Long idParcAuto) {
	
		
		List<Voiture> voiture = ChauffeurRepository.retrieveVoitureByParc(idParcAuto);

	ArrayList<Chauffeur> chauffeur = new ArrayList<>();
	for(Voiture v : voiture){
		chauffeur.add(v.getChauffeur());
	}
		
		return chauffeur;
		}
	

}
