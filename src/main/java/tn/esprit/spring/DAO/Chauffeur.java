package tn.esprit.spring.DAO;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
public class Chauffeur {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idChauffeur")

	private Long idChauffeur; 

	private String nom;

	private String prenom;

	@Temporal(TemporalType.DATE)
	private Date dateRecrutement;
	
	@JsonIgnore
	@OneToOne(mappedBy="chauffeur") 
    private Voiture voiture;
	
	public Chauffeur(){
		
	}
}
