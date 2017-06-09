package fr.ibformation.bataillenavalereseau.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import fr.ibformation.bataillenavalereseau.GameManager;
import fr.ibformation.bataillenavalereseau.repository.JoueurRepository;
import fr.ibformation.springboot.bataillenavale.gestionnairepartie.Joueur;


@RestController
public class ConnectionRestController {
	ModelAndView mav = new ModelAndView();
	
	@Autowired GameManager gm;
	@Autowired JoueurRepository joueurRepository;
	@Autowired ConnectionRestController(JoueurRepository joueurRepository){
		this.joueurRepository = joueurRepository;
	}
	Joueur joueur= new Joueur();
	
	@RequestMapping
	
		
	}
	
	
	
	
	
	
	
	
	
}
