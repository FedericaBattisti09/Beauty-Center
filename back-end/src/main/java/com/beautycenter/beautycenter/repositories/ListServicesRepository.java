package com.beautycenter.beautycenter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beautycenter.beautycenter.model.ListServices;

public interface ListServicesRepository extends JpaRepository<ListServices, Long>{
    
    public List<ListServices> findAllListServicesByCategory(String category);
}
