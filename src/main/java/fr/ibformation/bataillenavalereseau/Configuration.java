package fr.ibformation.bataillenavalereseau;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@EntityScan({"fr.ibformation.springboot.bataillenavale"})
@ComponentScan({"fr.ibformation.bataillenavalereseau"})


public class Configuration {

}
