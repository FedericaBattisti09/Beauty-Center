package com.beautycenter.beautycenter.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // definisce che una classe può essere mappata a una tabella
@Data
@NoArgsConstructor // genera costruttore vuoto

public class Email {
//Auto specifica il modo in cui il valore dell’id è generato
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String email;

    public Email(String email) {
        this.email = email;
    }
}
