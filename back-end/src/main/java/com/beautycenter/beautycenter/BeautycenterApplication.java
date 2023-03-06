package com.beautycenter.beautycenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BeautycenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeautycenterApplication.class, args);
	
		
	}

}
// L’annotazione @SpringBootApplication usata per la classe principale dell’applicazione indica una

// combinazione di:

// • @Configuration - che etichetta la classe come una classe di configurazione Java;
// • @ComponentScan – che abilita la scansione e l’identificazione automatica dei componenti/bean;
// • @EnableAutoConfiguration – si occupa della creazione automatica dei componenti/bean mancanti o necessari (secondo Spring Boot)