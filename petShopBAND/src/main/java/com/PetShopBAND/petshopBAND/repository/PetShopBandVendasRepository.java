package com.PetShopBAND.petshopBAND.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PetShopBAND.petshopBAND.model.PetShopBandVendas;


public interface PetShopBandVendasRepository extends JpaRepository<PetShopBandVendas, UUID>{

}
