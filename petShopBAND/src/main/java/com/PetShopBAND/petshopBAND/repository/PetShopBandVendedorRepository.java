package com.PetShopBAND.petshopBAND.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PetShopBAND.petshopBAND.model.PetShopBandVendedor;


public interface PetShopBandVendedorRepository extends JpaRepository<PetShopBandVendedor, UUID>{

}
