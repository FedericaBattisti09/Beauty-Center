package com.beautycenter.beautycenter.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beautycenter.beautycenter.model.Promo;
import com.beautycenter.beautycenter.repositories.PromoRepository;

@Service
public class PromoService {
    @Autowired
    private PromoRepository promoRepository;

    public List<Promo> findAllPromo(){
        return promoRepository.findAll();
    }
    public Promo findPromoById(long id){
        Optional<Promo> promoOpt=promoRepository.findById(id);
        if (promoOpt.isPresent()) {
            return promoOpt.get();
        }
        return null;
    
    }
    public Promo savePromo(Promo newPromo){
        return promoRepository.save(newPromo);
    }
    
    public Promo getPromoByTypePromo( String typePromo){
        return promoRepository.findAllPromoBytypePromo(typePromo);
      
      }

    public Promo updatePromo(Promo promoUpdated){
        Promo oldPromo = promoRepository.findById(promoUpdated.getId()).get();
        oldPromo.setTypePromo(promoUpdated.getTypePromo());
        oldPromo.setServices(promoUpdated.getServices());
        oldPromo.setPriceToDiscount(promoUpdated.getPriceToDiscount());
        return promoRepository.save(oldPromo);
    }

    public void deletePromoById(long id){
        promoRepository.deleteById(id);
    
    }
    
}
