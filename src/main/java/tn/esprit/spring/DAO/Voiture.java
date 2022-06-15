package tn.esprit.spring.DAO;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Voiture {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idVoiture")

	private Long idVoiture; 

	private String immatriculation;

	@Enumerated (EnumType.STRING)
	private Marque marque;
	
	 @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	 private Chauffeur chauffeur;

		 
	public Voiture() {
		
	}
	 
	 
}
