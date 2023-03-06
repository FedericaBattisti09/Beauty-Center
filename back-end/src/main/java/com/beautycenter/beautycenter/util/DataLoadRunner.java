package com.beautycenter.beautycenter.util;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.beautycenter.beautycenter.model.ListServices;
import com.beautycenter.beautycenter.model.Promo;
import com.beautycenter.beautycenter.repositories.ListServicesRepository;
import com.beautycenter.beautycenter.repositories.PromoRepository;
import com.beautycenter.beautycenter.service.EmailService;

//oggetto creato da spring
@Component
public class DataLoadRunner implements CommandLineRunner {

    @Autowired
    ListServicesRepository listServicesRepository;

    @Autowired
    PromoRepository promoRepository;

    @Autowired
    EmailService emailService;

    @Override
    public void run(String... args) throws Exception {

        ListServices face1 = new ListServices("Viso", "Pulizia viso", 30.00);
        ListServices face2 = new ListServices("Viso", "Trattamento Antiage", 45.00);
        ListServices face3 = new ListServices("Viso", "Trattamento viso Goji", 60.00);
        ListServices face4 = new ListServices("Viso", "Laminazione ciglia", 40.00);
        ListServices face5 = new ListServices("Viso", "Trattamento contorno occhi", 35.00);
        ListServices face6 = new ListServices("Viso", "Sopracciglia e baffetti", 10.00);

        listServicesRepository.save(face1);
        listServicesRepository.save(face2);
        listServicesRepository.save(face3);
        listServicesRepository.save(face4);
        listServicesRepository.save(face5);
        listServicesRepository.save(face6);

        ListServices body1 = new ListServices("Corpo", "Scrub/peeling corpo", 50.00);
        ListServices body2 = new ListServices("Corpo", "Trattamento anticellulite (25 min)", 55.00);
        ListServices body3 = new ListServices("Corpo", "Scrub corpo", 45.00);
        ListServices body4 = new ListServices("Corpo", "Pressoterapia", 80.00);
        ListServices body5 = new ListServices("Corpo", "Ianoforesi corpo", 55.00);
        ListServices body6 = new ListServices("Corpo", "Alghe brune", 30.00);

        listServicesRepository.save(body1);
        listServicesRepository.save(body2);
        listServicesRepository.save(body3);
        listServicesRepository.save(body4);
        listServicesRepository.save(body5);
        listServicesRepository.save(body6);

        ListServices massage1 = new ListServices("Massaggi", "Massaggio relax (50 min)", 45.00);
        ListServices massage2 = new ListServices("Massaggi", "Massaggio decontratturante (30 min)", 50.00);
        ListServices massage3 = new ListServices("Massaggi", "Massaggio emolinfatico (30 min)", 65.00);
        ListServices massage4 = new ListServices("Massaggi", "Massaggio hot stone (60 min)", 50.00);
        ListServices massage5 = new ListServices("Massaggi", "Massaggio modelling (40 min)", 55.00);
        ListServices massage6 = new ListServices("Massaggi", "Massaggio circolatorio (20 min)", 60.00);

        listServicesRepository.save(massage1);
        listServicesRepository.save(massage2);
        listServicesRepository.save(massage3);
        listServicesRepository.save(massage4);
        listServicesRepository.save(massage5);
        listServicesRepository.save(massage6);

        ListServices solarium1 = new ListServices("Solarium", "Doccia solare (10 min)", 10.00);
        ListServices solarium2 = new ListServices("Solarium", "Abbronzatura semipermanente (3 sedute)", 40.00);
        ListServices solarium3 = new ListServices("Solarium", "Lampada al collagene (15 min)", 10.00);
        ListServices solarium4 = new ListServices("Solarium", "Lettino solare (10 min)", 15.00);
        ListServices solarium5 = new ListServices("Solarium", "Lampada trifacciale (10 min)", 8.00);
        ListServices solarium6 = new ListServices("Solarium", "Abbronzatura spray (a zona)", 8.00);

        listServicesRepository.save(solarium1);
        listServicesRepository.save(solarium2);
        listServicesRepository.save(solarium3);
        listServicesRepository.save(solarium4);
        listServicesRepository.save(solarium5);
        listServicesRepository.save(solarium6);

        // MODIFICA LISTA CON PRODOTTI
        // promo uomo
        List<ListServices> promoMan = new ArrayList<>();
        promoMan.add(massage1);
        promoMan.add(body4);
        promoMan.add(solarium1);

        Promo promo1 = new Promo("Promo Uomo", promoMan, 108.00);
        promoRepository.save(promo1);

        // promo donna
        List<ListServices> promoWoman = new ArrayList<>();
        promoWoman.add(face1);
        promoWoman.add(body3);
        promoWoman.add(massage5);

        Promo promo2 = new Promo("Promo Donna", promoWoman, 104.00);
        promoRepository.save(promo2);

        // promo coppia
        List<ListServices> promoCouple = new ArrayList<>();
        promoCouple.add(face5);
        promoCouple.add(body6);
        promoCouple.add(solarium3);

        Promo promo3 = new Promo("Promo Coppia", promoCouple, 127.50);
        promoRepository.save(promo3);

    }

}
