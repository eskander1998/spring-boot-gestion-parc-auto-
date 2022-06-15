package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.DAO.ParcAuto;
import tn.esprit.spring.DAO.Voiture;
import tn.esprit.spring.repository.ParcAutoRepository;
import tn.esprit.spring.repository.VoitureRepository;

@Service()
public class VoitureServiceImpl  implements IVoitureService{

	@Autowired
	VoitureRepository voitureRepository;
	@Autowired
	ParcAutoRepository ParcAutoRepository;
	@Override
	public void ajouterVoiture(Voiture voiture) {
		voitureRepository.save(voiture);		
	}
	
	@Override
	public void affecterParcAutoVoiture(Long idParcAuto,Long  idVoiture){
		Voiture voiture=voitureRepository.findById(idVoiture).get();
		ParcAuto parcA=ParcAutoRepository.findById(idParcAuto).get();
		parcA.getVoitures().add(voiture);
		ParcAutoRepository.save(parcA);
	}


}
