package com.beautycenter.beautycenter.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //genera costruttore vuoto
@AllArgsConstructor //genera costruttore con dentro tutto compreso id
@Entity //definisce che una classe può essere mappata a una tabella
public class ListServices {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    public String category;

    @Column
    private String service;

    @Column
    private double price;

    public ListServices(String category, String service, double price) {
        this.category = category;
        this.service = service;
        this.price = price;
    }
   
}
