package com.PetShopBAND.petshopBAND.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PetShopBAND.petshopBAND.model.PetShopBandCliente;

public interface PetShopBandClienteRepository extends JpaRepository<PetShopBandCliente, UUID>{

}
