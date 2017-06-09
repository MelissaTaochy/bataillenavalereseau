package fr.ibformation.bataillenavalereseau;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.ibformation.bataillenavalereseau.repository.JoueurRepository;
import fr.ibformation.bataillenavalereseau.repository.PartieRepository;
import fr.ibformation.springboot.bataillenavale.gestionnairepartie.Joueur;
import fr.ibformation.springboot.bataillenavale.gestionnairepartie.Partie;
@Component
public class GameManager {
	
	@Autowired
	private JoueurRepository daoJoueur;
	@Autowired
	private PartieRepository daoPartie;
	private List<Partie> parties = new ArrayList<>();
	private List<Joueur> joueurs = new ArrayList<>();
	
	
	@PostConstruct
	public void init(){
		joueurs = (List<Joueur>) daoJoueur.findAll();
		parties = (List<Partie>) daoPartie.findAll();
		
	}
	
	
	public List<Partie> getParties() {
		return parties;
	}
	public void setParties(List<Partie> parties) {
		this.parties = parties;
	}
	public List<Joueur> getJoueurs() {
		return joueurs;
	}
	public void setJoueurs(List<Joueur> joueurs) {
		this.joueurs = joueurs;
	}
	
	
	

}
