package com.beautycenter.beautycenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beautycenter.beautycenter.model.Email;
import com.beautycenter.beautycenter.repositories.EmailRepository;

// Service richiamiamo i metodi che ci servono da JPARepository e ci permette di fare controlli sopra
@Service
public class EmailService {
    // autowired ci permette di indicare i metodi della classe senza doverli istanziare
    @Autowired
    EmailRepository emailRepository;

    public List<Email> getAllEmail() {
        return emailRepository.findAll();
    }

    public Email createEmail(Email email) {

        if (emailRepository.findByEmail(email.getEmail()) == null) {
            return emailRepository.save(email);
        }
        return null;
    }
}
