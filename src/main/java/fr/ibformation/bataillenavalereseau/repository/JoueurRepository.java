package fr.ibformation.bataillenavalereseau.repository;

import org.springframework.data.repository.CrudRepository;

import fr.ibformation.springboot.bataillenavale.gestionnairepartie.Joueur;

public interface JoueurRepository extends CrudRepository<Joueur, Long> {

}
