package com.beautycenter.beautycenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beautycenter.beautycenter.model.Email;

//è sufficiente definire solo l’interfaccia, sarà Spring Data ad occuparsi di implementare i metodi necessari per le principali operazioni di persistenza
public interface EmailRepository extends JpaRepository<Email, Long> {

    public Email findByEmail(String email);

}
// JPA repository( contiene di default i nostri metodi crud sulle entity) e specifichiamo quale è la entity che ci interessa e l'id di che tipologia è