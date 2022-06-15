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
public class ParcAuto {
	
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name="idParcAuto")

private Long idParcAuto; 

private String libelle;

private Long capacite;

@JsonIgnore
@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
private Set<Voiture> voitures;


public ParcAuto(){
	
}
}
