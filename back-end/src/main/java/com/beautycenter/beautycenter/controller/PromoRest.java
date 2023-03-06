package com.beautycenter.beautycenter.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.beautycenter.beautycenter.model.Promo;
import com.beautycenter.beautycenter.service.PromoService;

@RestController
@RequestMapping("/api/promo")
@CrossOrigin

public class PromoRest {

    @Autowired
     PromoService promoService;

    @PostMapping("/promos")
    public ResponseEntity<Promo> createPromo(@RequestBody Promo newPromo) {
       return new ResponseEntity<>(promoService.savePromo(newPromo), HttpStatus.CREATED);
    }

    @GetMapping("/promos")
    public ResponseEntity<List<Promo>> getAllPromo(){
        return new ResponseEntity<>(promoService.findAllPromo(), HttpStatus.OK);
    }
    @GetMapping("/typePromo/{typePromo}")
    public ResponseEntity<Promo> getAllPromoByTypePromo(@PathVariable String typePromo){
        return new ResponseEntity<>(promoService.getPromoByTypePromo(typePromo), HttpStatus.OK);
    } 
    
    
    @GetMapping("/promos/{id}")
    public ResponseEntity<Promo> getPromoById(@PathVariable long id) {
       return new ResponseEntity<>(promoService.findPromoById(id), HttpStatus.OK);
    }
 
    @DeleteMapping("/promos/{id}")
    public ResponseEntity<String> deletePromoById(@PathVariable long id) {
        promoService.deletePromoById(id);
       return new ResponseEntity<>("Promo succesfully deleted", HttpStatus.OK);
    }
 
    @PutMapping("/promos/{id}")
    public ResponseEntity<Promo> updatePromo(@PathVariable long id, @RequestBody Promo newPromo) {
       return new ResponseEntity<>(promoService.updatePromo(newPromo), HttpStatus.OK);
    }
}

