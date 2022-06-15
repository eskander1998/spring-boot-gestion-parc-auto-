package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.DAO.Chauffeur;
import tn.esprit.spring.DAO.Voiture;
import tn.esprit.spring.services.ChauffeurServiceImpl;
import tn.esprit.spring.services.VoitureServiceImpl;



@RestController
public class mainRestController {

	
	  @Autowired
	    VoitureServiceImpl voitureService;
	  @Autowired
	  ChauffeurServiceImpl chauffeurService;
	  
	    @PutMapping("/affecter/{idParcAuto}/{idVoiture}")
	    @ResponseBody
		public void affecterParcAutoVoiture(@PathVariable("idParcAuto")  Long idParcAuto, @PathVariable("idVoiture")  Long idVoiture){
	    	
	    	voitureService.affecterParcAutoVoiture(idParcAuto, idVoiture);
	    }

	    	@GetMapping("/liste-chauffeur/{idParcAuto}")
	    	@ResponseBody
	    	public List<Chauffeur> listeChauffeurParParcAuto(@PathVariable("idParcAuto")  Long idParcAuto){
	    		
	    		return chauffeurService.listeChauffeurParParcAuto(idParcAuto);
	    	}
	    	
	    	
}
