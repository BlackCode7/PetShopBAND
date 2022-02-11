package com.PetShopBAND.petshopBAND.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PetShopBAND.petshopBAND.model.PetShopBandVendas;

@Repository
public interface PetShopBandVendasRepository extends JpaRepository<PetShopBandVendas, UUID>{

}
