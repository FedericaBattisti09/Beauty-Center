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
import com.beautycenter.beautycenter.model.ListServices;
import com.beautycenter.beautycenter.service.ListServicesService;

@RestController
@RequestMapping("/api/listservices")
@CrossOrigin 

//RequestBody viene inserito quando la richiesta si effettua nel corpo del path
//PathVariable viene inserito quando facciamo una richiesta specifica tipo /{id} /{typepromo}

public class ListServicesRest {
//  Autowured crea l'istanza di una classe senza doverla ricreare ogni volta
    @Autowired
     ListServicesService listServicesService;

    @PostMapping("/services")
    public ResponseEntity<ListServices> createListServices(@RequestBody ListServices newListServices) {
       return new ResponseEntity<>(listServicesService.saveListServices(newListServices), HttpStatus.CREATED);
    }

    @GetMapping("/services")
    public ResponseEntity<List<ListServices>> getAllListServices(){
        return new ResponseEntity<>(listServicesService.findAllListServices(), HttpStatus.OK);
    } 

    @GetMapping("/category/{category}")
    public ResponseEntity<List<ListServices>> getAllListServicesByCategory(@PathVariable String category){
        return new ResponseEntity<>(listServicesService.getListServicesByCategory(category), HttpStatus.OK);
    } 

    @GetMapping("/services/{id}")
    public ResponseEntity<ListServices> getListServicesById(@PathVariable long id) {
       return new ResponseEntity<>(listServicesService.findListServicesById(id), HttpStatus.OK);
    }
 
    @DeleteMapping("/services/{id}")
    public ResponseEntity<String> deleteListServicesById(@PathVariable long id) {
        listServicesService.deleteListServicesById(id);
       return new ResponseEntity<>("Service succesfully deleted", HttpStatus.OK);
    }
 
    @PutMapping("/services/{id}")
    public ResponseEntity<ListServices> updateListServices(@PathVariable long id, @RequestBody ListServices newListServices) {
       return new ResponseEntity<>(listServicesService.updateListServices( newListServices), HttpStatus.OK);
    }
}



