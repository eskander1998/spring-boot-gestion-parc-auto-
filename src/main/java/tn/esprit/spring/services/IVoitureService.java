package tn.esprit.spring.services;

import tn.esprit.spring.DAO.Voiture;

public interface IVoitureService {

	void ajouterVoiture(Voiture voiture);
	void affecterParcAutoVoiture(Long idParcAuto,Long idVoiture);
}
