package com.beautycenter.beautycenter.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.beautycenter.beautycenter.model.ListServices;
import com.beautycenter.beautycenter.repositories.ListServicesRepository;

@Service
public class ListServicesService {

    @Autowired
    private ListServicesRepository listServicesRepository;

    public List<ListServices> findAllListServices(){
        return listServicesRepository.findAll();
    }

    public List<ListServices> getListServicesByCategory( String category){
      return listServicesRepository.findAllListServicesByCategory(category);
    
    }

    //cerca il servizio per Id  se esisti me lo ritorni altrimenti niente
    public ListServices findListServicesById(long id){
        Optional<ListServices> listServicesOpt=listServicesRepository.findById(id);
        if (listServicesOpt.isPresent()) {
            return listServicesOpt.get();
        }
        return null;
    
    }

    public ListServices saveListServices(ListServices newListServices){
        return listServicesRepository.save(newListServices);
    }


    public ListServices updateListServices(ListServices listSUpdated){
        ListServices oldListServices = listServicesRepository.findById(listSUpdated.getId()).get();
        oldListServices.setCategory(listSUpdated.getCategory());
        oldListServices.setService(listSUpdated.getService());
        oldListServices.setPrice(listSUpdated.getPrice());
        return listServicesRepository.save(oldListServices);
    }

    public void deleteListServicesById(long id){
        listServicesRepository.deleteById(id);
    
    }
    
}
