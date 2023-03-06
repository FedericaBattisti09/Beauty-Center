package com.beautycenter.beautycenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beautycenter.beautycenter.model.Email;
import com.beautycenter.beautycenter.service.EmailService;

//  è un bean e in grado di gestire le request e le response in modalità REST
@RestController
// Per mappare uno o più path di una URL
@RequestMapping("/api/email")
@CrossOrigin
public class EmailRest {

    @Autowired
    EmailService emailService;

    @GetMapping("/email")
    public ResponseEntity<List<Email>> getAllEmail() {
        return new ResponseEntity<>(emailService.getAllEmail(), HttpStatus.OK);
    }

    @PostMapping("/email")
    public ResponseEntity<Email> createEmail(@RequestBody Email email) {

        if (emailService.createEmail(email) == null) {

            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        }
        // Bad request il server non può elaborare la richiesta
        return new ResponseEntity<>(emailService.createEmail(email), HttpStatus.CREATED);
    }

}
