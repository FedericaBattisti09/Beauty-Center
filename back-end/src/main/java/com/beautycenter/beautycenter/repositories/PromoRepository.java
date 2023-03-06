package com.beautycenter.beautycenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beautycenter.beautycenter.model.Promo;

public interface PromoRepository extends JpaRepository<Promo, Long> {

    public Promo findAllPromoBytypePromo(String typePromo);
}
