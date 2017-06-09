package fr.ibformation.bataillenavalereseau;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.ibformation.bataillenavalereseau.repository.JoueurRepository;
import fr.ibformation.bataillenavalereseau.repository.PartieRepository;
import fr.ibformation.springboot.bataillenavale.gestionnairepartie.Joueur;
import fr.ibformation.springboot.bataillenavale.gestionnairepartie.Partie;

@SpringBootApplication
public class BataillenavalereseauApplication {

	public static void main(String[] args) {
		SpringApplication.run(BataillenavalereseauApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner demo(JoueurRepository joueurRepo, PartieRepository partieRepo){
		return (args)->{
			
			
			
			
			
		
		
		};
	}
}
