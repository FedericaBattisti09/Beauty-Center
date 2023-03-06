package com.beautycenter.beautycenter.model;

import java.util.List;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Promo {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String typePromo;

    @ManyToMany
    private List<ListServices> services;

    @Column
    private double priceToDiscount;

    public Promo(String typePromo, List<ListServices> services, double priceToDiscount) {
        this.typePromo = typePromo;
        this.services = services;
        this.priceToDiscount = priceToDiscount;
    }

}
