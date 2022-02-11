package com.PetShopBAND.petshopBAND.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PetShopBAND.petshopBAND.model.PetShopBandVendedor;

@Repository
public interface PetShopBandVendedorRepository extends JpaRepository<PetShopBandVendedor, UUID>{

}
