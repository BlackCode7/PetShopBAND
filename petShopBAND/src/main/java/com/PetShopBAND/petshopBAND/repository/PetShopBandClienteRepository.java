package com.PetShopBAND.petshopBAND.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PetShopBAND.petshopBAND.model.PetShopBandCliente;

@Repository
public interface PetShopBandClienteRepository extends JpaRepository<PetShopBandCliente, Integer>{

}
