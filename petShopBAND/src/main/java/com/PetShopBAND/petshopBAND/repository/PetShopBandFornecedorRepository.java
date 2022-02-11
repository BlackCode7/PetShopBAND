package com.PetShopBAND.petshopBAND.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PetShopBAND.petshopBAND.model.PetShopBandFornecedor;

@Repository
public interface PetShopBandFornecedorRepository extends JpaRepository<PetShopBandFornecedor, UUID>{

}
